package com.example.servicegestionutilisateur.dto;

import lombok.Data;

@Data
public class ResponseDto {
    private Integer status;
    private String message;

    public ResponseDto() {
    }

    public ResponseDto(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

}
