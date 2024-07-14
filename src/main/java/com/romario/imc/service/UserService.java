package com.romario.imc.service;



import com.romario.imc.model.User;
import com.romario.imc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public boolean existsByAccountNumber(String accountNumber) {
        return userRepository.existsByAccountNumber(accountNumber);
    }
}
