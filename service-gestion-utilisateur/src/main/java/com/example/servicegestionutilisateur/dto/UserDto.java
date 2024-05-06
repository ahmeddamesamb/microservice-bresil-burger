package com.example.servicegestionutilisateur.dto;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String prenom;
    private String nom;
    private String email;
    private String password;
    private Boolean isEnable=true;

}
