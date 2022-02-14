package com.personal.coursekart.service;

import com.personal.coursekart.dto.UserDTO;
import com.personal.coursekart.entity.User;
import com.personal.coursekart.exception.UserAlreadyPresentException;
import com.personal.coursekart.exception.UserNotFoundException;
import com.personal.coursekart.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.personal.coursekart.converter.UserConverter.toUser;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User saveUser(UserDTO userDTO) {
        if (userRepository.findByEmail(userDTO.getEmail()) != null) {
            throw new UserAlreadyPresentException("User already exists");
        }
        return userRepository.save(toUser(userDTO));
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User update(UserDTO userDTO) {
        if (userRepository.findByEmail(userDTO.getEmail()) == null) {
            throw new UserNotFoundException("User not found");
        }
        var user = userRepository.findByEmail(userDTO.getEmail());
        return userRepository.save(toUser(user, userDTO));
    }
}
