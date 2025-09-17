package com.github.DaianaEgerMichels.auth_api.v1.controllers;

import com.github.DaianaEgerMichels.auth_api.v1.domain.dto.AuthenticationDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthenticationController {

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO authenticationDTO){
        return ResponseEntity.ok("Success");
    }
}
