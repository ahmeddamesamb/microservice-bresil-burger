package com.example.servicegestionutilisateur.model;

import jakarta.persistence.*;

@Entity
@Table
public class Livreur extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String matricule_moto;
    @Column
    private Boolean disponible=true;
}
