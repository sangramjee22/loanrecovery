package com.loanrecovery.pay.app.controller;

import com.loanrecovery.pay.app.dto.UserDto;
import com.loanrecovery.pay.app.model.User;
import com.loanrecovery.pay.app.repository.UserRepository;
import com.loanrecovery.pay.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    private UserService userService;

    //get user details
    @RequestMapping(value = "/users/{id}",
    method = RequestMethod.GET,
    produces="application/json")

    public UserDto getEmployee(@PathVariable Long id){
        return userService.getUserDetailById(id);
    }

    @RequestMapping(value = "/users",
            method = RequestMethod.GET,
            produces="application/json")

    public List<UserDto> getAllUser(){
        return userService.getAllUserDetail();
    }
}
