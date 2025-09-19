package com.github.DaianaEgerMichels.auth_api.v1.domain.dto;

import com.github.DaianaEgerMichels.auth_api.v1.domain.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
