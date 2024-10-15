package com.producerService.KafkaProducerService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MessageProducerImple implements MessageProducer{

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }


    public void sendStudentMessage(String topic,String message){
        System.out.println("SENDING STUDENT MESSAGE..."+topic);
        kafkaTemplate.send(topic,message);
        System.out.println("MESSAGE REPLIED...");
    }


}