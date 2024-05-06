package com.example.servicegestionutilisateur.service;

import com.example.servicegestionutilisateur.dto.ClientDto;
import com.example.servicegestionutilisateur.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<ClientDto> getClients() {
        return null;
    }

    @Override
    public ClientDto getClientById(long id) {
        return null;
    }

    @Override
    public ClientDto createClient(ClientDto clientDto) {
        return null;
    }

    @Override
    public ClientDto updateClient(long id, ClientDto clientDto) {
        return null;
    }

    @Override
    public void deleteClient(long id) {

    }
}
