package com.todogether.service;

import java.util.List;

import com.todogether.entity.Usuario;
import com.todogether.form.UsuarioForm;
import com.todogether.form.UsuarioUpdateForm;

public interface IUsuarioService {
	
	Usuario create(UsuarioForm form);
	
	Usuario get(Long id);
	
	List<Usuario> getAll(String nome);
	
	Usuario update(Long id, UsuarioUpdateForm formUpdate);
	
	void delete(Long id);

}
