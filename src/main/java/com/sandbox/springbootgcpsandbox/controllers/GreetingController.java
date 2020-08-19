package com.sandbox.springbootgcpsandbox.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping
    public String greeting(@RequestParam String name) {
        return "Hello " + name + "!";
    }
}
