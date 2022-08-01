package com.example.opgg.dto;

import com.example.opgg.Entity.UserEntity;

public class UserDTO {
    private String userName;
    private String userPass;

    public UserDTO(String userName, String userPass){
        this.userName = userName;
        this.userPass = userPass;
    }

    @Override
    public String toString(){
        return "UserDTO { userName = " + userName + " userPass = " + userPass;
     }

     public UserEntity toEntity(){
        return new UserEntity(null, userName, userPass);
     }
}
