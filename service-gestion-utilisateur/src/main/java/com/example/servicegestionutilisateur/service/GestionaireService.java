package com.example.servicegestionutilisateur.service;

import com.example.servicegestionutilisateur.dto.ClientDto;
import com.example.servicegestionutilisateur.dto.GestionaireDto;

import java.util.List;

public interface GestionaireService {
    List<GestionaireDto> getGestionaires();
    GestionaireDto getGestionaireById(long id);
    GestionaireDto createGestionaire(GestionaireDto gestionaireDto);
    GestionaireDto updateGestionaire(long id, GestionaireDto gestionaireDto);
    void deleteGestionaire(long id);
}
