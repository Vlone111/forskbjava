package com.example.skb;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void save(User user) {
        System.out.println("Пользователь сохранён: " + user.getName());
    }

    @PostConstruct
    public void init() {
        System.out.println("UserRepository bean создан!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("UserRepository bean уничтожен!");
    }
}
