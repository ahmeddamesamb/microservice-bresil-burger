package com.example.serviceuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceUserApplication {
    @GetMapping("/user")
    public String get(){
        return "SERVICE-USER";
    }
    public static void main(String[] args) {
        SpringApplication.run(ServiceUserApplication.class, args);
        System.out.print("***************** SERVICE_USER ******************");

    }

}
