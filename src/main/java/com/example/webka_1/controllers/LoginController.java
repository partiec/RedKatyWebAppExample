package com.example.webka_1.controllers;

import com.example.webka_1.processors.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private LoginProcessor loginProcessor;

    public  LoginController(LoginProcessor loginProcessor){
        this.loginProcessor = loginProcessor;
    }
    @GetMapping("/")
    public String getRequest(){
        return "login.html";
    }

    @PostMapping("/")
    public String postRequest(Model model,
                              @RequestParam String name,
                              @RequestParam String password){
        boolean isCorrect = loginProcessor.isNameAndPasswordCorrect(name,password);
        if (isCorrect){
            model.addAttribute("message", "it's OK!");
        }
        else
            model.addAttribute("message", "Not correct!");

        return "login.html";
    }
}
