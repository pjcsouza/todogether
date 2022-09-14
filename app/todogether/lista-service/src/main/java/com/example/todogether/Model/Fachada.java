package com.example.todogether.Model;


import com.example.todogether.Model.Controladores.ControladorLista;

import com.example.todogether.Model.Lista.Lista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Fachada {

    @Autowired
    private ControladorLista controladorLista;



    public void criarLista(String nome, Long idUsuario) {
        controladorLista.criarLista(nome, idUsuario);
    }

    public List<Lista> consultarTodasListas(Long idUsuario) {
        return controladorLista.consultarTodasListas(idUsuario);
    }


}
