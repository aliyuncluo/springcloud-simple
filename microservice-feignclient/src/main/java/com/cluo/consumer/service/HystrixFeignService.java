package com.cluo.consumer.service;

import com.cluo.consumer.service.impl.HystrixFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author luolei
 * @Date 2019/7/23 17:44
 */
@Service
@FeignClient(value = "MICROSERVICE-PROVIDER",fallback = HystrixFeignServiceImpl.class)
public interface HystrixFeignService {

    @GetMapping("/feign/hystrix")
    public String getUser(@RequestParam("username") String username);
}
