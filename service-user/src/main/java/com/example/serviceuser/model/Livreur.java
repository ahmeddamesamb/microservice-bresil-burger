package com.example.serviceuser.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Livreur extends User{
    private String matriculeMoto;
    private Boolean disponible;

}
