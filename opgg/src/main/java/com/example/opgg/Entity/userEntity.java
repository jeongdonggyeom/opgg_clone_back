package com.example.opgg.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "opgg_user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class userEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_pk;

    @Column
    private String user_name;

    @Column
    private String user_email;

    @Column
    private Date user_birth;

    @Column
    private String user_pass;

}
