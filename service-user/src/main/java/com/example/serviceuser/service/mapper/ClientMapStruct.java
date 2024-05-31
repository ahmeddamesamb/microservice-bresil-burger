package com.example.serviceuser.service.mapper;

import com.example.serviceuser.dto.ClientDto;
import com.example.serviceuser.model.Client;

public interface ClientMapStruct {
    ClientDto toDto(Client client);
    Client toEntity(ClientDto clientDto);
}
