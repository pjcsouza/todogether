package com.todogether.controladores;

import com.todogether.SubsistemaComunicacaoAPILoginGoogle.ComunicacaoAPILoginGoogle;
import com.todogether.SubsistemaComunicacaoAPILoginGoogle.ISubsistemaComunicacaoAPILogin;
import com.todogether.repository.IRepositorioLista;
import com.todogether.repository.IRepositorioUsuario;
import com.todogether.repository.RepositorioLista;
import com.todogether.repository.RepositorioUsuario;

public class Fachada {

    private static Fachada instancia;

    private ControladorCadastro controladorCadastro;
    private ControladorLista controladorLista;

    private Fachada() {}

    public static Fachada shared() {
        if (instancia == null) {
            instancia = new Fachada();
        } 

        return instancia;
    }

    public boolean cadastrarUsuario(String email) {
        if (controladorCadastro == null) {
            IRepositorioUsuario repositorioUsuario = new RepositorioUsuario();
            ISubsistemaComunicacaoAPILogin comunicacaoAPILogin = new ComunicacaoAPILoginGoogle();

            controladorCadastro = new ControladorCadastro(repositorioUsuario, comunicacaoAPILogin);
        }

        return controladorCadastro.cadastrarUsuario(email);
    }

    public boolean criarLista(String nome, Long idUsuario) {
        if (controladorLista == null) {
            IRepositorioLista repositorioLista = new RepositorioLista();
            controladorLista = new ControladorLista(repositorioLista);
        }

        return controladorLista.criarLista(nome, idUsuario);
    }
}
