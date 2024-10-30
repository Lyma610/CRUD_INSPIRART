package com.example.TCC.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "postagens")
public class Postagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postagemId;

    private String conteudo;
    private LocalDateTime dataPostagem;
    private String imagem;

    // Construtor padrão
    public Postagem() {
        this.dataPostagem = LocalDateTime.now(); // Inicialize a data no construtor
    }

    // Getters e Setters
    public Long getPostagemId() {
        return postagemId;
    }

    public void setPostagemId(Long postagemId) {
        this.postagemId = postagemId;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(LocalDateTime dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
