package com.example.TCC.model;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;

@Entity
@Table(name = "Salvar")
public class Salvar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_salvar")
    private Long idSalvar;

    @ManyToOne
    @JoinColumn(name = "id_postagem")
    private Postagem postagem;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "data_salvar")
    private LocalDateTime dataSalvar = LocalDateTime.now();

    // Getters e Setters


    public Long getIdSalvar() {
        return idSalvar;
    }

    public void setIdSalvar(Long idSalvar) {
        this.idSalvar = idSalvar;
    }

    public Postagem getPostagem() {
        return postagem;
    }

    public void setPostagem(Postagem postagem) {
        this.postagem = postagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataSalvar() {
        return dataSalvar;
    }

    public void setDataSalvar(LocalDateTime dataSalvar) {
        this.dataSalvar = dataSalvar;
    }
}
