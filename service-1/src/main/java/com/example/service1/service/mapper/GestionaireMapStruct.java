package com.example.service1.service.mapper;

import com.example.service1.dto.GestionaireDto;
import com.example.service1.model.Gestionaire;

public interface GestionaireMapStruct {
    GestionaireDto toDto(Gestionaire gestionaire);
    Gestionaire toEntity(GestionaireDto gestionaireDto);
}