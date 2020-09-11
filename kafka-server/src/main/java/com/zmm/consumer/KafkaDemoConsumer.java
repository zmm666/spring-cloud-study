package com.zmm.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaDemoConsumer {

    @KafkaListener(topics = {"${kafka.demo.topic}"})
    public void consumer (ConsumerRecord<String,String> record) {
        System.err.println(record.topic() + " : ======> " + record.value());
    }
}
