package com.wafec.api.admin.controllers;

import com.wafec.api.admin.models.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/users")
public class SecuredUsersController {
    @GetMapping("/sayHello")
    public String sayHello(@AuthenticationPrincipal User user) {
        return String.format("Hello %s", user.getUsername());
    }
}
