FROM openjdk:11-ea-11-jdk

EXPOSE ${CCY_EXCHANGE_SERVER_PORT}

COPY /target/ccy-exchange-microservice-0.0.1-SNAPSHOT.jar /home/ccy-exchange-microservice-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar",  "/home/ccy-exchange-microservice-0.0.1-SNAPSHOT.jar", "--server.port=${CCY_EXCHANGE_SERVER_PORT}", "-DCCY_CONVERSION_SERVICE=${CCY_CONVERSION_SERVICE}"]
