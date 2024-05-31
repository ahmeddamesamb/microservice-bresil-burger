package com.example.service1.controller;

import com.example.service1.dto.GestionaireDto;
import com.example.service1.service.GestionaireService;
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
public class GestionaireController {
    private final GestionaireService gestionaireService;

    public GestionaireController(GestionaireService gestionaireService) {
        this.gestionaireService = gestionaireService;
    }

    @GetMapping(Endpoint.URL_GESTIONAIRE)
    public Page<GestionaireDto> getAllGestionaire(Pageable pageable) throws Exception {
        return gestionaireService.findAll(pageable);
    }

    @PutMapping(Endpoint.URL_ONE_GESTIONAIRE)
    public Optional<GestionaireDto> updateGestionaire(GestionaireDto gestionaireDto) throws Exception {
        return gestionaireService.update(gestionaireDto);
    }

    @GetMapping(Endpoint.URL_ONE_GESTIONAIRE)
    public Optional<GestionaireDto> getGestionaire(Long id) throws Exception {
        return gestionaireService.findOne(id);
    }

    @PostMapping(Endpoint.URL_GESTIONAIRE)
    public GestionaireDto createGestionaire(GestionaireDto gestionaireDto) throws Exception {
        return gestionaireService.save(gestionaireDto);
    }

    @DeleteMapping(Endpoint.URL_ONE_GESTIONAIRE)
    public String deleteGestionaire(Long id) throws Exception {
        gestionaireService.delete(id);
        return "Gestionaire supprimé avec succès";
    }
}

