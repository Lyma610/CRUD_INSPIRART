package com.example.TCC.repository;

import com.example.TCC.model.Curtidas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurtidaRepository extends JpaRepository<Curtidas, Long> {
}