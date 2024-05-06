package com.example.servicegestionutilisateur.controller;

import com.example.servicegestionutilisateur.dto.ClientDto;
import com.example.servicegestionutilisateur.dto.UserDto;
import com.example.servicegestionutilisateur.service.ClientService;
import com.example.servicegestionutilisateur.utils.Endpoints;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin(origins = "", allowedHeaders = "*")
@Log4j2
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @GetMapping(Endpoints.URL_CLIENT)
    public List<ClientDto> getUsers() {
        return clientService.getClients();
    }
    @GetMapping(Endpoints.URL_ONE_CLIENT)
    public ClientDto getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }
    @PostMapping(Endpoints.URL_USER)
    public ClientDto createClient(@RequestBody ClientDto clientDto) {
        return clientService.createClient(clientDto);
    }
    @DeleteMapping(Endpoints.URL_ONE_CLIENT)
    public void deleteClient(@PathVariable(name = "id") Long id) {
        clientService.deleteClient(id);
    }
    @PutMapping(Endpoints.URL_ONE_CLIENT)
    public ClientDto updateClient(@PathVariable Long id, @RequestBody ClientDto clientDto) {
        return clientService.updateClient(id,clientDto);
    }
}
