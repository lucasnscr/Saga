FROM azul/zulu-openjdk-alpine:11
VOLUME /tmp
ARG JAR_FILE=target/shipment-service-1.0.0.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]