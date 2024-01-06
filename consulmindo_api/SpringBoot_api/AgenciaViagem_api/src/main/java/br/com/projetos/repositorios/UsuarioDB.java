package br.com.projetos.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.projetos.entidades.Pacotes;
import br.com.projetos.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.query.Param;

public interface UsuarioDB extends JpaRepository<Usuario, Long> {
   
	
	 @Query("SELECT u FROM Usuario u WHERE u.email = ?1 AND u.senha = ?2")
	    Usuario findByNomeAndEmail(String email, String senha);
	 
	 
	 
	
	 
	 @Query("SELECT u.id FROM Usuario u WHERE u.email = ?1")
	    Long findIdByEmail(String email);
}



























