package com.example.TCC.controller;

import com.example.TCC.model.Comentarios;
import com.example.TCC.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5174")
@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    // Endpoint para listar todos os comentários
    @GetMapping
    public List<Comentarios> listarComentarios() {
        return comentarioService.listarComentarios();
    }

    // Endpoint para buscar um comentário por ID
    @GetMapping("/{id}")
    public ResponseEntity<Comentarios> buscarComentarioPorId(@PathVariable Long id) {
        return comentarioService.buscarComentarioPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Endpoint para salvar um novo comentário
    @PostMapping
    public Comentarios salvarComentario(@RequestBody Comentarios comentario) {
        return comentarioService.salvarComentario(comentario);
    }

    // Endpoint para atualizar um comentário
    @PutMapping("/{id}")
    public ResponseEntity<Comentarios> atualizarComentario(@PathVariable Long id,
                                                           @RequestBody Comentarios comentario) {
        return ResponseEntity.ok(comentarioService.atualizarComentario(id, comentario));
    }

    // Endpoint para excluir um comentário
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirComentario(@PathVariable Long id) {
        comentarioService.excluirComentario(id);
        return ResponseEntity.noContent().build();
    }
}

