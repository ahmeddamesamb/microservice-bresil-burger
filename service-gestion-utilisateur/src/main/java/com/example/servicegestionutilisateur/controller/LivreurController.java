package com.example.servicegestionutilisateur.controller;

import com.example.servicegestionutilisateur.dto.LivreurDto;
import com.example.servicegestionutilisateur.dto.UserDto;
import com.example.servicegestionutilisateur.service.LivreurService;
import com.example.servicegestionutilisateur.utils.Endpoints;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin(origins = "", allowedHeaders = "*")
@Log4j2
public class LivreurController {
    private final LivreurService livreurService;

    public LivreurController(LivreurService livreurService) {
        this.livreurService = livreurService;
    }


    @GetMapping(Endpoints.URL_LIVREUR)
    public List<LivreurDto> getLivreurs() {
        return livreurService.getLivreurs();
    }
    @GetMapping(Endpoints.URL_ONE_LIVREUR)
    public LivreurDto getLivreurById(@PathVariable Long id) {
        return livreurService.getLivreurById(id);
    }
    @PostMapping(Endpoints.URL_LIVREUR)
    public LivreurDto createLivreur(@RequestBody LivreurDto livreurDto) {
        return livreurService.createLivreur(livreurDto);
    }
    @DeleteMapping(Endpoints.URL_ONE_LIVREUR)
    public void deletLivreur(@PathVariable(name = "id") Long id) {
        livreurService.deleteLivreur(id);
    }
    @PutMapping(Endpoints.URL_ONE_LIVREUR)
    public LivreurDto updateLivreur(@PathVariable Long id, @RequestBody LivreurDto livreurDto) {
        return livreurService.updateLivreur(id,livreurDto);
    }
}
