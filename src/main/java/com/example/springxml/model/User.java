package com.example.springxml.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;


import java.util.Collection;

@Entity
@Data
@Table(name = "user")
public class User{
    @Id
    @GeneratedValue
    private long id;
    private String email;
    private String password;
    @Getter
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    public User() {
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
