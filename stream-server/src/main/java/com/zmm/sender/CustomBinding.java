package com.zmm.sender;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface CustomBinding {

    String INPUT1 = "input1";
    String OUTPUT1 = "output1";

    @Input
    SubscribableChannel input1();

    @Output
    MessageChannel output1();

}
