package com.zmm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ScoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoreApplication.class,args);
    }
}
