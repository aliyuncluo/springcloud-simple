package com.cluo.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author luolei
 * @Date 2019/7/23 14:12
 */
@Service
@FeignClient(value = "MICROSERVICE-PROVIDER")
public interface FileDownloadService {

    @PostMapping(value = "/fileDownload/server")
    public ResponseEntity<byte[]> fileDownload(@RequestParam("filepath") String filepath);
}
