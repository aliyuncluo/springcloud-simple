package com.cluo.consumer.controller;

import com.cluo.consumer.service.FileUploadFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author luolei
 * @Date 2019/7/22 16:24
 */
@RestController
public class FileUploadController {

    @Autowired
    private FileUploadFeignService fileUploadFeignService;

    @LoadBalanced
    @PostMapping(value = "/feign/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String uploadFile(@RequestPart("file") MultipartFile file){
        return fileUploadFeignService.fileUpload(file);
    }
}
