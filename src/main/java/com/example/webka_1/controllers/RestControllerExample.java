package com.example.webka_1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {

    @GetMapping("/hello")
    public String hello(){
        return "Hi !";
    }

    @GetMapping("/by")
    public String by(){
        return "by !";
    }
}
