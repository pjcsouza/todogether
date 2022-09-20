package com.example.todogether.Model.Controladores;

import com.example.todogether.Model.Usuario.CadastroUsuario;
import com.example.todogether.Model.Usuario.Usuario;
import com.example.todogether.SubsistemaComunicacaoAPILogin.ISubsistemaComunicacaoAPILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControladorLogin {

    @Autowired
    private CadastroUsuario cadastroUsuario;

    @Autowired
    private ISubsistemaComunicacaoAPILogin subsistemaComunicacaoAPILogin;

    public Boolean requisitarLogin() {
        String email = subsistemaComunicacaoAPILogin.consultarEmail();
        if(email == null) return null;

        Usuario usuario = cadastroUsuario.consultarUsuarioPorEmail(email);
        Usuario.atual = usuario;
        return usuario != null;
    }
}
