package com.example.skb;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Base64;
@Component
@Qualifier("Base64") //помечаем как второстепенный бин с названием
public class Base64Encoder implements PasswordEncoder {

    @Override
    public String encode(String rawPassword) {
        return "Base64: " + Base64.getEncoder().encodeToString(rawPassword.getBytes());
    }
    @PostConstruct
    public void init() {
        System.out.println("Base64Encoder bean создан!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Base64Encoder bean уничтожен!");
    }
}
