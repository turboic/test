package com.example.test.controller;

import com.example.test.config.WebInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private WebInfo webinfo;

    @RequestMapping("/app")
    public String test(){
        return "测试docker和jenkins的持续化自动部署方案";
    }

    @RequestMapping("/webinfo")
    public String webinfo(){
        String path = "/test/app";
        return webinfo.getUrl(path);
    }

}
