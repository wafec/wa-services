package com.wafec.api.admin.services;

import com.wafec.api.admin.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserAuthenticationService {
    public String sayHello() {
        return "Hello!";
    }

    public Optional<String> login(String username, String password) {
        String token = "test";
        return Optional.of(token);
    }

    public Optional<UserDetails> findByToken(String token) {
        User user = new User();
        user.setUsername("test");
        user.setPassword("test");
        return Optional.of(user);
    }
}
