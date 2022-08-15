package com.todogether.SubsistemaComunicacaoAPILoginGoogle;

import com.todogether.entity.Usuario;

public class ComunicacaoAPILoginGoogle implements ISubsistemaComunicacaoAPILogin {
    
    @Override
    public Usuario cadastrarUsuario(String email) {
        String nome = "nome coletado do Google";
        return new Usuario(nome, email);
    }

    @Override
    public boolean verificarCredenciais(String email, String senha) {
        // Verificar na API do google se email e senha estão corretos
        return true;
    }
}
