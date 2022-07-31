package com.example.opgg.service;

import com.example.opgg.dto.UserDTO;
import com.example.opgg.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Transactional
    public String saveUser(UserDTO userDTO){
        return userRepository.save(userDTO.toEntity()).getUserName();
    }
}
