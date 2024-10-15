package com.example.TCC.repository;

import com.example.TCC.model.Comentarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentarios, Long> {
}
