package com.example.servicegestionutilisateur.repository;

import com.example.servicegestionutilisateur.model.Gestionaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestionaireRepository extends JpaRepository<Gestionaire, Long> {
}
