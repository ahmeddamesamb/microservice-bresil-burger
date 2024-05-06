package com.example.servicegestionutilisateur.controller;

import com.example.servicegestionutilisateur.dto.UserDto;
import com.example.servicegestionutilisateur.payload.request.Authentification;
import com.example.servicegestionutilisateur.service.AuthService;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/api")
public class AuthentificationController {
    private AuthService authService;
    @PostMapping("/{type}")
    public String Login(@RequestBody Authentification authentification, @PathVariable String type) throws JsonProcessingException {
        if (type.equalsIgnoreCase("login")) {
            return authService.getAccessToken(authentification);
        }
        return null;
    }



    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws Exception {
        request.logout();
        return "redirect:/";
    }

}
