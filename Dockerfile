FROM openjdk:17-jdk-slim

COPY ./target/spring-boot-data-mongodb-0.0.1-SNAPSHOT.jar devops-app.jar

EXPOSE 9393

ENTRYPOINT ["java","-jar","/devops-app.jar"]
