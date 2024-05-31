package com.example.service1.service.mapper;

import com.example.service1.dto.ClientDto;
import com.example.service1.model.Client;

public interface ClientMapStruct {
    ClientDto toDto(Client client);
    Client toEntity(ClientDto clientDto);
}
