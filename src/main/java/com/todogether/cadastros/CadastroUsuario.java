package com.todogether.cadastros;

import com.todogether.entity.Usuario;
import com.todogether.repository.IRepositorioUsuario;

public class CadastroUsuario {
	
	private IRepositorioUsuario repositorio;

	public CadastroUsuario(IRepositorioUsuario repositorio) {
		this.repositorio = repositorio;
	}

	public boolean adicionarUsuario(Usuario usuario) {
		repositorio.adicionar(usuario);
		return true;
	}

	public boolean usuarioExiste(Long id) {
		return false;
	}

	public Usuario consultarUsuario(String email) {
		return repositorio.consultar(email);
	}

}
