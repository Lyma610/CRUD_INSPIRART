package com.example.TCC.service;


import com.example.TCC.model.Curtidas;
import com.example.TCC.repository.CurtidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurtidasService {

    @Autowired
    private CurtidaRepository curtidasRepository;

    public List<Curtidas> findAll() {
        return curtidasRepository.findAll();
    }

    public Curtidas findById(Long id) {
        return curtidasRepository.findById(id).orElse(null);
    }

    public Curtidas save(Curtidas curtida) {
        return curtidasRepository.save(curtida);
    }

    public void delete(Long id) {
        curtidasRepository.deleteById(id);
    }
}

