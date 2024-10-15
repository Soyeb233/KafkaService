package com.producerService.KafkaProducerService.controller;




import com.producerService.KafkaProducerService.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaMessageProducerController {

    @Autowired
    private MessageProducer messageProducer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        messageProducer.sendMessage("my-topic", message);
        return "Message sent: " + message;
    }

    @PostMapping("/sendStudentMessage")
    public String sendStudentMessage(@RequestParam("message") String message) {
        System.err.println("HIT HERE 26");
        messageProducer.sendStudentMessage("student-topic", message);
        return "Message sent: " + message;
    }

}
