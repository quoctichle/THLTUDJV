package com.example.WebBanSach.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Role;

@Data
@Entity
@Table(name ="account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_id;
    @Column(name = "username")
    private String username;
    @Column(name = "role")
    private boolean role;
    @Column(name="contact")
    private String contact;
    @Column(name="password")
    private String password;
    @Column(name="address")
    private String address;
    @Column(name="name")
    private String name;
    @Column(name="is_verified")
    private boolean is_verified;


}
