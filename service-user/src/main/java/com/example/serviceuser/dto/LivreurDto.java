package com.example.serviceuser.dto;

import lombok.Data;

@Data
public class LivreurDto extends UserDto{
    private String matriculeMoto;
    private Boolean disponible;
}
