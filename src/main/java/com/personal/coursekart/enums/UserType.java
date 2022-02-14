package com.personal.coursekart.enums;

public enum UserType {
    STUDENT("Student"),
    PROFESSIONAL("Professional");

    private final String value;

    UserType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
