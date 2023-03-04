package com.loanrecovery.pay.app.controller;

import com.loanrecovery.pay.app.dto.UserDto;
import com.loanrecovery.pay.app.model.User;
import com.loanrecovery.pay.app.repository.UserRepository;
import com.loanrecovery.pay.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    //get user details
    @RequestMapping(value = "/users/{id}",
    method = RequestMethod.GET,
    produces="application/json")

    public UserDto getEmployee(@PathVariable Long id){
        return userService.getUserDetailById(id);
    }
    @RequestMapping(value = "/users",
            method = RequestMethod.GET,
            produces="application/json"
    )

    public List<UserDto> getAllUser(HttpServletResponse response){
       // response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Credentials","true");
        return userService.getAllUserDetail();
    }
}
