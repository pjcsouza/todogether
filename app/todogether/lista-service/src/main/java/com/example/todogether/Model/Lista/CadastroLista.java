package com.example.todogether.Model.Lista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CadastroLista {

    @Autowired
    private IRepositorioLista repositorioLista;

    public void adicionarLista(String nome, Long idUsuario) {
        Lista lista = new Lista();
        lista.setNome(nome);
        lista.setIdUsuarios(Arrays.asList(idUsuario));

        repositorioLista.adicionarLista(lista);
    }

    public List<Lista> consultarTodasListas(Long idUsuario) {
        return repositorioLista.consultarTodasListasPorUsuario(idUsuario);
    }
}
