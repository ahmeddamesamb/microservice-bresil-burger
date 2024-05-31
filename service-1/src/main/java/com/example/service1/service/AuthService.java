package com.example.service1.service;

import com.example.service1.payload.request.AuthRequest;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface AuthService {
    String getAccessToken(AuthRequest authRequest) throws JsonProcessingException;
    AuthRequest getBody(AuthRequest authRequest) throws JsonProcessingException;

}
