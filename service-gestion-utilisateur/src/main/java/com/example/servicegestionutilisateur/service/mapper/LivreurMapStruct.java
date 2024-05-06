package com.example.servicegestionutilisateur.service.mapper;

import com.example.servicegestionutilisateur.dto.GestionaireDto;
import com.example.servicegestionutilisateur.dto.LivreurDto;
import com.example.servicegestionutilisateur.model.Gestionaire;
import com.example.servicegestionutilisateur.model.Livreur;

public interface LivreurMapStruct {
    LivreurDto toDto(Livreur livreur);
    Livreur toEntity(LivreurDto livreurDto);
}
