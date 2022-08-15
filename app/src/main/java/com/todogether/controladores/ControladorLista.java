package com.todogether.controladores;

import com.todogether.cadastros.CadastroLista;
import com.todogether.repository.IRepositorioLista;

public class ControladorLista {
	
	private CadastroLista cadastroLista;

	public ControladorLista(IRepositorioLista repositorioLista) {
		this.cadastroLista = new CadastroLista(repositorioLista);
	}
	
	public boolean criarLista(String nome, Long idUsuario) {
		this.cadastroLista.criarLista(nome,idUsuario);
		return true;
	}
}
