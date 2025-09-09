package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import service.AwsSecretService;

@RestController
public class SecretController {

    private final AwsSecretService secretService;

    public SecretController(AwsSecretService secretService) {
        this.secretService = secretService;
    }

    @GetMapping("/secret")
    public String getSecret() {
        return secretService.getSecret();
    }
}
