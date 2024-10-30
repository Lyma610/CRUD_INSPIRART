package com.example.TCC.controller;


import com.example.TCC.model.Comunidade;
import com.example.TCC.service.ComunidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5174")
@RestController
@RequestMapping("/comunidades")
public class ComunidadeController {

    @Autowired
    private ComunidadeService comunidadeService;

    @GetMapping
    public ResponseEntity<List<Comunidade>> getAllComunidades() {
        List<Comunidade> comunidades = comunidadeService.findAll();
        return ResponseEntity.ok(comunidades);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comunidade> getComunidadeById(@PathVariable Long id) {
        Comunidade comunidade = comunidadeService.findById(id);
        return comunidade != null ? ResponseEntity.ok(comunidade) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Comunidade> createComunidade(@RequestBody Comunidade comunidade) {
        Comunidade savedComunidade = comunidadeService.save(comunidade);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedComunidade);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComunidade(@PathVariable Long id) {
        comunidadeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
