package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChalloController {
    @GetMapping("/challo")
    public String challo() {
        return "First Java application";
    }
}