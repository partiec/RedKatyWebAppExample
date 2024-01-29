package com.example.webka_1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedKattyController {

    @RequestMapping("/homeW")
    public String home(Model model,
                       @RequestParam(required = false)String color,//это параметр запроса, uri должно быть:http://localhost:8080/home?color=red
                       @RequestParam(required = false)String name) {//это еще параметр запроса, теперь uri должно быть:http://localhost:8080/home?color=цвет?name=имя
        model.addAttribute("username", name);//в представлении:<span th:style="'color:' + ${color}"  th:text="${username}"></span>
        model.addAttribute("color", color);//
        return "homeW.html";
    }
}
