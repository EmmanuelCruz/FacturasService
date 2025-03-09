FROM docker.io/openjdk:17-oracle
LABEL maintainer="Emmanuel Cruz Hernández"
EXPOSE 8081
ARG JAR_FILE=target/*.jar
COPY target/facturas-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "/app.jar"]
