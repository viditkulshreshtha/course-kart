package com.personal.coursekart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class UserAlreadyPresentException extends RuntimeException {

    public UserAlreadyPresentException(String message) {
        super(message);
    }
}
