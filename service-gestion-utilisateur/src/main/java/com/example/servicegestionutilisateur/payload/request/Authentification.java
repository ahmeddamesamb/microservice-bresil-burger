package com.example.servicegestionutilisateur.payload.request;

import lombok.Data;

@Data
public class Authentification {
    private String email;
    private String password;
}
