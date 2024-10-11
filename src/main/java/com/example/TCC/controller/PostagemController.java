package com.example.TCC.controller;

import com.example.TCC.model.Postagem;
import com.example.TCC.service.PostagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postagens")
public class PostagemController {
    @Autowired
    private PostagemService postagemService;

    @GetMapping
    public List<Postagem> listarPostagens() {
        return postagemService.listarPostagens();
    }

    @PostMapping
    public Postagem salvarPostagem(@RequestBody Postagem postagem) {
        return postagemService.salvarPostagem(postagem);
    }

    @GetMapping("/{id}")
    public Postagem buscarPostagem(@PathVariable Long id) {
        return postagemService.buscarPostagem(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPostagem(@PathVariable Long id) {
        postagemService.deletarPostagem(id);
    }
}
