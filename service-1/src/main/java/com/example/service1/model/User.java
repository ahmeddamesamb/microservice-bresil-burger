package com.example.service1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    private Long id;
    @Column
    private String prenom;
    @Column
    private String nom;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private Boolean isEnable;
    @Enumerated(EnumType.STRING)
    private ERole ERole;
}
