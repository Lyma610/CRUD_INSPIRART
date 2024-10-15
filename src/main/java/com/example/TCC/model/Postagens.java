package com.example.TCC.model;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;

@Entity
@Table(name = "Postagens")
public class Postagens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_postagem;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private String conteudo;
    private LocalDateTime data_postagem = LocalDateTime.now();
    private String imagem;

    // Getters e Setters


    public Long getIdPostagem() {
        return id_postagem;
    }

    public void setIdPostagem(Long idPostagem) {
        this.id_postagem = idPostagem;
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

    public LocalDateTime getDataPostagem() {
        return data_postagem;
    }

    public void setDataPostagem(LocalDateTime dataPostagem) {
        this.data_postagem = dataPostagem;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}