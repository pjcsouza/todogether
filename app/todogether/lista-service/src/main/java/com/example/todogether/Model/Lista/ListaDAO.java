package com.example.todogether.Model.Lista;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListaDAO extends JpaRepository<Lista, Long> {
    Lista findFirstByIdAndAndIdUsuariosContains(Long idLista, Long idUsuario);
    List<Lista> findAllByIdUsuariosContaining(Long idUsuario);
}