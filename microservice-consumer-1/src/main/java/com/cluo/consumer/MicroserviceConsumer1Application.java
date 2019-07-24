package com.cluo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients  //开启Feign注解功能
@EnableHystrix  //开启Hystrix断路器注解功能
public class MicroserviceConsumer1Application {

    public static void main(String[] args) {

        SpringApplication.run(MicroserviceConsumer1Application.class, args);
    }

}
