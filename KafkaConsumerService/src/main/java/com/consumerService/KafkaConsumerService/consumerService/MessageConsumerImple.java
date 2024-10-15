package com.consumerService.KafkaConsumerService.consumerService;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerImple implements MessageConsumer {

    @KafkaListener(topics = "my-topic", groupId = "my-group-id")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

    @KafkaListener(topics = "student-topic",groupId = "my-group-id")
    public void listenStudent(String message){
        System.err.println("Message :"+message);
        System.out.println("Received message: " + message);
    }

}
