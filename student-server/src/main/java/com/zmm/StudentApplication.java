package com.zmm;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//适用于多种注册中心  @EnableEurekaClient只适用于eureka
@EnableDiscoveryClient
@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(StudentApplication.class).web(true).run(args);
    }
}
