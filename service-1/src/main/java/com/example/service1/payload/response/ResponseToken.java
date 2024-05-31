package com.example.service1.payload.response;

import lombok.Data;

@Data
public class ResponseToken {
    private String access_token;
    private Integer expires_in;
    private Integer refresh_expires_in;
    private String refresh_token;
    private String token_type;
    private String session_state;
    private String scope;
    private String error;
    private String error_description;
}
