package com.example.service1.service.mapper;

import com.example.service1.dto.LivreurDto;
import com.example.service1.model.Livreur;

public interface LivreurMapStruct {
    LivreurDto toDto(Livreur livreur);
    Livreur toEntity(LivreurDto livreurDto);

}