# Loan Application Microservice

This project demonstrates a simple Loan Application system using Spring Boot microservices architecture. It includes service discovery with Eureka and API Gateway routing.

---

## Project Structure

- `eureka-server/` - Eureka Discovery Server
- `api-gateway/` - Spring Cloud API Gateway
- `loan-service/` - Loan Service (CRUD microservice)

---

## Prerequisites

- Java 17+
- Maven 3.8+
- (Optional) IDE like VS Code or IntelliJ

---

## Step-by-Step Setup

### 1. Clone the Repository

```sh
git clone <your-repo-url>
cd loan-application-microservice
```

---

### 2. Build All Projects

Build each module using Maven:

```sh
cd eureka-server
mvn clean install
cd ../api-gateway
mvn clean install
cd ../loan-service
mvn clean install
cd ..
```

---

### 3. Start Eureka Discovery Server

```sh
cd eureka-server
mvn spring-boot:run
```

- Eureka dashboard will be available at [http://localhost:8761](http://localhost:8761)

---

### 4. Start Loan Service

Open a new terminal:

```sh
cd loan-service
mvn spring-boot:run
```

- The service will register itself with Eureka at startup.
- Runs on [http://localhost:8080](http://localhost:8080)

---

### 5. Start API Gateway

Open another terminal:

```sh
cd api-gateway
mvn spring-boot:run
```

- Gateway runs on [http://localhost:9093](http://localhost:9093)

---

### 6. Test the Setup

#### a. Check Eureka Dashboard

- Visit [http://localhost:8761](http://localhost:8761)
- You should see `loan-service` and `API-Gateway` registered.

#### b. Access Loan Service via API Gateway

- Test endpoint (through gateway):

  ```
  GET http://localhost:9093/api/loan/info
  ```

- You should receive a response like:

  ```json
  ["Sample Loan 1", "Sample Loan 2"]
  ```

---

## Configuration Files

- **Eureka Server:** [`eureka-server/src/main/resources/application.yml`](eureka-server/src/main/resources/application.yml)
- **API Gateway:** [`api-gateway/src/main/resources/application.yml`](api-gateway/src/main/resources/application.yml)
- **Loan Service:** [`loan-service/src/main/resources/application.yml`](loan-service/src/main/resources/application.yml)

---

## Useful Commands

- **Build:** `mvn clean install`
- **Run:** `mvn spring-boot:run`
- **Test:** `mvn test`

---

## Notes

- The project uses H2 in-memory database for demonstration.
- Modify or extend the [`LoanController`](loan-service/src/main/java/com/example/loanservice/controller/LoanController.java) and related classes for more features.
- All services are configured for local development.

---

## Troubleshooting

- Ensure all ports (`8761`, `8080`, `9093`) are free before starting services.
- If a service fails to register with Eureka, check the `application.yml` configuration and network connectivity.

---

## References

- [Spring Cloud Netflix Eureka](https://cloud.spring.io/spring-cloud-netflix/reference/html/)
-