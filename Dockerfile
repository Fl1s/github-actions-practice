FROM openjdk:17
EXPOSE 8080
ADD  build/libs/spring-images-new.jar spring-images-new.jar
ENTRYPOINT ["java", "-jar", "/spring-images-new.jar"]