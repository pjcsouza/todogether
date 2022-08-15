package com.todogether.DAO;
import com.todogether.entity.Lista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ListaDAO extends JpaRepository<Lista, Long>{
	@Query("select e from FCity e where  e.cityId = :id")
	Lista findOne(@Param("id") Long id);

}
