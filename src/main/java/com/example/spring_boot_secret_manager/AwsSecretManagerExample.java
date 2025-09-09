package com.example.spring_boot_secret_manager;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;

public class AwsSecretManagerExample {
    public static void main(String[] args) {
        String secretName = "rds!db-71936cae-ff66-418e-88f0-5ca8cc77e668";
        Region region = Region.US_EAST_1; // change if needed

        try (SecretsManagerClient client = SecretsManagerClient.builder()
                .region(region)
                .build()) {

            GetSecretValueRequest getSecretValueRequest = GetSecretValueRequest.builder()
                    .secretId(secretName)
                    .build();

            GetSecretValueResponse getSecretValueResponse = client.getSecretValue(getSecretValueRequest);

            String secret = getSecretValueResponse.secretString();
            System.out.println("Secret: " + secret);
        }
    }
}
