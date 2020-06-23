package com.wafec.api.admin.controllers;

import com.wafec.api.admin.services.UserAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/users")
public class PublicUsersController {
    @Autowired
    private UserAuthenticationService userAuthenticationService;

    @GetMapping("/hello")
    public String sayHello() {
        return userAuthenticationService.sayHello();
    }

    @GetMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        return userAuthenticationService.login(username, password)
                .orElseThrow(() -> new RuntimeException("Invalid login and/or password"));
    }
}
