package com.example.opgg.Entity;

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

    @Column
    private String userBirth;

    @Column
    private String userEmail;

    public UserEntity(Long userPk, String userName, String userPass, String userBirth, String userEmail){
        this.userPk = userPk;
        this.userName = userName;
        this.userPass = userPass;
        this.userBirth = userBirth;
        this.userEmail = userEmail;
    }

    @Override
    public String toString(){
        return "UserEntity { userPk = " + userPk + " userName = " + userName + " userPass = " + userPass + " userBirth = " + userBirth + " userEmail = " + userEmail;
    }
}