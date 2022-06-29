FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-docker.jar test
ENTRYPOINT ["java", "-jar", "/test"]
