package com.cluo.consumer.service.impl;

import com.cluo.consumer.service.HystrixFeignService;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * @Author luolei
 * @Date 2019/7/23 17:49
 */
@Component
public class HystrixFeignServiceImpl implements HystrixFeignService {
    @Override
    public String getUser(String username) {
        //return "The user does not exist in this system,please confirm username";
        String string=null;
        try {
            string = new String("网络故障,请求超时".getBytes("utf-8"),"iso-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return string;
    }
}
