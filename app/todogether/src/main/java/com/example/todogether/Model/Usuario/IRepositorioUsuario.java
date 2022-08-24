package com.example.todogether.Model.Usuario;

import java.util.List;

public interface IRepositorioUsuario {
    List<Usuario> consultarTodosUsuarios();
    void adicionarUsuario(Usuario usuario);
    Usuario consultarUsuarioPorId(long id);
    Usuario consultarUsuarioPorEmail(String email);
    void deletarUsuarioPorId(long id);
}
