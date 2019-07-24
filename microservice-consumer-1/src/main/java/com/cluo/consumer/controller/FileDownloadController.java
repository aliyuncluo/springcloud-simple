package com.cluo.consumer.controller;

import com.cluo.consumer.service.FileDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author luolei
 * @Date 2019/7/23 14:35
 */
@Controller
public class FileDownloadController {

    @Autowired
    private FileDownloadService fileDownloadService;

    @LoadBalanced
    @PostMapping(value = "/feign/download")
    public ResponseEntity<byte[]> fileDownload(@RequestParam("filepath") String filepath){
        return fileDownloadService.fileDownload(filepath);
    }
}
