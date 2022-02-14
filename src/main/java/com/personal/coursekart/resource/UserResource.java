package com.personal.coursekart.resource;

import com.personal.coursekart.dto.UserDTO;
import com.personal.coursekart.entity.User;
import com.personal.coursekart.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserResource {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> save(@RequestBody UserDTO userDTO) {
        var savedUser = userService.saveUser(userDTO);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<User> get(@RequestParam String email) {
        var user = userService.getUserByEmail(email);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<User> update(@RequestBody UserDTO userDTO) {
        var updatedUser = userService.update(userDTO);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

}
