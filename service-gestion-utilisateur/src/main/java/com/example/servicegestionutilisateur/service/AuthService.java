package com.example.servicegestionutilisateur.service;

import com.example.servicegestionutilisateur.dto.UserDto;
import com.example.servicegestionutilisateur.payload.request.Authentification;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface AuthService {

    String getAccessToken(Authentification authentification) throws JsonProcessingException;

    UserDto getBody(UserDto userDto) throws JsonProcessingException;
}
