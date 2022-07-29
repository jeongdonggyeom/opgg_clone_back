package com.example.opgg.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class UserEntity {
    @Id
    @Column(name = "user_pk", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNk;
    @Column(nullable = false, length = 16)
    private String userName;
    @Column(nullable = false, length = 100)
    private String userEmail;
    @Column(nullable = false, length = 8)
    private String userBirth;
    @Column(nullable = false, length = 16)
    private String userPass;
    public UserEntity(Long userPk, String userName, String userPass, String userEmail, String userBirth){
        this.userNk = userPk;
        this.userName = userName;
        this.userPass = userPass;
        this.userEmail = userEmail;
        this.userBirth = userBirth;
    }

    @Override
    public String toString(){
        return "UserForm{ " + "userName : " + userName + " userPass : " + userPass + " userEmail : " + userEmail + " userBirth : " + userBirth + "}";
    }
}
