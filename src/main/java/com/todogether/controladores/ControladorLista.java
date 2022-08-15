package com.todogether.controladores;

import org.springframework.beans.factory.annotation.Autowired;

import com.todogether.cadastros.CadastroLista;

public class ControladorLista {
	
	private CadastroLista cadastroLista;
	
	public boolean criarLista(String nome, Long idUsuario) {
		this.cadastroLista.criarLista(nome,idUsuario);
		return true;
		
	}
	

	
	
	

}
