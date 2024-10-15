package com.example.TCC.service;

import com.example.TCC.model.Salvar;
import com.example.TCC.repository.SalvarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalvarService {

    @Autowired
    private SalvarRepository salvarRepository;

    public List<Salvar> findAll() {
        return salvarRepository.findAll();
    }

    public Salvar findById(Long id) {
        return salvarRepository.findById(id).orElse(null);
    }

    public Salvar save(Salvar salvar) {
        return salvarRepository.save(salvar);
    }

    public void delete(Long id) {
        salvarRepository.deleteById(id);
    }
}

