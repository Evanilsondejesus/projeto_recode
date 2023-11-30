package br.com.projetos.controles;
import java.time.LocalDate;
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import br.com.projetos.repositorios.PacotesDB;
import br.com.projetos.repositorios.UsuarioDB;
import jakarta.transaction.Transactional;
import br.com.projetos.repositorios.PacotesUserDB;
import br.com.projetos.entidades.PacotesUser;

import br.com.projetos.repositorios.*;






import br.com.projetos.entidades.*;

 
@RestController
public class PrincipalControle {

    @Autowired
    private PacotesDB pacotesDB;

    
    @Autowired
    private PacotesUserDB pacotes_userDB;

    
   
    
    
    
    
     
    
    @GetMapping("/pacotes") // exibir pacotes disponivel, cujo  usuario escolher qual pacotes quer contratar
    public List<Pacotes> obterTodosPacotes() {
        return pacotesDB.findAll();
    }
    
    
    
    
    

    @GetMapping("/pacotes_user")   //Exibir uma lista personalizada dos pacotes  contratado pelo usuario
    public List<PacotesUser> PacotesUser() {
        return pacotes_userDB.findAll();
    }
    
     
     
    
    
    @PostMapping("/pacotes_user/{id}") //Maneira do usuario contrata o pacotes,
    public PacotesUser updateClient(@PathVariable int id, @RequestBody PacotesUser pacotesUser){
    	pacotesUser. setIdPacote(id); /* como meu banco de dados função TRIGGRE, só precisa do id para auto completa as colunas dos pacotes_user com informação de Pacotes
    	 */
    	
    	 return pacotes_userDB.save(pacotesUser); // Pacotes contratados são salvo em pacotes de usuarios(pacotes_user)
    }
    
    
    
 
    
    
    
   
    
    

@Transactional
@DeleteMapping("/pacotes_user/{id}")  // delete pacote
public void  deleteClient(@PathVariable int id){
//pacotes_userDB.deleteById(id);
pacotes_userDB.excluirPorId(id); // Metodos personalizado para deleta pacotes contratado em pacotes_user
	       
}

    
    
    
    



/*
   sobre outros metodos:
   
   atualmente meu modelo de negocio não usar outro metodos
 
 * 
 * 
 * 
 */
    
    
    
    
    
    
    
}






















