package com.example.TCC.service;

import com.example.TCC.model.Postagem;
import com.example.TCC.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostagemService {
    @Autowired
    private PostagemRepository postagemRepository;

    // Método para listar todas as postagens
    public List<Postagem> listarPostagens() {
        return postagemRepository.findAll();
    }

    // Método para buscar uma postagem por ID
    public Optional<Postagem> buscarPostagem(Long id) {
        return postagemRepository.findById(id); // Retorna um Optional<Postagem>
    }

    // Método para salvar uma nova postagem
    public Postagem salvarPostagem(Postagem postagem) {
        if (postagem == null) {
            throw new IllegalArgumentException("Postagem não pode ser nula");
        }
        return postagemRepository.save(postagem);
    }

    // Método para deletar uma postagem por ID
    public void deletarPostagem(Long id) {
        if (!postagemRepository.existsById(id)) {
            throw new RuntimeException("Postagem não encontrada com o ID: " + id);
        }
        postagemRepository.deleteById(id);
    }
}
