package com.zmm.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaDemoProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public Object sendMsg (String topic,Object msg) {
        kafkaTemplate.send(topic,msg);
        return "send msg success ~ ~ ~";
    }
}
