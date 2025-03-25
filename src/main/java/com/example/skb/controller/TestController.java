package com.example.skb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test-error")
    public String generateError() {
        throw new RuntimeException("Что-то пошло не так");
    }
}
