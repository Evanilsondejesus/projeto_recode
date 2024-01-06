package br.com.projetos.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import br.com.projetos.entidades.Pacotes;
import br.com.projetos.entidades.PacotesUser;
import br.com.projetos.entidades.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.query.Param;

public interface PacotesUserDB extends JpaRepository<PacotesUser, Long> {
 
	 List<PacotesUser> findAll();
	 
	 
	  
	 
	 
	 @Query("SELECT u FROM PacotesUser u WHERE u.userId = :userId")
	  List<PacotesUser> findByUserId(@Param("userId") String userId);
  
	 
	 
	
	 
	 
	 
	 
	// @Modifying
	//@Query("DELETE FROM PacotesUser p WHERE p.id = :id")
	/// int excluirPorId(@Param("id") int id);
	 
	 
	 
	 
	 
	 @Modifying
	@Query("DELETE FROM PacotesUser p WHERE p.idPacote = :id")
	 int excluirPorId(@Param("id") int id);
		 
	 
	 
	 
	 
}













