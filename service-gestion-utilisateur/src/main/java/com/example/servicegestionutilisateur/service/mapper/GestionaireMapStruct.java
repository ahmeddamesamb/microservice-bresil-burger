package com.example.servicegestionutilisateur.service.mapper;

import com.example.servicegestionutilisateur.dto.ClientDto;
import com.example.servicegestionutilisateur.dto.GestionaireDto;
import com.example.servicegestionutilisateur.model.Client;
import com.example.servicegestionutilisateur.model.Gestionaire;

public interface GestionaireMapStruct {
    GestionaireDto toDto(Gestionaire gestionaire);
    Gestionaire toEntity(GestionaireDto gestionaireDto);
}
