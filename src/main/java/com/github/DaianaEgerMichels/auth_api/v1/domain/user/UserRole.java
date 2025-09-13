package com.github.DaianaEgerMichels.auth_api.v1.domain.user;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("admin"),
    MANAGER("manager"),
    USER("user");

    private final String role;

    UserRole(String role){
        this.role = role;
    }

}
