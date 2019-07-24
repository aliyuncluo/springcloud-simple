package com.cluo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProvider2Application.class, args);
    }

}
