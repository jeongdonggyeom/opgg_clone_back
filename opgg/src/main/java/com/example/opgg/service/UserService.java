package com.example.opgg.service;

import com.example.opgg.Entity.UserEntity;
import com.example.opgg.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    public List<UserEntity> selectAll(){
        return userRepository.findAll();
    }
}
