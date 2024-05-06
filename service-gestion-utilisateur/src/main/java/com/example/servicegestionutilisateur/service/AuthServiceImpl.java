package com.example.servicegestionutilisateur.service;

import com.example.servicegestionutilisateur.dto.UserDto;
import com.example.servicegestionutilisateur.payload.request.Authentification;
import com.example.servicegestionutilisateur.payload.response.Token;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

@Log4j2
@Service
public class AuthServiceImpl implements AuthService{
    private final RestTemplate restTemplate;
    private static final String AUTHENTICATION_URL = "http://localhost:8080/auth/realms/backendp4/protocol/openid-connect/token";
    private static final String HELLO_URL = "http://localhost:8090/api/home";
    //
//    @Value("password")
    private String apiManagGrantType;
    //
//    @Value("backendp4-app")
    private String apiManagClientId;
    //
//    @Value("dd4b5635-86b5-42c4-82dd-ed7ede5b9c93")
    private String apiManagClientSecret;

    public AuthServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getAccessToken(Authentification authentification) throws JsonProcessingException {
        String login = authentification.getEmail();
        String password = authentification.getPassword();
        var accesToken = "KO";
        //
        var headers = new HttpHeaders();
        headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED.toString());
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        //
        map.add("grant_type", apiManagGrantType);
        map.add("client_id", apiManagClientId);
        map.add("client_secret", apiManagClientSecret);
        map.add("username", login);
        map.add("password", password);
        //
        var entity = new HttpEntity<>(map, headers);
        //
        try {
            var resultGAT = restTemplate.postForEntity(AUTHENTICATION_URL, entity, Token.class);
            if ((resultGAT.getStatusCode() == HttpStatus.OK) && (resultGAT.getBody() != null)) {
                var responseToken = resultGAT.getBody();
                accesToken = (responseToken == null) ? "KO" : responseToken.getAccess_token();
            }
        } catch (ResourceAccessException ex) {
            accesToken = "KO";
        }
        return accesToken;
    }

    @Override
    public UserDto getBody(UserDto userDto) throws JsonProcessingException {
        return userDto;
    }

}
