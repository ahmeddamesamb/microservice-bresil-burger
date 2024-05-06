package com.example.servicegestionutilisateur.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String prenom;
    @Column
    private String nom;
    @Column
    @Nonnull
    private String email;
    @Column
    private String password;
    @Column
    private Boolean isEnable=true;

}
