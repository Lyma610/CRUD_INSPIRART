package com.example.TCC.controller;

import com.example.TCC.model.Postagem;
import com.example.TCC.service.PostagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/postagens")
public class PostagemController {
    @Autowired
    private PostagemService postagemService;

    @GetMapping
    public List<Postagem> listarPostagens() {
        return postagemService.listarPostagens();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Postagem> buscarPostagem(@PathVariable Long id) {
        Optional<Postagem> postagemOpt = postagemService.buscarPostagem(id);
        if (postagemOpt.isPresent()) {
            return ResponseEntity.ok(postagemOpt.get());
        } else {
            return ResponseEntity.notFound().build(); // Retorna 404 Not Found se a postagem não for encontrada
        }
    }

    @PostMapping
    public ResponseEntity<Postagem> salvarPostagem(@RequestBody Postagem postagem) {
        Postagem novaPostagem = postagemService.salvarPostagem(postagem);
        return ResponseEntity.status(201).body(novaPostagem); // Retorna 201 Created
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPostagem(@PathVariable Long id) {
        postagemService.deletarPostagem(id);
        return ResponseEntity.noContent().build(); // Retorna 204 No Content
    }
}
