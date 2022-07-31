package com.example.opgg.Entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity{
    @Id
    private Long userPk;

    private String userName;

    private String userPass;

    private String userBirth;

    private String userEmail;

    @Builder
    public UserEntity(Long userPk, String userName, String userPass, String userBirth, String userEmail){
        this.userPk = userPk;
        this.userName = userName;
        this.userPass = userPass;
        this.userBirth = userBirth;
        this.userEmail = userEmail;
    }
}