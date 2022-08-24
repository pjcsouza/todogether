package com.example.todogether.SubsistemaComunicacaoAPILoginGoogle;

import com.example.todogether.Model.Usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ComunicacaoAPILoginGoogle implements ISubsistemaComunicacaoAPILogin {

    @Autowired
    private UsuarioGoogleDAO usuarioGoogleDAO;

    @Override
    public String cadastrarUsuario(String email) {
        Optional<UsuarioGoogle> optional = usuarioGoogleDAO.findById(email);
        UsuarioGoogle usuario = null;
        if(optional.isPresent()) {
            usuario = optional.get();
        } else {
            throw new RuntimeException("Usuario com email " + email + " não encontrado");
        }

        return usuario.getNome();
    }

    @Override
    public Boolean verificarCredenciais(String email, String senha) {
        Optional<UsuarioGoogle> optional = usuarioGoogleDAO.findById(email);
        UsuarioGoogle usuario = null;
        if(optional.isPresent()) {
            usuario = optional.get();
        } else {
            throw new RuntimeException("Usuario com email " + email + " não encontrado");
        }
        return usuario.getSenha().equals(senha);
    }
}
