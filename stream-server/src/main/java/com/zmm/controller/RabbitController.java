package com.zmm.controller;

import com.zmm.sender.SinkSender;
import com.zmm.sender.SinkSender2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {

    @Autowired
    private SinkSender sinkSender;
    @Autowired
    private SinkSender2 sinkSender2;

    @GetMapping("/rabbit/send/msg")
    public String sendMsg () {
        sinkSender.run();
        sinkSender2.run();
        return "success";
    }
}
