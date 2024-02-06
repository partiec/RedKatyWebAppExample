package com.example.webka_1.controllers;

import com.example.webka_1.models.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public Country france(){
        Country c = Country.of("France", 44);
        return c;
    }

    @GetMapping("all")
    public List<Country> list(){
        List<Country>l = new ArrayList<>();
        l.add(Country.of(france().getName(), france().getPopulation()));
        l.add(Country.of("Russia", 300));
        return l;
    }

    @GetMapping("/france_c")
    public ResponseEntity<Country> france_c(){
        Country c = Country.of("France", 44);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .header("favorite_food", "cheese and wine")
                .body(c);
    }
}
