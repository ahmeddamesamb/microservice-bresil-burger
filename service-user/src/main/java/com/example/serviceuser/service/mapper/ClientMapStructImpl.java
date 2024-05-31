package com.example.serviceuser.service.mapper;

import com.example.serviceuser.dto.ClientDto;
import com.example.serviceuser.model.Client;
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
