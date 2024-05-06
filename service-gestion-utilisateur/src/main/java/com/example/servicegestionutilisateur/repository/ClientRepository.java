package com.example.servicegestionutilisateur.repository;

import com.example.servicegestionutilisateur.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
