package com.mderyol.demo.rabbitmq.controller;
import com.mderyol.demo.rabbitmq.service.MessageProducer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
@AllArgsConstructor
public class MessageController {
    private final MessageProducer messageProducer;

    @PostMapping
    public void sendMessage(@RequestBody String message) {
        messageProducer.sendMessage(message);
    }
}

