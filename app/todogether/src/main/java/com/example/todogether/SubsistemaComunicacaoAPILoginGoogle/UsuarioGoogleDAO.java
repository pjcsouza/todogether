package com.example.todogether.SubsistemaComunicacaoAPILoginGoogle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioGoogleDAO extends JpaRepository<UsuarioGoogle, String> {
}
