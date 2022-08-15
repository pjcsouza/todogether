package com.todogether.DAO;
import com.todogether.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioDAO extends JpaRepository<Usuario, String>{
    @Query("select u from Usuarios u where  u.id = :id")
	Usuario findOne(@Param("email") Long id);

	@Query("select u from Usuarios u where  u.email = :email")
	Usuario findOne(@Param("email") String email);
}
