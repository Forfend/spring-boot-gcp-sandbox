package com.sandbox.springbootgcpsandbox.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthz")
public class HealthCheck {

    @GetMapping
    public String status() {
        return "Running";
    }
}
