package com.example.servicegestionutilisateur.controller;

import com.example.servicegestionutilisateur.dto.GestionaireDto;
import com.example.servicegestionutilisateur.dto.UserDto;
import com.example.servicegestionutilisateur.model.Gestionaire;
import com.example.servicegestionutilisateur.service.GestionaireService;
import com.example.servicegestionutilisateur.utils.Endpoints;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin(origins = "", allowedHeaders = "*")
@Log4j2
public class GestionaireController {
    private final GestionaireService gestionaireService;

    public GestionaireController(GestionaireService gestionaireService) {
        this.gestionaireService = gestionaireService;
    }


    @GetMapping(Endpoints.URL_GESTIONAIRE)
    public List<GestionaireDto> getGestionaires() {
        return gestionaireService.getGestionaires();
    }
    @GetMapping(Endpoints.URL_ONE_GESTIONAIRE)
    public GestionaireDto getGestionaireById(@PathVariable Long id) {
        return gestionaireService.getGestionaireById(id);
    }
    @PostMapping(Endpoints.URL_GESTIONAIRE)
    public GestionaireDto createGestionaire(@RequestBody GestionaireDto gestionaireDto) {
        return gestionaireService.createGestionaire(gestionaireDto);
    }
    @DeleteMapping(Endpoints.URL_ONE_GESTIONAIRE)
    public void deleteGestionaire(@PathVariable(name = "id") Long id) {
        gestionaireService.deleteGestionaire(id);
    }
    @PutMapping(Endpoints.URL_ONE_GESTIONAIRE)
    public GestionaireDto updateGestionaire(@PathVariable Long id, @RequestBody GestionaireDto gestionaireDto) {
        return gestionaireService.updateGestionaire(id,gestionaireDto);
    }
}
