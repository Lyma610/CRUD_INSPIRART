package com.example.TCC.model;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;

@Entity
@Table(name = "Comentarios")
public class Comentarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_comentario")
    private Long idComentario;

    @ManyToOne
    @JoinColumn(name = "id_postagem")
    private Postagens postagem;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "conteudo")
    private String conteudo;

    @Column(name = "data_comentario")
    private LocalDateTime dataComentario = LocalDateTime.now();

    // Getters e Setters


    public Long getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Long idComentario) {
        this.idComentario = idComentario;
    }

    public Postagens getPostagem() {
        return postagem;
    }

    public void setPostagem(Postagens postagem) {
        this.postagem = postagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataComentario() {
        return dataComentario;
    }

    public void setDataComentario(LocalDateTime dataComentario) {
        this.dataComentario = dataComentario;
    }
}
