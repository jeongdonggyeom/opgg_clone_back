package com.example.opgg.dto;

import com.example.opgg.Entity.UserEntity;

public class UserForm {
    private Long userPk;
    private String userName;
    private String userPass;
    private String userBirth;
    private String userEmail;

    public UserForm(Long userPk, String userName, String userPass, String userBirth, String userEmail){
        this.userPk = userPk;
        this.userName = userName;
        this.userPass = userPass;
        this.userBirth = userBirth;
        this.userEmail = userEmail;
    }

    @Override
    public String toString(){
        return "UserForm{ " + "userName : " + userName + " userPass : " + userPass + " userEmail : " + userEmail + " userBirth : " + userBirth + "}";
    }

    public UserEntity toEntity(){
        return new UserEntity(null, userName, userPass, userEmail, userBirth);
    }
}
