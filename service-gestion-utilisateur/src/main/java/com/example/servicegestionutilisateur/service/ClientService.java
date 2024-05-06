package com.example.servicegestionutilisateur.service;

import com.example.servicegestionutilisateur.dto.ClientDto;
import com.example.servicegestionutilisateur.dto.UserDto;

import java.util.List;

public interface ClientService {
    List<ClientDto> getClients();
    ClientDto getClientById(long id);
    ClientDto createClient(ClientDto clientDto);
    ClientDto updateClient(long id, ClientDto clientDto);
    void deleteClient(long id);
}
