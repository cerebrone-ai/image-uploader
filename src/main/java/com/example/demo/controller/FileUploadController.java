package com.example.demo.controller;

import com.example.demo.service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class FileUploadController {

    @Autowired
    private S3Service s3Service;

    @GetMapping("/upload")
    public String getUploadPage() {
        return "upload";
    }

    @PostMapping("/upload")
    public String handleFileUpload(Model model, MultipartFile file) {
        try {
            String key = s3Service.uploadFile(file);
            model.addAttribute("message", "File uploaded successfully: " + key);
        } catch (IOException e) {
            model.addAttribute("message", "File upload failed: " + e.getMessage());
        }
        return "upload";
    }
}
