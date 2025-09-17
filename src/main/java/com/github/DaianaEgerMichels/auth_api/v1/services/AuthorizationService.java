package com.github.DaianaEgerMichels.auth_api.v1.services;

import com.github.DaianaEgerMichels.auth_api.v1.repositories.UserRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorizationService  implements UserDetailsService {
    @NonNull
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByLogin(username);
    }
}
