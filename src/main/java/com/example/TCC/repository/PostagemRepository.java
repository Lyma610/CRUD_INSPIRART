package com.example.TCC.repository;

import com.example.TCC.model.Postagens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemRepository extends JpaRepository<Postagens, Long> {
}
