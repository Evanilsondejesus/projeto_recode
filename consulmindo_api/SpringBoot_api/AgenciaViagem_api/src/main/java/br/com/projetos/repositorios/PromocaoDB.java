package br.com.projetos.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.projetos.entidades.Pacotes;
import br.com.projetos.entidades.PacotesUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.query.Param;

public interface PromocaoDB extends JpaRepository<Pacotes, Long> {
 List<Pacotes> findAll();
	 
	
//@Query("SELECT u FROM Pacotes u WHERE u.desconto > 0")
//	List<Pacotes> findPacotesComDesconto();

	 



@Query("SELECT p FROM Pacotes p WHERE p.desconto > 0")
List<Pacotes>  findPacotesComDesconto();


 
	 
	 
	 
	 
}
