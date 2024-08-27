# define base docker image
FROM openjdk:17
LABEL maintainer="springbootdocker.example"
ADD springboot-docker-demo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]