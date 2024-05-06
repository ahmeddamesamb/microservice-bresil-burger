package com.example.servicegestionutilisateur.service.mapper;

import com.example.servicegestionutilisateur.dto.GestionaireDto;
import com.example.servicegestionutilisateur.dto.LivreurDto;
import com.example.servicegestionutilisateur.model.Gestionaire;
import com.example.servicegestionutilisateur.model.Livreur;
import org.modelmapper.ModelMapper;

public class LivreurMapStructImpl implements LivreurMapStruct{
    private final ModelMapper modelMapper;

    public LivreurMapStructImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public LivreurDto toDto(Livreur livreur) {
        LivreurDto livreurDto = modelMapper.map(livreur, LivreurDto.class);
        return livreurDto;
    }

    @Override
    public Livreur toEntity(LivreurDto livreurDto) {
        Livreur livreur = modelMapper.map(livreurDto, Livreur.class);
        return livreur;
    }
}
