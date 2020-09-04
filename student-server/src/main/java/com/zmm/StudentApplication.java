package com.zmm;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

//适用于多种注册中心  @EnableEurekaClient只适用于eureka
@EnableDiscoveryClient
@MapperScan("com.zmm.mapper")
@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(StudentApplication.class).web(true).run(args);
    }
}
