package com.example.serviceuser.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Client extends User{
    private String telephone;
    private String adresse;
}
