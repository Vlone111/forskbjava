package com.example.skb;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor //еще возможное применение ну тут по сути своей конструктор через ломбок
public class SkbApplication implements CommandLineRunner {

    private final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(SkbApplication.class, args);
    }

    @Override
    public void run(String... args) {
        userService.createUser("admin", "qwerty");
    }
}
