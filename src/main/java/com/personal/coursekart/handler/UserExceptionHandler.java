package com.personal.coursekart.handler;

import com.personal.coursekart.entity.User;
import com.personal.coursekart.exception.UserAlreadyPresentException;
import com.personal.coursekart.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class UserExceptionHandler {
    @ExceptionHandler(UserAlreadyPresentException.class)
    public ResponseEntity<String> handleUserAlreadyPresentException(UserAlreadyPresentException exception, WebRequest webRequest) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public  ResponseEntity<String> handleUserNotFoundException(UserNotFoundException exception, WebRequest webRequest) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}
