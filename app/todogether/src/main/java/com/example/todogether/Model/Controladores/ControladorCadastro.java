package com.example.todogether.Model.Controladores;

import com.example.todogether.Model.Usuario.CadastroUsuario;
import com.example.todogether.Model.Usuario.Usuario;
import com.example.todogether.SubsistemaComunicacaoAPILoginGoogle.ISubsistemaComunicacaoAPILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControladorCadastro {
    @Autowired
    private CadastroUsuario cadastroUsuario;
    @Autowired
    private ISubsistemaComunicacaoAPILogin subsistemaComunicacaoAPILogin;

    public Boolean cadastrarUsuario(String email) {
        if(cadastroUsuario.consultarUsuarioPorEmail(email) != null) return false;

        String nome = subsistemaComunicacaoAPILogin.cadastrarUsuario(email);
        if(nome == null || nome.isEmpty()) { return false; }
        cadastroUsuario.adicionarUsuario(nome, email);

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
