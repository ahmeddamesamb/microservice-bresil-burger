package com.example.serviceproduit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController

public class ServiceProduitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProduitApplication.class, args);
        System.out.print("***************** SERVICE-PRODUIT ******************");
    }

}
