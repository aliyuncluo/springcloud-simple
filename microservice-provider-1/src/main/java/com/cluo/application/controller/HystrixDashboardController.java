package com.cluo.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author luolei
 * @Date 2019/7/24 9:51
 */
@RestController
public class HystrixDashboardController {

    @GetMapping("/get/dashboard")
    public List<String> getDashBoardData(){
        List<String> list = new ArrayList<>();
        list.add("hystrix dashboard");
        return list;
    }
}
