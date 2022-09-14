package com.example.todogether.Model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {
    Usuario findFirstByEmail(String email);
}
