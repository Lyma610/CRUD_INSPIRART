package com.example.TCC.repository;

import com.example.TCC.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
    // Remova ou adapte este método se não for mais necessário
    // List<Postagem> findByUsuario(Usuario usuario);
}
