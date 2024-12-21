FROM openjdk:21
EXPOSE 8080
ADD  target/spring-images-new.jar spring-images-new.jar
ENTRYPOINT ["java", "-jar", "/spring-images-new.jar"]