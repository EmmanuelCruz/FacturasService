FROM FROM docker.io/openjdk:17-oracle
LABEL maintainer="Emmanuel Cruz Hernández"
EXPOSE 8081
ARG JAR_FILE=target/*.jar
COPY target/*.jar app.jar
CMD ["java", "-jar", "/app.jar"]