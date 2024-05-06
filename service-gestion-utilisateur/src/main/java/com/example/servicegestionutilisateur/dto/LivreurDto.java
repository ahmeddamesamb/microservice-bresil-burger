package com.example.servicegestionutilisateur.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class LivreurDto extends UserDto{

    private String matricule_moto;
    private Boolean disponible=true;

}
