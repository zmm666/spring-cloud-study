package com.zmm.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 生产者
 */

@Component
public class SinkSender2 {

    @Autowired
    @Qualifier(CustomBinding.OUTPUT1)
    private MessageChannel messageChannel;

    private static Logger logger = LoggerFactory.getLogger(SinkSender.class);

    //@Scheduled(cron = "0/5 * * * * ?")
    public void run () {
        Map<String, Object> headers = new HashMap<>();
        headers.put("aaa", "userTag");
        MessageHeaders messageHeaders = new MessageHeaders(headers);
        Message<String> message = MessageBuilder.createMessage("hahahahah", messageHeaders);
        this.messageChannel.send(message);
    }


}
