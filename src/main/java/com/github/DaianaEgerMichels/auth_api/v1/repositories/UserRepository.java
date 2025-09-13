package com.github.DaianaEgerMichels.auth_api.v1.repositories;

import com.github.DaianaEgerMichels.auth_api.v1.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    // return one UserDetails for use by spring security
    UserDetails findByLogin(String login);
}
