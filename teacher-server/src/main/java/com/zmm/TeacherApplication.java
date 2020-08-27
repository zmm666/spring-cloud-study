package com.zmm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class TeacherApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeacherApplication.class,args);
    }

    //适用ribbon的方式，需加此注解
    @LoadBalanced
    @Bean("ribbonRestTemplate")
    public RestTemplate initRestTemplate2 () {
        return new RestTemplate();
    }

    @Bean("restTemplate")
    public RestTemplate initRestTemplate () {
        return new RestTemplate();
    }
}
