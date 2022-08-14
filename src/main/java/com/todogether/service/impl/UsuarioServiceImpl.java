package com.todogether.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todogether.entity.Usuario;
import com.todogether.form.UsuarioForm;
import com.todogether.form.UsuarioUpdateForm;
import com.todogether.repository.UsuarioRepository;
import com.todogether.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuario create(UsuarioForm form) {
		Usuario usuario = new Usuario();
		usuario.setNome(form.getNome());
		usuario.setEmail(form.getEmail());

		return repository.save(usuario);
	}
	
	@Override
	public Usuario get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Usuario> getAll(String nome) {
		if (nome == null) {
			return repository.findAll();
		} else {
			return repository.findByNome(nome);
		}
	}
	
	@Override
	public Usuario update(Long id, UsuarioUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	}

}
