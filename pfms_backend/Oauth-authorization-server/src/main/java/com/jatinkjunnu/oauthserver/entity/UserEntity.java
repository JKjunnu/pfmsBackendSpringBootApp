package com.jatinkjunnu.oauthserver.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column(length = 60)
    private String password;

    private String role;
    private boolean enabled = false;
}
