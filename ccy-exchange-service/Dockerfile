FROM openjdk:11-ea-11-jdk

EXPOSE ${SERVER_PORT}

COPY ./target/ccy-exchange-microservice-0.0.1-SNAPSHOT.jar /home/ccy-exchange-microservice-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar",  "/home/ccy-exchange-microservice-0.0.1-SNAPSHOT.jar", "--server.port=${SERVER_PORT}"]
