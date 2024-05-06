package com.example.servicegestionutilisateur.service.mapper;

import com.example.servicegestionutilisateur.dto.ClientDto;
import com.example.servicegestionutilisateur.model.Client;
import org.modelmapper.ModelMapper;

public class ClientMapStructImpl implements ClientMapStruct{
    private final ModelMapper modelMapper;

    public ClientMapStructImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public ClientDto toDto(Client client) {
        ClientDto clientDto = modelMapper.map(client, ClientDto.class);
        return clientDto;
    }

    @Override
    public Client toEntity(ClientDto clientDto) {
        Client client = modelMapper.map(clientDto, Client.class);
        return client;
    }
}
