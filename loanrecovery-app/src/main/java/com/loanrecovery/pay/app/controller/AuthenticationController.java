package com.loanrecovery.pay.app.controller;

import com.loanrecovery.pay.app.dto.AuthenticationSuccess;
import com.loanrecovery.pay.app.dto.LoginDto;
import com.loanrecovery.pay.app.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@CrossOrigin(origins = "http://localhost:4020")
@RestController
@RequestMapping("/api/v1")
public class AuthenticationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    private final AuthService authService;

    public AuthenticationController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping(path = "/authenticate")
    public AuthenticationSuccess authenticate(@Valid @RequestBody LoginDto loginDto) {
        return authService.getAuthentication(loginDto);

    }


}
