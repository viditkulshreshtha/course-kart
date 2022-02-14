package com.personal.coursekart.service;

import com.personal.coursekart.entity.User;
import com.personal.coursekart.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User saveUser(String name, String email) {
        var user = new User();
        user.setEmail(email);
        user.setName(name);
        return userRepository.save(user);
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
