package com.example.serviceuser.service.mapper;

import com.example.serviceuser.dto.LivreurDto;
import com.example.serviceuser.model.Livreur;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class LivreurMapStructImpl implements LivreurMapStruct{
    private final ModelMapper modelMapper;

    public LivreurMapStructImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public LivreurDto toDto(Livreur livreur) {
        LivreurDto livreurDto = modelMapper.map(livreur, LivreurDto.class);
        return livreurDto;    }

    @Override
    public Livreur toEntity(LivreurDto livreurDto) {
        Livreur livreur = modelMapper.map(livreurDto, Livreur.class);
        return livreur;    }
}
