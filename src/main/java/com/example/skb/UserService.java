package com.example.skb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // DI через поле
    @Autowired
    private PasswordEncoder base64Encoder;

    private PasswordEncoder sha256Encoder;
    private UserRepository userRepository;

    // DI через конструктор
    @Autowired
    public UserService(Sha256Encoder sha256Encoder) {
        this.sha256Encoder = sha256Encoder;
    }

    // DI через сеттер
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String username, String password) {
        User user = new User();
        user.setName(username);
        // Используем разные энкодеры для демонстрации
        user.setPassword(base64Encoder.encode(password) + " | " + sha256Encoder.encode(password));
        userRepository.save(user);
    }
}
