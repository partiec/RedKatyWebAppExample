package com.example.webka_1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestControllerExample {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hi !";
    }

    @GetMapping("/by")
    @ResponseBody
    public String by(){
        return "by !";
    }
}
