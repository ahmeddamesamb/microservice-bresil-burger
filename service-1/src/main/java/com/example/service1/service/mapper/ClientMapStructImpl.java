package com.example.service1.service.mapper;

import com.example.service1.dto.ClientDto;
import com.example.service1.model.Client;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ClientMapStructImpl implements ClientMapStruct{
    private final ModelMapper modelMapper;

    public ClientMapStructImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public ClientDto toDto(Client client) {
        ClientDto clientDto = modelMapper.map(client, ClientDto.class);
        return clientDto;    }

    @Override
    public Client toEntity(ClientDto clientDto) {
        Client client = modelMapper.map(clientDto, Client.class);
        return client;    }
}

