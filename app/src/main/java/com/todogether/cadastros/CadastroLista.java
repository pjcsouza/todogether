package com.todogether.cadastros;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.todogether.entity.Lista;
import com.todogether.repository.IRepositorioLista;

public class CadastroLista {

	private IRepositorioLista repositorioLista;

	public CadastroLista(IRepositorioLista repositorioLista) {
		this.repositorioLista = repositorioLista;
	}
	
	public void criarLista(String nome, Long idUsuario) {
		List<Long> listaIdUsuarios = new ArrayList<>();
		listaIdUsuarios.add(idUsuario);
		Lista lista = new Lista(nome, listaIdUsuarios);
		repositorioLista.adicionar(lista);
	}

	public void editarLista(String nome, Long idLista) {
		Lista listaAntiga = repositorioLista.consultar(idLista);
		Lista lista = new Lista(nome, listaAntiga.getIdUsuarios());
		repositorioLista.deletarLista(listaAntiga.getId());
		repositorioLista.adicionar(lista);
	}

	public List<Lista> verListas(String nome, Long idUsuario) {
		return repositorioLista.verListas();
	}

	public void excluirLista(Long idLista) {
		
		repositorioLista.deletarLista(idLista);
	}
	
}