package com.example.serviceuser.dto;

import com.example.serviceuser.model.ERole;
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
