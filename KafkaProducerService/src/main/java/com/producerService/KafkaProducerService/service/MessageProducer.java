package com.producerService.KafkaProducerService.service;

public interface MessageProducer {

    public void sendMessage(String topic, String message);

    public void sendStudentMessage(String topic, String message);
}
