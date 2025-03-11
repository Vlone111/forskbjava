package com.example.skb;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //помечаем как основной
public class Sha256Encoder implements PasswordEncoder {

    @Override
    public String encode(String rawPassword) {
        return "SHA-256:" + rawPassword;
    }
    @PostConstruct
    public void init() {
        System.out.println("Sha256Encoder bean создан!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Sha256Encoder bean уничтожен!");
    }
}
