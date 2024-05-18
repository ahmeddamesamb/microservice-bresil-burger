package com.example.servicecommandelivraison;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceCommandeLivraisonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCommandeLivraisonApplication.class, args);
        System.out.print("***************** SERVICE-COMMANDE-LIVRAISON ******************");
    }

}
