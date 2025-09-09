

# Spring Boot + AWS Secrets Manager Example

This project demonstrates how to fetch secrets from **AWS Secrets Manager** in a Spring Boot 3 application.  
It also includes basic **Spring Security** configuration and a REST endpoint to expose the secret.

---

## 🚀 Features
- Java 17
- Spring Boot 3
- Spring Security
- AWS SDK v2 (Secrets Manager)
- Configurable via `application.properties`

---

## ⚙️ Prerequisites
1. **Java 17+**
2. **Maven 3.8+**
3. **AWS CLI** installed and configured:
   ```bash
   aws configure

src/main/java/com/example
 ├── SecurityConfig.java      # Spring Security config
 ├── SecretService.java       # Service to fetch secrets from AWS
 ├── SecretController.java    # REST API to expose secret
src/main/resources
 └── application.properties   # AWS config


aws.region=us-east-1
aws.secret.name=give yours secret name
<img width="959" height="422" alt="image" src="https://github.com/user-attachments/assets/7f463822-4b58-4db9-b96c-627fd9158897" />

GET http://localhost:8082/secret
<img width="799" height="473" alt="image" src="https://github.com/user-attachments/assets/b8b25040-5361-475c-a88e-f8d4105c09ab" />


