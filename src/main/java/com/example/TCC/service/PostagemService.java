package com.example.TCC.service;

import com.example.TCC.model.Postagens;
import com.example.TCC.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostagemService {
    @Autowired
    private PostagemRepository postagemRepository;

    public List<Postagens> listarPostagens() {
        return postagemRepository.findAll();
    }

    public Postagens salvarPostagem(Postagens postagem) {
        return postagemRepository.save(postagem);
    }

    public Postagens buscarPostagem(Long id) {
        return postagemRepository.findById(id).orElse(null);
    }

    public void deletarPostagem(Long id) {
        postagemRepository.deleteById(id);
    }
}
