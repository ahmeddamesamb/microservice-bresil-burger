package com.example.serviceproduit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController

public class ServiceProduitApplication {
    @GetMapping("/produit")
    public String get(){
        return "SERVICE-PRODUIT";
    }
    public static void main(String[] args) {
        SpringApplication.run(ServiceProduitApplication.class, args);
        System.out.print("***************** SERVICE-PRODUIT ******************");
    }

}
