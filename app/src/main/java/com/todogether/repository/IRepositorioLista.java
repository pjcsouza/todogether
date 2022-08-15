package com.todogether.repository;

import java.util.List;

import com.todogether.entity.Lista;

public interface IRepositorioLista {
	public List<Lista> verListas();
	public Lista consultar(Long id);
	public void adicionar(Lista lista);
	public void deletarLista(Long id);

}
