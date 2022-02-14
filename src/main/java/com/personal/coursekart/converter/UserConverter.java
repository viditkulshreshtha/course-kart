package com.personal.coursekart.converter;


import com.personal.coursekart.dto.UserDTO;
import com.personal.coursekart.entity.User;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class UserConverter {
    public static User toUser(UserDTO userDTO) {
        var user = new User();
        user.setName(userDTO.getUserName());
        user.setEmail(userDTO.getEmail());
        user.setAreasOfInterest(userDTO.getAreasOfInterest().toString());
        user.setUserType(userDTO.getUserType().getValue());

        return user;
    }

    public static User toUser(User user, UserDTO userDTO) {
        user.setName(userDTO.getUserName());
        user.setEmail(userDTO.getEmail());
        user.setAreasOfInterest(userDTO.getAreasOfInterest().toString());
        user.setUserType(userDTO.getUserType().getValue());

        return user;
    }
}
