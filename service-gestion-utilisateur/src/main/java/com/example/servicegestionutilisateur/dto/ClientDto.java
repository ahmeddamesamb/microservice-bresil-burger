package com.example.servicegestionutilisateur.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ClientDto extends UserDto{

    private String telephone;
    private String adresse;
}
