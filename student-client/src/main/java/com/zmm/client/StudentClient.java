package com.zmm.client;

import com.zmm.pojo.StudentResultVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("student-server")
public interface StudentClient {

    @GetMapping("/dc")
    String dc();

    @GetMapping("/student/search")
    List<StudentResultVo> search();

}
