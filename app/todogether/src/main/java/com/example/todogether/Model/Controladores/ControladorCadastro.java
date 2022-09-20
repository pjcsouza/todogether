package com.example.todogether.Model.Controladores;

import com.example.todogether.Model.Usuario.CadastroUsuario;
import com.example.todogether.Model.Usuario.Usuario;
import com.example.todogether.SubsistemaComunicacaoAPILogin.ISubsistemaComunicacaoAPILogin;
import com.example.todogether.SubsistemaComunicacaoAPILogin.IUsuarioAPILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControladorCadastro {
    @Autowired
    private CadastroUsuario cadastroUsuario;
    @Autowired
    private ISubsistemaComunicacaoAPILogin subsistemaComunicacaoAPILogin;

    public Boolean cadastrarUsuario() {
        IUsuarioAPILogin usuarioAPILogin = subsistemaComunicacaoAPILogin.cadastrarUsuario();

        try {
            cadastroUsuario.consultarUsuarioPorEmail(usuarioAPILogin.getEmail());
        } catch (Exception e) {
            cadastroUsuario.adicionarUsuario(usuarioAPILogin.getNome(), usuarioAPILogin.getEmail());
        }
        return true;
    }

    public List<Usuario> consultarTodosUsuarios() {
        return cadastroUsuario.consultarTodosUsuarios();
    }

    public void adicionarUsuario(Usuario usuario) {
        cadastroUsuario.adicionarUsuario(usuario.getNome(), usuario.getEmail());
    }

    public Usuario consultarUsuarioPorId(long id) {
        return cadastroUsuario.consultarUsuarioPorId(id);
    }

    public void deletarUsuarioPorId(long id) {
        cadastroUsuario.deletarUsuarioPorId(id);
    }
}
