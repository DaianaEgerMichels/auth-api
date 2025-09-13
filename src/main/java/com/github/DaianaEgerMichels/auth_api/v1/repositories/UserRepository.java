package com.github.DaianaEgerMichels.auth_api.repositories;

import com.github.DaianaEgerMichels.auth_api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByLogin(String login);
}
