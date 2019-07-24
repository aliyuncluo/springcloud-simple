package com.cluo.application.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author luolei
 * @Date 2019/7/22 16:18
 */
@RestController
public class FileUploadController {
    private Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @Value("${spring.upload.filepath}")
    private String fileUploadPath;

    @PostMapping(value = "/uploadFile/server",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String fileUpload(@RequestPart(value = "file")MultipartFile file){
        logger.info("===进入到文件上传提供者1===");
        String originalFilename = file.getOriginalFilename();
        try {
            File uploadFile = new File(fileUploadPath+File.separator+originalFilename);
            file.transferTo(uploadFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileUploadPath+File.separator+originalFilename;
    }
}
