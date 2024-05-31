package com.example.service1.repository;

import com.example.service1.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ClientRepository extends JpaRepository<Client,Long> {
}