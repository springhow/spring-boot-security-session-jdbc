package com.springhow.examples.springboot.security.session.redis.domain.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserRoleToPrivilege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private UserRole role;
    @ManyToOne
    private UserPrivilege privilege;
}
