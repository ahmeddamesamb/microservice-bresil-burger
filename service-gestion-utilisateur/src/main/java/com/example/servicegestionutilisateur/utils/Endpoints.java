package com.example.servicegestionutilisateur.utils;

public interface Endpoints {
    String URL = "/api";

    String AUTHENTICATE = "/authenticate";
    //************************USER************************//
    String URL_USER = "/users";
    String URL_ONE_USER = "/users/{id}";
    //***********************GESTIONAIRE*************************//
    String URL_GESTIONAIRE = "/gestionaires";
    String URL_ONE_GESTIONAIRE = "/gestionaires/{id}";
    //************************LIVREUR************************//
    String URL_LIVREUR = "/livreurs";
    String URL_ONE_LIVREUR = "/livreurs/{id}";
    //***********************CLIENT*************************//
    String URL_CLIENT = "/clients";
    String URL_ONE_CLIENT = "/clients/{id}";
}
