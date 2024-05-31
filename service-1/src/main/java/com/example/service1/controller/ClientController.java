package com.example.service1.controller;

import com.example.service1.dto.ClientDto;
import com.example.service1.service.ClientService;
import com.example.service1.utils.Endpoint;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(Endpoint.URL)
@CrossOrigin(origins = "", allowedHeaders = "*")
@Log4j2
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(Endpoint.URL_CLIENT)
    public Page<ClientDto> getAllClient(Pageable pageable) throws Exception {
        return clientService.findAll(pageable);
    }

    @PutMapping(Endpoint.URL_ONE_CLIENT)
    public Optional<ClientDto> updateClient(@RequestBody ClientDto clientDto) throws Exception {
        return clientService.update(clientDto);
    }

    @GetMapping(Endpoint.URL_ONE_CLIENT)
    public Optional<ClientDto> getClient(Long id) throws Exception {
        return clientService.findOne(id);
    }

    @PostMapping(Endpoint.URL_CLIENT)
    public ClientDto createClient(@RequestBody ClientDto clientDto) throws Exception {
        return clientService.save(clientDto);
    }

    @DeleteMapping(Endpoint.URL_ONE_CLIENT)
    public String deleteClient(Long id) throws Exception {
        log.debug("*********DELETE*********");

        clientService.delete(id);
        return "Client supprimé avec succès";
    }

}

