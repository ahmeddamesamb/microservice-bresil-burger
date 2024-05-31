package com.example.serviceuser.service;

import com.example.serviceuser.payload.request.AuthRequest;
import com.example.serviceuser.payload.response.ResponseToken;
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

@Service
@Log4j2
public class AuthServiceImpl implements AuthService{
    private  final RestTemplate restTemplate;
    private static final String AUTHENTICATION_URL = "http://localhost:8080/realms/microservice-bresil-burger/protocol/openid-connect/token";
    private static final String HELLO_URL = "http://localhost:6002/produit";
    //
//    @Value("password")
    private String apiManagGrantType="password";
    //
//    @Value("backendp4-app")
    private String apiManagClientId="bresil_burger_client";
    //
//    @Value("dd4b5635-86b5-42c4-82dd-ed7ede5b9c93")
    private String apiManagClientSecret="OmEe368Pv7MBFEokVzsXGFjiG3RbV3AQ";

    public AuthServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public String getAccessToken(AuthRequest authRequest) throws JsonProcessingException {
        String login = authRequest.getUsername();
        String password = authRequest.getPassword();
        var accesToken = "KO";

        var headers = new HttpHeaders();
        headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED.toString());
        MultiValueMap<String,String> map =new LinkedMultiValueMap<>();

        map.add("grant_type", apiManagGrantType);
        map.add("client_id", apiManagClientId);
        map.add("client_secret", apiManagClientSecret);
        map.add("username", login);
        map.add("password", password);
        //
        var entity = new HttpEntity<>(map, headers);

        try {
            var resultGAT = restTemplate.postForEntity(AUTHENTICATION_URL, entity, ResponseToken.class);
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
    public AuthRequest getBody(AuthRequest authRequest) throws JsonProcessingException {
        return authRequest;
    }
}
