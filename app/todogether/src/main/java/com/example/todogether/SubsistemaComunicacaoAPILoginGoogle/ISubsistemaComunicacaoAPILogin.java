package com.example.todogether.SubsistemaComunicacaoAPILoginGoogle;

import com.example.todogether.Model.Usuario.Usuario;

public interface ISubsistemaComunicacaoAPILogin {
    String cadastrarUsuario(String email);
    Boolean verificarCredenciais(String email, String senha);
}
