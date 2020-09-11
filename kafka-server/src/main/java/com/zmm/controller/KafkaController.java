package com.zmm.controller;

import com.zmm.producer.KafkaDemoProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaDemoProducer producer;

    @GetMapping("/kafka/send/msg")
    public Object sendFirstMsg (@RequestParam String topic,@RequestParam String msg) {
        return producer.sendMsg(topic,msg);
    }
}
