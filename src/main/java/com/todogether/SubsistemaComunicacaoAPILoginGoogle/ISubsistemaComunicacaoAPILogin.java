package com.todogether.SubsistemaComunicacaoAPILoginGoogle;

import com.todogether.entity.Usuario;

public interface ISubsistemaComunicacaoAPILogin {
    public Usuario cadastrarUsuario(String email);
    public boolean verificarCredenciais(String email, String senha);
}
