package com.cluo.application.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;

/**
 * @Author luolei
 * @Date 2019/7/23 14:15
 */
@RestController
public class FileDownloadController {

    private Logger logger = LoggerFactory.getLogger(FileDownloadController.class);

    @PostMapping(value = "/fileDownload/server")
    public ResponseEntity<byte[]> fileDownload(@RequestParam("filepath") String filepath){
        logger.info("===进入文件下载服务提供者1===");
        ResponseEntity<byte[]> entity=null;
        try {
            File file = new File(filepath);
            FileInputStream fis = new FileInputStream(file);
            byte[] body = new byte[fis.available()];
            fis.read(body);

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Disposition","attchement;filename=" + new String(file.getName().getBytes("utf-8"), "iso-8859-1"));
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            HttpStatus statusCode = HttpStatus.OK;
            entity = new ResponseEntity<>(body,headers,statusCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entity;
    }
}
