package com.example.servicegestionutilisateur.service;

import com.example.servicegestionutilisateur.dto.ClientDto;
import com.example.servicegestionutilisateur.dto.LivreurDto;

import java.util.List;

public interface LivreurService {
    List<LivreurDto> getLivreurs();
    LivreurDto getLivreurById(long id);
    LivreurDto createLivreur(LivreurDto livreurDto);
    LivreurDto updateLivreur(long id, LivreurDto livreurDto);
    void deleteLivreur(long id);
}
