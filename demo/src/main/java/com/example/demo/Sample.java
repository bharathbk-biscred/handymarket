package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
    @GetMapping("/get")
    public String get(){
        return "Hello World";
    }

}
