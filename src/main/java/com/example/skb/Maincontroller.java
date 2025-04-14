package com.example.skb;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class Maincontroller {
    private final UserService userService;
    @GetMapping("/getall")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @PostMapping("/save")
    private ResponseEntity<?> save(@RequestBody Users users) {
        return ResponseEntity.ok(userService.save(users));
    }
}
