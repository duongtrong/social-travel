package com.spring.social.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int id;

    @NaturalId
    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    private RoleName name;
}

enum RoleName {
    USER,ADMIN
}