package com.example.opgg.controller;

import com.example.opgg.dto.UserDTO;
import com.example.opgg.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    private UserService userService;
    @PostMapping(value = "/register")
    public String signup(UserDTO userDTO){
        userService.saveUser(userDTO);
        return "redirect:/";
    }
}
