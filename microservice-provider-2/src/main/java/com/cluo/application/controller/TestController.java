package com.cluo.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author luolei
 * @Date 2019/7/22 11:32
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "this is provider-2";
    }
}
