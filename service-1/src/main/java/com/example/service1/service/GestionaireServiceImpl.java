package com.example.service1.service;


import com.example.service1.dto.GestionaireDto;
import com.example.service1.model.ERole;
import com.example.service1.model.Gestionaire;
import com.example.service1.repository.GestionaireRepository;
import com.example.service1.service.mapper.GestionaireMapStruct;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Log4j2
public class GestionaireServiceImpl implements GestionaireService {
    private final ModelMapper modelMapper;
    private final GestionaireRepository gestionaireRepository;
    private final GestionaireMapStruct gestionaireMapStruct;
    private final PasswordEncoder passwordEncoder;

    public GestionaireServiceImpl(ModelMapper modelMapper, GestionaireRepository gestionaireRepository, GestionaireMapStruct gestionaireMapStruct, PasswordEncoder passwordEncoder) {
        this.modelMapper = modelMapper;
        this.gestionaireRepository = gestionaireRepository;
        this.gestionaireMapStruct = gestionaireMapStruct;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public GestionaireDto save(GestionaireDto gestionaireDto) {
        gestionaireDto.setPassword(passwordEncoder.encode(gestionaireDto.getPassword()));
        gestionaireDto.setERole(ERole.GESTIONAIRE);
        Gestionaire gestionaire = gestionaireMapStruct.toEntity(gestionaireDto);
        Gestionaire savedGestionaire = gestionaireRepository.save(gestionaire);
        return gestionaireMapStruct.toDto(savedGestionaire);
    }

    @Override
    @Transactional
    public Optional<GestionaireDto> update(GestionaireDto gestionaireDto) {
        if (gestionaireDto == null || gestionaireDto.getId() == null) {
            throw new IllegalArgumentException("GestionaireDto or id cannot be null");
        }

        return gestionaireRepository
                .findById(gestionaireDto.getId())
                .map(existingClient -> {
                    gestionaireMapStruct.toEntity(gestionaireDto);
                    return existingClient;
                })
                .map(gestionaireRepository::save)
                .map(gestionaireMapStruct::toDto);
    }

    @Override
    public Page<GestionaireDto> findAll(Pageable pageable) {
        log.debug("Request to get All clients ");
        Page<Gestionaire> gestionaires = gestionaireRepository.findAll(pageable);
        return gestionaires.map(gestionaireMapStruct::toDto);
    }

    @Override
    public Optional<GestionaireDto> findOne(Long id) {
        log.debug("Request to get gestionaire : {}", id);
        return gestionaireRepository.findById(id).map(gestionaireMapStruct::toDto);
    }

    @Override
    @Transactional
    @Modifying
    public String delete(Long id) {
        log.debug("Request to delete gestionaire : {}", id);
        gestionaireRepository.deleteById(id);
        return "gestionaire deleted with success";
    }
}
