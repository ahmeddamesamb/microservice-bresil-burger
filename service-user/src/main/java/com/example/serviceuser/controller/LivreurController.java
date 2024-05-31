package com.example.serviceuser.controller;

import com.example.serviceuser.dto.LivreurDto;
import com.example.serviceuser.service.LivreurService;
import com.example.serviceuser.utils.Endpoint;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(Endpoint.URL)
@CrossOrigin(origins = "", allowedHeaders = "*")
public class LivreurController {
    private final LivreurService livreurService;

    public LivreurController(LivreurService livreurService) {
        this.livreurService = livreurService;
    }

    @GetMapping(Endpoint.URL_LIVREUR)
    public Page<LivreurDto> getAllLivreur(Pageable pageable) throws Exception {
        return livreurService.findAll(pageable);
    }

    @PutMapping(Endpoint.URL_ONE_LIVREUR)
    public Optional<LivreurDto> updateLivreur(LivreurDto livreurDto) throws Exception {
        return livreurService.update(livreurDto);
    }

    @GetMapping(Endpoint.URL_ONE_LIVREUR)
    public Optional<LivreurDto> getLivreur(Long id) throws Exception {
        return livreurService.findOne(id);
    }

    @PostMapping(Endpoint.URL_LIVREUR)
    public LivreurDto createLivreur(LivreurDto livreurDto) throws Exception {
        return livreurService.save(livreurDto);
    }

    @DeleteMapping(Endpoint.URL_ONE_LIVREUR)
    public String deleteLivreur(Long id) throws Exception {
        livreurService.delete(id);
        return "Livreur supprimé avec succès";
    }
}
