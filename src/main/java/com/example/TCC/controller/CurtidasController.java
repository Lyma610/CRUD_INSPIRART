package com.example.TCC.controller;


import com.example.TCC.model.Curtidas;
import com.example.TCC.service.CurtidasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curtidas")
public class CurtidasController {

    @Autowired
    private CurtidasService curtidasService;

    @GetMapping
    public ResponseEntity<List<Curtidas>> getAllCurtidas() {
        List<Curtidas> curtidas = curtidasService.findAll();
        return ResponseEntity.ok(curtidas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curtidas> getCurtidaById(@PathVariable Long id) {
        Curtidas curtida = curtidasService.findById(id);
        return curtida != null ? ResponseEntity.ok(curtida) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Curtidas> createCurtida(@RequestBody Curtidas curtida) {
        Curtidas savedCurtida = curtidasService.save(curtida);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCurtida);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurtida(@PathVariable Long id) {
        curtidasService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

