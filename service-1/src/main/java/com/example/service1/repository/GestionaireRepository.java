package com.example.service1.repository;

import com.example.service1.model.Gestionaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestionaireRepository extends JpaRepository<Gestionaire,Long> {
}
