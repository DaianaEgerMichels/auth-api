package com.github.DaianaEgerMichels.auth_api.v1.controllers;

import com.github.DaianaEgerMichels.auth_api.v1.domain.dto.AuthenticationDTO;
import com.github.DaianaEgerMichels.auth_api.v1.domain.dto.LoginResponseDTO;
import com.github.DaianaEgerMichels.auth_api.v1.domain.dto.RegisterDTO;
import com.github.DaianaEgerMichels.auth_api.v1.domain.user.User;
import com.github.DaianaEgerMichels.auth_api.v1.infra.security.TokenService;
import com.github.DaianaEgerMichels.auth_api.v1.repositories.UserRepository;
import jakarta.validation.Valid;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    @NonNull
    private final AuthenticationManager authenticationManager;
    @NonNull
    private final UserRepository userRepository;
    @NonNull
    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody @Valid AuthenticationDTO authenticationDTO){
        var usernamedPassword = new UsernamePasswordAuthenticationToken(
                authenticationDTO.login(),
                authenticationDTO.password()
        );

        var auth = this.authenticationManager.authenticate(usernamedPassword);

        var token = tokenService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody @Valid RegisterDTO registerDTO) {
        if(this.userRepository.findByLogin(registerDTO.login()) != null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(registerDTO.password());
        User newUser = new User(registerDTO.login(), encryptedPassword, registerDTO.role());

        this.userRepository.save(newUser);

        return ResponseEntity.ok("Created with success!");
    }
}
