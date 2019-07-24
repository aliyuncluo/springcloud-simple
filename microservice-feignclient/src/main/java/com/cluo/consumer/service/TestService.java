package com.cluo.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author luolei
 * @Date 2019/7/22 11:28
 */
@Service
@FeignClient("MICROSERVICE-PROVIDER")
public interface TestService {

    @GetMapping("/test")
    public String test();
}
