package com.example.todogether.Model.Lista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RepositorioLista implements IRepositorioLista {

    @Autowired
    private ListaDAO listaDAO;

    @Override
    public List<Lista> consultarTodasListasPorUsuario(Long idUsuario) {
        return listaDAO.findAllByIdUsuariosContaining(idUsuario);
    }

    @Override
    public Lista consultarLista(Long idLista, Long idUsuario) {
        return listaDAO.findFirstByIdAndAndIdUsuariosContains(idLista, idUsuario);
    }

    @Override
    public void adicionarLista(Lista lista) {
        listaDAO.save(lista);
    }
}
