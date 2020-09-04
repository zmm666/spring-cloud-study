package com.zmm;

import com.zmm.sender.CustomBinding;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableBinding({CustomBinding.class, Source.class, Sink.class})
@SpringBootApplication
public class StreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamApplication.class,args);
    }
}
