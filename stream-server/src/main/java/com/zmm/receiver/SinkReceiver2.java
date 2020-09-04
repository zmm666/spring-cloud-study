package com.zmm.receiver;

import com.zmm.sender.CustomBinding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * 消费者
 */
@Component
public class SinkReceiver2 {

    @Value("${server.port}")
    private String port;

    private static Logger logger = LoggerFactory.getLogger(SinkReceiver2.class);

    @StreamListener(CustomBinding.INPUT1)
    public void receive(Object payload) {
        logger.info(port + "Received2: " + payload);
    }

}
