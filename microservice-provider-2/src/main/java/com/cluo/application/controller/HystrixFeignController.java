package com.cluo.application.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author luolei
 * @Date 2019/7/24 8:42
 */
@RestController
public class HystrixFeignController {

    private Logger logger = LoggerFactory.getLogger(HystrixFeignController.class);

    @GetMapping("/feign/hystrix")
    public String getUser(@RequestParam("username") String username){
        logger.info("===进入provider2===");
        if(username.equals("spring")){
            return "this is provider2 user";
        }else{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
