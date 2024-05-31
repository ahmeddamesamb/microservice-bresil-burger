package com.example.serviceuser.repository;

import com.example.serviceuser.model.Livreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreurRepository  extends JpaRepository<Livreur,Long> {
}
