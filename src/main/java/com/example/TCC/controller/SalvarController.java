package com.example.TCC.controller;


import com.example.TCC.model.Salvar;
import com.example.TCC.service.SalvarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/salvar")
public class SalvarController {

    @Autowired
    private SalvarService salvarService;

    @GetMapping
    public ResponseEntity<List<Salvar>> getAllSalvar() {
        List<Salvar> salvarList = salvarService.findAll();
        return ResponseEntity.ok(salvarList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Salvar> getSalvarById(@PathVariable Long id) {
        Salvar salvar = salvarService.findById(id);
        return salvar != null ? ResponseEntity.ok(salvar) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Salvar> createSalvar(@RequestBody Salvar salvar) {
        Salvar savedSalvar = salvarService.save(salvar);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedSalvar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSalvar(@PathVariable Long id) {
        salvarService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

