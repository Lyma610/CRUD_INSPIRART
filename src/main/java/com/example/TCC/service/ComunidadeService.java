package com.example.TCC.service;

import com.example.TCC.model.Comunidade;
import com.example.TCC.repository.ComunidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComunidadeService {

    @Autowired
    private ComunidadeRepository comunidadeRepository;

    public List<Comunidade> findAll() {
        return comunidadeRepository.findAll();
    }

    public Comunidade findById(Long id) {
        return comunidadeRepository.findById(id).orElse(null);
    }

    public Comunidade save(Comunidade comunidade) {
        return comunidadeRepository.save(comunidade);
    }

    public void delete(Long id) {
        comunidadeRepository.deleteById(id);
    }
}

