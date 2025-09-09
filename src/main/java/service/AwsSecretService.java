package service;

import org.springframework.stereotype.Service;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;

@Service
public class AwsSecretService {

    private final SecretsManagerClient client;

    public AwsSecretService() {
        this.client = SecretsManagerClient.builder()
                .region(Region.US_EAST_1) // ✅ change if your secret is in another region
                .build();
    }

    public String getSecret() {
        String secretName = "rds!db-71936cae-ff66-418e-88f0-5ca8cc77e668";

        GetSecretValueRequest request = GetSecretValueRequest.builder()
                .secretId(secretName)
                .build();

        GetSecretValueResponse response = client.getSecretValue(request);

        return response.secretString(); // usually JSON (username, password, host, port)
    }
}

