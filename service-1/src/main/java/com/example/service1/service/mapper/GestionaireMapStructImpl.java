package com.example.service1.service.mapper;

import com.example.service1.dto.GestionaireDto;
import com.example.service1.model.Gestionaire;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class GestionaireMapStructImpl implements GestionaireMapStruct{
    private final ModelMapper modelMapper;

    public GestionaireMapStructImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public GestionaireDto toDto(Gestionaire gestionaire) {
        GestionaireDto gestionaireDto = modelMapper.map(gestionaire, GestionaireDto.class);
        return gestionaireDto;    }

    @Override
    public Gestionaire toEntity(GestionaireDto gestionaireDto) {
        Gestionaire gestionaire = modelMapper.map(gestionaireDto, Gestionaire.class);
        return gestionaire;    }
}