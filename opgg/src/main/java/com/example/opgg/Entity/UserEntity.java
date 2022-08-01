package com.example.opgg.Entity;

import lombok.*;

import javax.persistence.*;
@Entity
@Table(name = "opgg_user")
public class UserEntity{
    @Id
    @GeneratedValue
    private Long userPk;
    @Column
    private String userName;
    @Column
    private String userPass;
    public UserEntity(Long userPk, String userName, String userPass){
        this.userPk = userPk;
        this.userName = userName;
        this.userPass = userPass;
    }

    @Override
    public String toString(){
        return "UserEntity{ userPk = " + userPk + " userName = " + userName + " userPass = " + userPass;
    }
}