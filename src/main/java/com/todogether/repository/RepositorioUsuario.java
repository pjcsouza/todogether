package com.todogether.repository;

import org.springframework.beans.factory.annotation.Autowired;

import com.todogether.DAO.UsuarioDAO;
import com.todogether.entity.Usuario;

public class RepositorioUsuario implements IRepositorioUsuario {
    
    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
	public Usuario consultar(Long id) {
		return usuarioDAO.findOne(id);		
	}
	
	@Override
	public Usuario consultar(String email) {
		return usuarioDAO.findOne(email);		
	}

	@Override
	public void adicionar(Usuario usuario) {
		usuarioDAO.save(usuario);
	}
}
