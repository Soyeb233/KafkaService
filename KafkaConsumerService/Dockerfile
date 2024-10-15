FROM openjdk:17
WORKDIR /KafkaService

COPY target/KafkaConsumerService.jar /KafkaService/KafkaConsumerService.jar

EXPOSE 8082
ENTRYPOINT ["java","-jar","KafkaConsumerService.jar"]