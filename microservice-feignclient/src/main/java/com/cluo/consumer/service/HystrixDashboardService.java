package com.cluo.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author luolei
 * @Date 2019/7/24 9:47
 */
@Service
@FeignClient(value = "MICROSERVICE-PROVIDER")
public interface HystrixDashboardService {

    @GetMapping("/get/dashboard")
    public List<String> getDashBoardData();
}
