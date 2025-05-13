FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/*.jar demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
