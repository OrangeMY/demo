package com.cheng.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping(value = "/test")
public class testController {

    @GetMapping("/get")
    public String hello() {
        return "i am chengmy";
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam MultipartFile myFile, HttpServletRequest request) throws IOException {
        if (myFile == null || myFile.isEmpty()) {
            return "文件未上传";
        }
        // 获取图片原始名称
        String fileName = myFile.getOriginalFilename();
        String extensionName = fileName.substring(fileName.lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString();
        myFile.transferTo(new File("/Users/chengmingyang/Desktop/" + newFileName + extensionName));
        return "uploadSuccess";
    }

    @GetMapping("/download")
    public String download(String fileName, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setHeader("Context-Disposition", "attachment; fieName=" + fileName);
        String path = request.getServletContext().getRealPath("");
        File downLoadFile = new File(path, fileName);
        if (!downLoadFile.exists()) {
            request.setAttribute("msg", "文件不存在");
            response.sendError(404);
            return "文件不存在";
        }
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(FileUtils.readFileToByteArray(downLoadFile));
        outputStream.close();
        return "下载成功";
    }
}
