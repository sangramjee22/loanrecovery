package com.loanrecovery.pay.app.controller;

import com.loanrecovery.pay.app.dto.AuthenticationSuccess;
import com.loanrecovery.pay.app.service.AuthService;
import com.loanrecovery.pay.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4020")
@RestController
@RequestMapping("/api/v1")
public class AuthenticationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    private final AuthService authService;

    public AuthenticationController(AuthService authService){
        this.authService = authService;
    }

    @GetMapping(path = "/auth")
    public AuthenticationSuccess auth() {
        return new AuthenticationSuccess("You are authenticated");
    }


}
