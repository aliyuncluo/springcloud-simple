package com.cluo.consumer.service;

import com.cluo.consumer.configuration.FeignMultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传Feign
 * @Author luolei
 * @Date 2019/7/22 16:01
 */
@Service
@FeignClient(value = "MICROSERVICE-PROVIDER",configuration = FeignMultipartSupportConfig.class)
public interface FileUploadFeignService {

    @RequestMapping(value = "/uploadFile/server",method = RequestMethod.POST,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String fileUpload(@RequestPart(value = "file") MultipartFile file);
}
