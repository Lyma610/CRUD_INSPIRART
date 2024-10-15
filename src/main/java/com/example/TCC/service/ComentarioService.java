package com.example.TCC.service;


import com.example.TCC.model.Comentarios;
import com.example.TCC.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    // Método para listar todos os comentários
    public List<Comentarios> listarComentarios() {
        return comentarioRepository.findAll();
    }

    // Método para buscar um comentário por ID
    public Optional<Comentarios> buscarComentarioPorId(Long id) {
        return comentarioRepository.findById(id);
    }

    // Método para salvar um novo comentário
    public Comentarios salvarComentario(Comentarios comentario) {
        return comentarioRepository.save(comentario);
    }

    // Método para atualizar um comentário
    public Comentarios atualizarComentario(Long id, Comentarios comentarioAtualizado) {
        comentarioAtualizado.setIdComentario(id);
        return comentarioRepository.save(comentarioAtualizado);
    }

    // Método para excluir um comentário
    public void excluirComentario(Long id) {
        comentarioRepository.deleteById(id);
    }
}

