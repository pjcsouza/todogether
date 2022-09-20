package com.example.todogether.Model;

import com.example.todogether.Model.Controladores.ControladorCadastro;
import com.example.todogether.Model.Controladores.ControladorLista;
import com.example.todogether.Model.Controladores.ControladorLogin;
import com.example.todogether.Model.Lista.Lista;
import com.example.todogether.Model.Usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Fachada {
    @Autowired
    private ControladorCadastro controladorCadastro;
    @Autowired
    private ControladorLogin controladorLogin;
    @Autowired
    private ControladorLista controladorLista;

    public Boolean cadastrarUsuario() {
        return controladorCadastro.cadastrarUsuario();
    }

    public Boolean requestLogin() {
        return controladorLogin.requisitarLogin();
    }

    public void criarLista(String nome, Long idUsuario) {
        controladorLista.criarLista(nome, idUsuario);
    }

    public List<Lista> consultarTodasListas(Long idUsuario) {
        return controladorLista.consultarTodasListas(idUsuario);
    }

    public List<Usuario> consultarTodosUsuarios() {
        return controladorCadastro.consultarTodosUsuarios();
    }

    public void adicionarUsuario(Usuario usuario) {
        controladorCadastro.adicionarUsuario(usuario);
    }

    public Usuario consultarUsuarioPorId(long id) {
        return controladorCadastro.consultarUsuarioPorId(id);
    }

    public void deletarUsuarioPorId(long id) {
        controladorCadastro.deletarUsuarioPorId(id);
    }
}
