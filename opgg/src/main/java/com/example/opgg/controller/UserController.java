package com.example.opgg.controller;

import com.example.opgg.Entity.UserEntity;
import com.example.opgg.dto.UserForm;
import com.example.opgg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/user")
    public UserEntity PostUserInfo(UserEntity entity){

        entity.setUserName();
        UserEntity saveUser = userRepository.save(entity);

        return saveUser;
    }

    @GetMapping("/showuser")
    public List<UserEntity> allUser(){
        Map<String, Objects> response = new HashMap<>();
        List<UserEntity> userList = userRepository.findAll();
        System.out.println("findAll");
        return userList;
    }
}
