package com.example.serviceuser.dto;

import lombok.Data;

@Data
public class ClientDto extends UserDto{
    private String telephone;
    private String adresse;
}
