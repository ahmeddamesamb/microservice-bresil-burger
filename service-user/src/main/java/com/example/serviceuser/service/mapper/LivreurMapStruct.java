package com.example.serviceuser.service.mapper;

import com.example.serviceuser.dto.LivreurDto;
import com.example.serviceuser.model.Livreur;

public interface LivreurMapStruct {
    LivreurDto toDto(Livreur livreur);
    Livreur toEntity(LivreurDto livreurDto);
    
}
