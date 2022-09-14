package com.example.todogether.Model.Lista;

import java.util.List;

public interface IRepositorioLista {
    List<Lista> consultarTodasListasPorUsuario(Long idUsuario);
    Lista consultarLista(Long idLista, Long idUsuario);
    void adicionarLista(Lista lista);
}
