package com.example.service1.service.mapper;

import com.example.service1.dto.LivreurDto;
import com.example.service1.model.Livreur;
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