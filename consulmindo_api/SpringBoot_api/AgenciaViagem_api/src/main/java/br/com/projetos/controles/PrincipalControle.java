package br.com.projetos.controles;
import java.time.LocalDate;
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import br.com.projetos.repositorios.PromocaoDB;
import br.com.projetos.repositorios.UsuarioDB;
import jakarta.transaction.Transactional;
import br.com.projetos.repositorios.PacotesUserDB;
import br.com.projetos.entidades.PacotesUser;

import br.com.projetos.repositorios.*;






import br.com.projetos.entidades.*;

 
@RestController
@CrossOrigin(origins = "*")
public class PrincipalControle {

    @Autowired
    private PacotesDB pacotesDB;

    @Autowired
    private PromocaoDB PromocaoDB;

    @Autowired
    private PacotesUserDB pacotes_userDB;
    
     
    
    

    @CrossOrigin(origins = "*")
    @GetMapping("/pacotes") // exibir pacotes disponivel, cujo  usuario escolher qual pacotes quer contratar
    public List<Pacotes> obterTodosPacote() {
    return pacotesDB.findAll();
        
        
    }
    
    
    @CrossOrigin(origins = "*")
    @GetMapping("/promocao")
    public List<Pacotes> getPacotesComDesconto() {
        return PromocaoDB.findPacotesComDesconto();
    }
    
    
    
     
     
    @GetMapping("/pacotes_user")   //Exibir uma lista personalizada dos pacotes  contratado pelo usuario
    public List<PacotesUser> PacotesUser() {
        return pacotes_userDB.findAll();
    }
    
    
    
   
   
    
    @GetMapping("/pacotes_user/{id}")
    public List<PacotesUser> getPacotesByUserId(@PathVariable String id) {
        return pacotes_userDB.findByUserId(id);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
 
    @PostMapping("/pacotes_user/")  
    public PacotesUser updateClient(@RequestBody PacotesUser pacotesUser){
    	System.out.print(pacotesUser.getUserId());
    	
    return pacotes_userDB.save(pacotesUser);  
    }
    
    
    

    
    
    
    
    
    
    
    
    /*
    @GetMapping("/pacotes_user/")  
    public PacotesUser updClient(@RequestBody PacotesUser pacotesUser){
    	System.out.print(pacotesUser.getUserId());
    	
    return pacotes_userDB.save(pacotesUser); // Pacotes contratados são salvo em pacotes de usuarios(pacotes_user)
    }
    
    
    */
    
    
    
    
  
    
    
    
    
    
    
    
/*
@Transactional
@DeleteMapping("/pacotes_user/{id}")  // delete pacote
public void  deleteClient(@PathVariable int id){
//pacotes_userDB.deleteById(id);
pacotes_userDB.excluirPorId(id); // Metodos personalizado para deleta pacotes contratado em pacotes_user
	       
}

   */ 
    
    
    



/*
* Sobre outros metodos:
* Atualmente meu modelo de negocio não usar outro metodos
 
  
 */
    
    
    
    
    
    
    
}






















