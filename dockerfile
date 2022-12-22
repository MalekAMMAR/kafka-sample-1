FROM openjdk:8

EXPOSE 8087

ADD target/kafka-sample.jar kafka-sample.jar
ENTRYPOINT ["java","-jar","kafka-sample.jar"]