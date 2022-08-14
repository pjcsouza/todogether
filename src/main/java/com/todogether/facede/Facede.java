package com.todogether.facede;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.todogether.controller.ControladorCadastro;
import com.todogether.controller.ControladorItem;
import com.todogether.controller.ControladorLista;
import com.todogether.controller.ControladorLogin;


@Component
public class Facede {
	@Autowired private ControladorCadastro controladorCadastro;

	@Autowired private ControladorLogin controladorLogin;

	@Autowired private ControladorLista controladorLista;

	@Autowired private ControladorItem controladorItem;
	
	public boolean cadastrarUsuario(String email) {
		return this.controladorCadastro.cadastrarUsuario(email);
	}
	public char requestLogin(String email, String senha) {
		return this.controladorLogin.efetuarLogin(email, senha);
	}
	public boolean criarLista(String nome) {
		return this.controladorLista.criarLista(nome);
	}
	public boolean criarItem(String nome, Long idLista) {
		return this.controladorItem.criarItem(nome, idLista);
	}

	public void compartilharLista(Long idUsuario, Long idLista) {
		this.controladorLista.compartilharLista(idUsuario, idLista);
	}

}

