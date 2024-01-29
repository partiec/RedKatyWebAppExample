package com.example.webka_1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedKattyController {

    @RequestMapping("/homew")
    public String home(Model model) {
        model.addAttribute("username", "Katy");
        model.addAttribute("color", "RED");
        return "homew.html";
    }
}
