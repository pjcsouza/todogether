package com.todogether.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.todogether.DAO.ListaDAO;
import com.todogether.entity.Lista;

public class RepositorioLista implements IRepositorioLista {

	@Autowired
    private ListaDAO listaDAO;
	
	@Override
	public Lista consultar(Long id) {
		return listaDAO.findOne(id);		
	}

	@Override
	public void adicionar(Lista lista) {
		listaDAO.save(lista);
		
	}

	@Override
	public void deletarLista(Long id) {
		listaDAO.deleteById(id);
		
	}

	@Override
	public List<Lista> verListas() {
		return listaDAO.findAll();
	}
	

	
}
