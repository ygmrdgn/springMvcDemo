package com.example.springMvcDemo.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "email",unique = true)
    private String role;

    @ManyToMany(mappedBy = "Roles", fetch = FetchType.LAZY)
    private Collection<Users> users;

    public Role() {
    }

    public Role( long id , String role ) {
        this.id = id;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
