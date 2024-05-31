package com.example.serviceuser.service;

import com.example.serviceuser.payload.request.AuthRequest;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface AuthService {
    String getAccessToken(AuthRequest authRequest) throws JsonProcessingException;
    AuthRequest getBody(AuthRequest authRequest) throws JsonProcessingException;
}
