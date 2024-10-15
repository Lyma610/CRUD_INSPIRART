package com.example.TCC.controller;

import com.example.TCC.model.Postagens;
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
    public List<Postagens> listarPostagens() {
        return postagemService.listarPostagens();
    }

    @GetMapping("/{id}")
    public Postagens buscarPostagem(@PathVariable Long id) {
        return postagemService.buscarPostagem(id);
    }

    @PostMapping
    public Postagens salvarPostagem(@RequestBody Postagens postagem) {
        return postagemService.salvarPostagem(postagem);
    }

    @DeleteMapping("/{id}")
    public void deletarPostagem(@PathVariable Long id) {
        postagemService.deletarPostagem(id);
    }
}
