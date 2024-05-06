package com.example.servicegestionutilisateur.service;

import com.example.servicegestionutilisateur.dto.LivreurDto;
import com.example.servicegestionutilisateur.repository.LivreurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreurServiceImpl implements LivreurService{
    private final LivreurRepository livreurRepository;

    public LivreurServiceImpl(LivreurRepository livreurRepository) {
        this.livreurRepository = livreurRepository;
    }

    @Override
    public List<LivreurDto> getLivreurs() {
        return null;
    }

    @Override
    public LivreurDto getLivreurById(long id) {
        return null;
    }

    @Override
    public LivreurDto createLivreur(LivreurDto livreurDto) {
        return null;
    }

    @Override
    public LivreurDto updateLivreur(long id, LivreurDto livreurDto) {
        return null;
    }

    @Override
    public void deleteLivreur(long id) {

    }
}
