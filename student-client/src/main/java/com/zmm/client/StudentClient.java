package com.zmm.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("student-server")
public interface StudentClient {

    @GetMapping("/dc")
    String dc();

}
