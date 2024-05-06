package com.example.servicegestionutilisateur.service;

import com.example.servicegestionutilisateur.dto.GestionaireDto;
import com.example.servicegestionutilisateur.repository.GestionaireRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionaireServiceImpl implements GestionaireService{
    private final GestionaireRepository gestionaireRepository;

    public GestionaireServiceImpl(GestionaireRepository gestionaireRepository) {
        this.gestionaireRepository = gestionaireRepository;
    }

    @Override
    public List<GestionaireDto> getGestionaires() {
        return null;
    }

    @Override
    public GestionaireDto getGestionaireById(long id) {
        return null;
    }

    @Override
    public GestionaireDto createGestionaire(GestionaireDto gestionaireDto) {
        return null;
    }

    @Override
    public GestionaireDto updateGestionaire(long id, GestionaireDto gestionaireDto) {
        return null;
    }

    @Override
    public void deleteGestionaire(long id) {

    }
}
