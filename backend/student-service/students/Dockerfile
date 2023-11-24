FROM eclipse-temurin:17.0.9_9-jdk-ubi9-minimal
COPY out/artifacts/students_jar/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]