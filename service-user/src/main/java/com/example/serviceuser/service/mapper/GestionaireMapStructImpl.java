package com.example.serviceuser.service.mapper;

import com.example.serviceuser.dto.GestionaireDto;
import com.example.serviceuser.model.Gestionaire;
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
