package com.example.servicecommandelivraison;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceCommandeLivraisonApplication {
    @GetMapping("/commandelivraison")
    public String get(){
        return "SERVICE-COMMANDE-LIVRAISON";
    }
    public static void main(String[] args) {
        SpringApplication.run(ServiceCommandeLivraisonApplication.class, args);
        System.out.print("***************** SERVICE-COMMANDE-LIVRAISON ******************");
    }

}
