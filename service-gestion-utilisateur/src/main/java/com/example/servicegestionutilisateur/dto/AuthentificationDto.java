package com.example.servicegestionutilisateur.dto;

import lombok.Data;

@Data
public class AuthentificationDto extends ResponseDto{
    private String token;
    public AuthentificationDto (String token){

        super();
        this.token=token;
    }
}
