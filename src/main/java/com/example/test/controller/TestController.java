package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/app")
    public String test(){
        return "测试docker和jenkins的持续化自动部署方案";
    }
}
