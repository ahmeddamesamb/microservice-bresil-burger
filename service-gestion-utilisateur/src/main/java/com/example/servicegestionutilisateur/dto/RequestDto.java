package com.example.servicegestionutilisateur.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class RequestDto {
    @NotBlank
    @Size(min = 4)
    private String username;

    @NotBlank
    @Size(min = 4)
    private String password;

    private String email;
}
