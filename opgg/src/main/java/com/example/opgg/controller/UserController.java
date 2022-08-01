package com.example.opgg.controller;

import com.example.opgg.Entity.UserEntity;
import com.example.opgg.dto.UserDTO;
import com.example.opgg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/user/new")
    public String newUserForm(){
        return "/register";
    }

    @PostMapping("/user/create")
    public String createUser(UserDTO dto){
        System.out.println(dto.toString());

        UserEntity entity = dto.toEntity();
        System.out.println(entity.toString());

        UserEntity save = userRepository.save(entity);
        System.out.println(save.toString());

        return "";
    }
}
