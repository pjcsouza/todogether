package com.todogether.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Lista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String nome;
	private List<Long> idUsuarios;
	
	public Lista (String nome, List<Long> idUsuarios) {
		this.nome = nome;
		this.idUsuarios = idUsuarios;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
        return id;
    }
    public Lista(String nome) {
    	this.nome = nome;
    }
	public List<Long> getIdUsuarios() {
		return idUsuarios;
	}
	public void setIdUsuarios(List<Long> idUsuarios) {
		this.idUsuarios = idUsuarios;
	}
	

}
