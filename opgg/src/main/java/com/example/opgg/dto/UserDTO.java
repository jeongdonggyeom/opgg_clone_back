package com.example.opgg.dto;

import com.example.opgg.Entity.UserEntity;

public class UserDTO {
    private String userName;
    private String userPass;
    private String userBirth;
    private String userEmail;

    public UserDTO(String userName, String userPass, String userBirth, String userEmail){
        this.userName = userName;
        this.userPass = userPass;
        this.userBirth = userBirth;
        this.userEmail = userEmail;
    }

    @Override
    public String toString(){
        return "UserDTO { userName = " + userName + " userPass = " + userPass + " userBirth = " + userBirth + " userEmail = " + userEmail;
     }

     public UserEntity toEntity(){
        return new UserEntity(null, userName, userPass, userBirth, userEmail);
     }
}
