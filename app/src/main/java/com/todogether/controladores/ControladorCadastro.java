package com.todogether.controladores;

import java.util.regex.Pattern;

import com.todogether.cadastros.CadastroUsuario;
import com.todogether.entity.Usuario;
import com.todogether.repository.IRepositorioUsuario;
import com.todogether.SubsistemaComunicacaoAPILoginGoogle.ISubsistemaComunicacaoAPILogin;

public class ControladorCadastro {

	private CadastroUsuario cadastroUsuario;
	private ISubsistemaComunicacaoAPILogin comunicacaoAPILogin;

	public ControladorCadastro(	IRepositorioUsuario repositorioUsuario,
								ISubsistemaComunicacaoAPILogin comunicacaoAPILogin) {
		this.cadastroUsuario = new CadastroUsuario(repositorioUsuario);
		this.comunicacaoAPILogin = comunicacaoAPILogin;
	}

	public boolean cadastrarUsuario(String email) {
		if (validarEmail(email) == false) { return false; }
		Usuario usuario = comunicacaoAPILogin.cadastrarUsuario(email);
		return cadastroUsuario.adicionarUsuario(usuario);
	}

	private boolean validarEmail(String email) {
		String emailPattern = "^(.+)@(\\S+)$";
		return Pattern.compile(emailPattern)
				.matcher(email)
				.matches();
	}
}
