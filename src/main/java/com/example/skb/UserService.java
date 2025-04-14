package com.example.skb;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@Data
public class UserService {
    private final Dao dao;

    public List<Users> getAll() {
        return dao.findAll();
    }
    public Users save(Users users) {
        return dao.save(users);
    }
}