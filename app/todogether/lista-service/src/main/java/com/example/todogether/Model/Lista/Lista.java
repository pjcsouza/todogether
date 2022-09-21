package com.example.todogether.Model.Lista;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "listas")
public class Lista {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //@Column(name = "nome")
    private String nome;

    @ElementCollection
    //@Column(name = "idUsuarios")
    private List<Long> idUsuarios;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Long> getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(List<Long> idUsuarios) {
        this.idUsuarios = idUsuarios;
    }
}
