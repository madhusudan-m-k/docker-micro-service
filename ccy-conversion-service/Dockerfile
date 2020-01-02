FROM openjdk:11-ea-11-jdk

EXPOSE ${SERVER_PORT:8080}

COPY ./target/ccy-conversion-microservice-0.0.1-SNAPSHOT.jar /home/ccy-conversion-microservice-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar",  "/home/ccy-conversion-microservice-0.0.1-SNAPSHOT.jar", "--server.port=${SERVER_PORT:8080}"]
