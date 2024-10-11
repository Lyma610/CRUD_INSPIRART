package com.example.TCC.service;

import com.example.TCC.model.Postagem;
import com.example.TCC.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostagemService {
    @Autowired
    private PostagemRepository postagemRepository;

    public List<Postagem> listarPostagens() {
        return postagemRepository.findAll();
    }

    public Postagem salvarPostagem(Postagem postagem) {
        return postagemRepository.save(postagem);
    }

    public Postagem buscarPostagem(Long id) {
        return postagemRepository.findById(id).orElse(null);
    }

    public void deletarPostagem(Long id) {
        postagemRepository.deleteById(id);
    }
}
