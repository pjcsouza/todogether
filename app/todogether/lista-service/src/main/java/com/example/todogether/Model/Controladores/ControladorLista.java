package com.example.todogether.Model.Controladores;

import com.example.todogether.Model.Lista.CadastroLista;
import com.example.todogether.Model.Lista.Lista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControladorLista {

    @Autowired
    private CadastroLista cadastroLista;

    public void criarLista(String nome, Long idUsuario) {
        cadastroLista.adicionarLista(nome, idUsuario);
    }

    public List<Lista> consultarTodasListas(Long idUsuario) {
        return cadastroLista.consultarTodasListas(idUsuario);
    }
}
