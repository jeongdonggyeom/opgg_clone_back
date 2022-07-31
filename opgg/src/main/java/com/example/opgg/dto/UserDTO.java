package com.example.opgg.dto;

import com.example.opgg.Entity.UserEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Data
@NoArgsConstructor
public class UserDTO {
    private Long userPk;
    private String userName;
    private String userPass;
    private String userBirth;
    private String userEmail;

    @Builder
    public UserDTO(Long userPk, String userName, String userPass, String userBirth, String userEmail){
        this.userPk = userPk;
        this.userName = userName;
        this.userPass = userPass;
        this.userBirth = userBirth;
        this.userEmail = userEmail;
    }

    public UserEntity toEntity(){
        UserEntity builder = UserEntity.builder()
                .userPk(userPk)
                .userName(userName)
                .userPass(new BCryptPasswordEncoder().encode(userPass))
                .userBirth(userBirth)
                .userEmail(userEmail)
                .build();
        return builder;
    }
}
