FROM eclipse-temurin:17
LABEL maintainer="springbootdocker.example"
WORKDIR /app 
COPY /target/springboot-docker-demo-0.0.1-SNAPSHOT.jar /app/springboot-docker-demo1.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-demo1.jar"]