package com.example.demo3.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class indexController {
    @GetMapping("/")
    public String hello(){
        return "Hello!!";


    }
}
