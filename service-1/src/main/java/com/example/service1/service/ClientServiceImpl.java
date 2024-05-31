package com.example.service1.service;

import com.example.service1.dto.ClientDto;
import com.example.service1.model.Client;
import com.example.service1.model.ERole;
import com.example.service1.repository.ClientRepository;
import com.example.service1.service.mapper.ClientMapStruct;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
public class ClientServiceImpl implements ClientService{
    private final ModelMapper modelMapper;
    private final ClientRepository clientRepository;
    private final ClientMapStruct clientMapStruct;
    private final PasswordEncoder passwordEncoder;

    public ClientServiceImpl(ModelMapper modelMapper, ClientRepository clientRepository, ClientMapStruct clientMapStruct, PasswordEncoder passwordEncoder) {
        this.modelMapper = modelMapper;
        this.clientRepository = clientRepository;
        this.clientMapStruct = clientMapStruct;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public ClientDto save(ClientDto clientDto) {
        clientDto.setPassword(passwordEncoder.encode(clientDto.getPassword()));
        clientDto.setERole(ERole.CLIENT);
        Client client = clientMapStruct.toEntity(clientDto);
        Client client1 = clientRepository.save(client);
        log.debug("Request to save Client : {}", client1);
        return clientMapStruct.toDto(client1);
    }

    @Override
    public Optional<ClientDto> update(ClientDto clientDto) {
        log.debug("Request to partially update Client : {}", clientDto);
        return clientRepository
                .findById(clientDto.getId())
                .map(existingClient -> {
                    clientMapStruct.toEntity(clientDto);
                    return existingClient;
                })
                .map(clientRepository::save)
                .map(clientMapStruct::toDto);
    }

    @Override
    public Page<ClientDto> findAll(Pageable pageable) {
        log.debug("Request to get All clients ");
        return clientRepository.findAll(pageable).map(clientMapStruct::toDto);
    }

    @Override
    public Optional<ClientDto> findOne(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("The given id must not be null");
        }
        log.debug("Request to get client : {}", id);
        return clientRepository.findById(id)
                .map(client -> clientMapStruct.toDto(client));
    }

    @Override
    public String delete(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("The given id must not be null");
        }
        log.debug("Request to delete Client : {}", id);
        clientRepository.deleteById(id);
        return "Client deleted successfully";
    }
}
