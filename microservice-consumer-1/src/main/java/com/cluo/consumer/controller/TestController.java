package com.cluo.consumer.controller;

import com.cluo.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author luolei
 * @Date 2019/7/22 11:34
 */
@RestController
public class TestController {


    @Autowired
    private TestService testService;

    @LoadBalanced
    @GetMapping("/test/index")
    public String test(){
        return testService.test();
    }
}
