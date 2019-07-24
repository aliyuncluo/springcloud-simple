package com.cluo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProvider1Application.class, args);
    }

}
