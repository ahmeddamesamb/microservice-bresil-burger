package com.example.serviceuser.repository;

import com.example.serviceuser.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ClientRepository extends JpaRepository<Client,Long> {
}
