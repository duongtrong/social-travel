package com.spring.social.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.spring.social.entity.constraint.ValidPassword;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.math.BigInteger;

@Data
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @NotBlank
    @Column(name = "fullName")
    private String fullName;

    @Email
    @NotEmpty
    @Column(name = "email")
    private String email;

    @NotEmpty
    @Column(name = "username")
    private String username;

    @NotBlank
    @ValidPassword
    private String password;

    @NotBlank
    @ValidPassword
    private String confirmPassword;

    @NotBlank
    @Column(name = "phone")
    private String phone;

    @NotBlank
    @Column(name = "address")
    private String address;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private long createdAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private long updatedAt;

    private int status;

    public User() {
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
        this.status = 1;
    }
}
