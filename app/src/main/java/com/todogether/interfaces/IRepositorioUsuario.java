package com.todogether.repository;

import com.todogether.entity.Usuario;

public interface IRepositorioUsuario {
    public Usuario consultar(Long id);
    public Usuario consultar(String email);
	public void adicionar(Usuario usuario);
}
