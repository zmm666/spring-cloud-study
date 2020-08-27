package com.zmm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulController {

    @GetMapping("/hello")
    public String dc () {
        return "Hello World!";
    }
}
