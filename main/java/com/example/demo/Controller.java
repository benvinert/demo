package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String Hello() {
        System.out.println("Heyyy");
        System.out.println("hu");
        return "HomePage";

    }
}
