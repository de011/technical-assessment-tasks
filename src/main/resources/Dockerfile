FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/technical-assessment-task.jar /app/technical-assessment-task.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/technical-assessment-task.jar"]
