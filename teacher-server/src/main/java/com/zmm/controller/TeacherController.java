package com.zmm.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zmm.client.StudentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;

@RestController
public class TeacherController {

    @Value("${zmm.index}")
    private String zmmIndex;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private RestTemplate ribbonRestTemplate;
    @Autowired
    private StudentClient studentClient;

    /**
     * springcloud底层的服务之间通信
     *      需要手动拼接url，对开发人员不友好
     * @return
     */
    @GetMapping("/consumer")
    public String dc () {
        ServiceInstance serviceInstance = loadBalancerClient.choose("student-server");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }

    /**
     * 集成ribbon的方式
     *  无需手动拼接，ribbon拦截器会拦截选取url替换
     * @return
     */
    @GetMapping("/consumer-ribbon")
    public String ribbon() {
        return ribbonRestTemplate.getForObject("http://student-server/dc", String.class);
    }

    /**
     * 集成feigin的方式
     *  配置接口绑定，可插拔，非常方便
     * @return
     */
    @GetMapping("/consumer-feign")
    public String feign() {
        return studentClient.dc();
    }

    /**
     * 测试从配置中心的读取的配置
     * @return
     */
    @GetMapping("/index")
    public String index() {
        return zmmIndex;
    }

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/hystrix-ribbon")
    public String hystrixTest() {
        return consumerService.consumer();
    }

    @Component
    class ConsumerService {

        @HystrixCommand(fallbackMethod = "fallback")
        public String consumer() {
            return "hystrix ===> " + ribbonRestTemplate.getForObject("http://student-server/dc", String.class);
        }

        public String fallback() {
            return "fallback";
        }

    }
}
