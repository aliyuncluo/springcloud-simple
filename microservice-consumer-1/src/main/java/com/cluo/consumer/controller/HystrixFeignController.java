package com.cluo.consumer.controller;

import com.cluo.consumer.service.HystrixFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author luolei
 * @Date 2019/7/23 17:47
 */
@RestController
public class HystrixFeignController {
    @Autowired
    private HystrixFeignService hystrixFeignService;

    @GetMapping("/feign/hystrix")
    public String getUser(@RequestParam("username") String username){

        return hystrixFeignService.getUser(username);
    }
}
