package com.example.webka_1.controllers;

import com.example.webka_1.models.Product;
import com.example.webka_1.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {

    private ProductService productService = new ProductService();

    @GetMapping("/products")
    public String viewProducts(Model model) {

        List<Product>products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(Model model,
                             Product p){

        productService.addProduct(p);

        List<Product>products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }
}
