package com.sandbox.springbootgcpsandbox.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class GreetingController {

    @GetMapping
    public String greeting() {
        return "Hello World!";
    }

    @GetMapping("/write")
    public ResponseEntity<String> writeRandomNumber() {
        try {
            String filePath = "/usr/share/tmp/test.txt";
            Path path = Paths.get(filePath);
            Files.createFile(path);
            Files.write(path, "This string has been written".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok("The number has been written!");
    }
}
