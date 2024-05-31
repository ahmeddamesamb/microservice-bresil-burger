package com.example.serviceuser.service.mapper;

import com.example.serviceuser.dto.GestionaireDto;
import com.example.serviceuser.model.Gestionaire;

public interface GestionaireMapStruct {
    GestionaireDto toDto(Gestionaire gestionaire);
    Gestionaire toEntity(GestionaireDto gestionaireDto);
}
