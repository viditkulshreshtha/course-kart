package com.personal.coursekart.dto;

import com.personal.coursekart.enums.UserType;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private String userName;
    private String email;
    private List<String> areasOfInterest;
    private UserType userType;
}
