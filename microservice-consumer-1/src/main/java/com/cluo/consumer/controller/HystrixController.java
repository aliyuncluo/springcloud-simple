package com.cluo.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author luolei
 * @Date 2019/7/23 17:30
 */
@RestController
public class HystrixController {
    /**
     * @HystrixCommand和fallback服务的降级
     * 注意：fallbackMethod中指定出错调用的方法
     * @param name
     * @return
     */
    @GetMapping("/test/user")
    @HystrixCommand(fallbackMethod = "defaultUser")
    public String getUser(String name){
        if(name.equals("spring")){
            return "this is springcloud";
        }else{
            throw new RuntimeException();
        }
    }

    /**
     * 出错则调用该方法
     * 注意：该方法要与原@HystrixCommand标注的方法保持一致，除了方法名不同以外。即传入的参数名称，类型和返回值的类型都要保持一致。
     * @param name
     * @return
     */
    public String defaultUser(String name){
        return "this is not a normal username";
    }
}
