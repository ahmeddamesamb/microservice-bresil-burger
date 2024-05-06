package com.example.servicegestionutilisateur.service.mapper;

import com.example.servicegestionutilisateur.dto.ClientDto;
import com.example.servicegestionutilisateur.model.Client;

public interface ClientMapStruct {
    ClientDto toDto(Client client);
    Client toEntity(ClientDto clientDto);
}
