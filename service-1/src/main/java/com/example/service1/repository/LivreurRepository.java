package com.example.service1.repository;

import com.example.service1.model.Livreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreurRepository  extends JpaRepository<Livreur,Long> {
}