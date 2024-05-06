package com.example.servicegestionutilisateur.model;

import jakarta.persistence.*;

@Entity
@Table
public class Gestionaire extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
