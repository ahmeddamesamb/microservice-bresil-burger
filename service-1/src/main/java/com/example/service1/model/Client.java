package com.example.service1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Client extends User{
    private String telephone;
    private String adresse;
}
