package com.wafec.backend.api.controllers;

import com.wafec.backend.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/users")
public class UserApi {
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String sayHello() {
        return userService.sayHello();
    }
}
