FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/api-gateway-*.jar app.jar
EXPOSE 9093
ENTRYPOINT ["java", "-jar", "app.jar"]