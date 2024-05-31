package com.example.service1.dto;

import com.example.service1.model.ERole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String nom;
    private String email;
    private String password;
    private Boolean isEnable;
    private ERole eRole;

}