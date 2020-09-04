package com.zmm.controller;

import com.zmm.client.StudentClient;
import com.zmm.pojo.StudentResultVo;
import com.zmm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController implements StudentClient {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private StudentService studentService;

    @GetMapping("/dc")
    public String dc() {
        //测试断路器开启
        //Thread.sleep(5000l);
        //获取服务清单
        String services = "2001 ===> Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @Override
    public List<StudentResultVo> search() {
        return studentService.search();
    }
}
