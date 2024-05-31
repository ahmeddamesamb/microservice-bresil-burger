package com.example.serviceuser.repository;

import com.example.serviceuser.model.Client;
import com.example.serviceuser.model.Gestionaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestionaireRepository extends JpaRepository<Gestionaire,Long> {
}
