package com.example.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service1Application {
    @GetMapping("/hello")
    public String get(){
        return "service-1";
    }
    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
        System.out.print("***************** SERVICE 1 ******************");

    }

}
