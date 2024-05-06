package com.example.servicegestionutilisateur.model;

import jakarta.persistence.*;

@Entity
@Table
public class Client extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String telephone;
    @Column
    private String adresse;
}
