package com.example.servicegestionutilisateur.repository;

import com.example.servicegestionutilisateur.model.Livreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreurRepository extends JpaRepository<Livreur,Long> {
}