package com.zmm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() throws InterruptedException {
        Thread.sleep(5000l);
        //获取服务清单
        String services = "2001 ===> Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
