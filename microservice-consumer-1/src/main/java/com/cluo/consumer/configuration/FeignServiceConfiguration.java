package com.cluo.consumer.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author luolei
 * @Date 2019/7/22 14:55
 */
@Configuration
public class FeignServiceConfiguration {
    /**
     * @Content 设置Feign的日志级别
     *
     * Logger.Level的具体说明如下：
     *       NONE: 不记录任何信息
     *       BASIC:仅记录请求方法、URL以及响应状态码和执行时间
     *       HEADERS:除了记录BASIC级别的信息外，还会记录请求和响应的信息
     *       FULL: 记录所有请求和响应的明细，包括头信息，请求体，元数据
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
