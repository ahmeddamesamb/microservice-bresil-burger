package com.example.servicegestionutilisateur.service.mapper;

import com.example.servicegestionutilisateur.dto.ClientDto;
import com.example.servicegestionutilisateur.dto.GestionaireDto;
import com.example.servicegestionutilisateur.model.Client;
import com.example.servicegestionutilisateur.model.Gestionaire;
import org.modelmapper.ModelMapper;

public class GestionaireMapStructImpl implements GestionaireMapStruct{
    private final ModelMapper modelMapper;

    public GestionaireMapStructImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public GestionaireDto toDto(Gestionaire gestionaire) {
        GestionaireDto gestionaireDto = modelMapper.map(gestionaire, GestionaireDto.class);
        return gestionaireDto;
    }

    @Override
    public Gestionaire toEntity(GestionaireDto gestionaireDto) {
        Gestionaire gestionaire = modelMapper.map(gestionaireDto, Gestionaire.class);
        return gestionaire;
    }
}
