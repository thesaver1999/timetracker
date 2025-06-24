package com.example.download;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DownloadController {
    @GetMapping("/api/download/installer")
    public ResponseEntity<InputStreamResource> downloadInstaller() throws IOException {
        ClassPathResource exeFile = new ClassPathResource("downloads/test.txt");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=test.txt")
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .contentLength(exeFile.contentLength())
                .body(new InputStreamResource(exeFile.getInputStream()));
    }
}
