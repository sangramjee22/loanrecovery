package com.loanrecovery.pay.app.service;

import com.loanrecovery.pay.app.dto.AuthenticationSuccess;
import com.loanrecovery.pay.app.dto.LoginDto;
import com.loanrecovery.pay.app.model.Login;
import com.loanrecovery.pay.app.repository.LoginRepository;
import com.loanrecovery.pay.app.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class AuthService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private final LoginRepository loginRepository;

    @Autowired
    public AuthService(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    public AuthenticationSuccess getAuthentication(LoginDto loginDto){
        Login login = loginRepository.findByLoginId(loginDto.getLoginId());
        if(isValid(login,loginDto)){
            return new AuthenticationSuccess("Successful");
        }
        return new AuthenticationSuccess("Unsuccessful");
    }

    private boolean isValid(Login login,LoginDto loginDto){
        boolean validUser = false;
        if(login.getPassword().equals(loginDto.getPassword())) {
            validUser = true;
            login.setToken(generateToken());
        }
        login.setToken("");
        loginRepository.save(login);
        return validUser;
    }

    private String generateToken(){
        return Instant.now().toString();
    }


}
