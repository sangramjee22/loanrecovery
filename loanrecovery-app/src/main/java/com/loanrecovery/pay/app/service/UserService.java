package com.loanrecovery.pay.app.service;


import com.loanrecovery.pay.app.dto.UserDto;
import com.loanrecovery.pay.app.model.User;
import com.loanrecovery.pay.app.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserDto getUserDetailById(Long id) {
        User user = userRepository.getById(id);
        return UserDto.builder()
                .email(user.getEmail())
                .name(user.getName())
                .address(user.getAddress()).build();
    }

    public List<UserDto> getAllUserDetail() {
        List<User> userList = userRepository.findAll();
        List<UserDto> users = new ArrayList<>();
        for (User user : userList) {
            users.add(UserDto.builder()
                    .id(user.getId())
                    .loginName(user.getName())
                    .email(user.getEmail())
                    .name(user.getName())
                    .address(user.getAddress())
                    .emi(0)
                    .cbc(0)
                    .bucket("BKT_1")
                    .pos(65536).spos(65536)
                    .build());
        }
        return users;
    }
}
