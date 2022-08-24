package com.example.todogether.SubsistemaComunicacaoAPILoginGoogle;

import javax.persistence.*;

@Entity
@Table(name = "usuariosgoogle")
public class UsuarioGoogle {

    @Column(name = "nome")
    private String nome;

    @Column(name = "senha")
    private String senha;

    @Id
    @Column(name = "email")
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String nome) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}