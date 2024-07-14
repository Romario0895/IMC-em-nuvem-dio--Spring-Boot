package com.romario.imc.controller;

import com.romario.imc.model.User;
import com.romario.imc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/exists/{accountNumber}")
    public boolean existsByAccountNumber(@PathVariable String accountNumber) {
        return userService.existsByAccountNumber(accountNumber);
    }
}
