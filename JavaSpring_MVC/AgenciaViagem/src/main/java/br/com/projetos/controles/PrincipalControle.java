package br.com.projetos.controles;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.http.HttpSession;


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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import br.com.projetos.repositorios.PacotesDB;
import br.com.projetos.repositorios.UsuarioDB;


import br.com.projetos.repositorios.PacotesUserDB;


import br.com.projetos.repositorios.*;






import br.com.projetos.entidades.*;

@Controller
public class PrincipalControle {
 
   @Autowired
   private PacotesDB pacotesDB;

   @Autowired
   private UsuarioDB usuarioDB;
   
   @Autowired
   private PacotesUserDB pacotesuser;
    
   
  @GetMapping("/home")
  public  ModelAndView Home(HttpSession session) {
  ModelAndView modelAndView = new ModelAndView("home");
  
   List<Pacotes> pacotes = obterTodosPacotes();
   modelAndView.addObject("pacotes", pacotes);
   
   List<Pacotes> promocao = obterTodasPromocao();
   modelAndView.addObject("promocao", promocao);
    
  
   if (session.getAttribute("usuarioID") != null) {
    modelAndView.addObject("usuarioID", session.getAttribute("usuarioID"));
     
  Long  usuarioIdLong = (Long) session.getAttribute("usuarioID");
  int usuarioIdInt = usuarioIdLong.intValue();
    
     
  
    
    List<PacotesUser> pacotesUser = obterEmails(usuarioIdInt);
    modelAndView.addObject("pacote_user", pacotesUser);
       
    
    
   }else {
    modelAndView.addObject("usuarioID", null);
        	
    }
    	
        
   return modelAndView;
    }
    
  
  
  
   
    public List<Pacotes> obterTodosPacotes() {
        return pacotesDB.findAll();
    }
    
    
    
    public List<Pacotes> obterTodasPromocao() {
        return pacotesDB.findByNomeAndEmail();
    }
    
    
    
    
     
    public List<PacotesUser> obterEmails(int id) {
    	return pacotesuser.findByNomeAndEmail(id);
    	 
    } 
    
      
    
     
 
    
    @GetMapping("/contratar")
    public String contratar(@RequestParam int idPacote, @RequestParam int userID, PacotesUser contratar) {
       
    	contratar.setIdUser(userID);
    	contratar.setIdPacote(idPacote);
     
        pacotesuser.save(contratar);
       
         
        return "redirect:/home";
       
    }

      
    
    @GetMapping("/destino")
    public  ModelAndView Destino() {
    ModelAndView modelAndView = new ModelAndView("destino");
      	
          
     return modelAndView;
      }
      
       
    
    //promocao
    
    
    @GetMapping("/promocao")
    public  ModelAndView Promocao(HttpSession session) {
    ModelAndView modelAndView = new ModelAndView("promo");
    
    List<Pacotes> pacotes = obterTodosPacotes();
    modelAndView.addObject("pacotes", pacotes);
    


    List<Pacotes> promocao = obterTodasPromocao();
    modelAndView.addObject("promocao", promocao);

    
    if (session.getAttribute("usuarioID") != null) {
     modelAndView.addObject("usuarioID", session.getAttribute("usuarioID"));
    
     
     
    }
    
          
     return modelAndView;
      }
      
      
    
    
   
/*
    public List<Pacotes> obterTodosPacotes() {
        return pacotesDB.findAll();
    }
    
     */
    
     
    
    @GetMapping("/Contratado")
    public  ModelAndView Contratado(HttpSession session) {
    ModelAndView modelAndView = new ModelAndView("contratado");
      	
    

    
    
    if (session.getAttribute("usuarioID") != null) {
     modelAndView.addObject("usuarioID", session.getAttribute("usuarioID"));
      
   Long  usuarioIdLong = (Long) session.getAttribute("usuarioID");
   int usuarioIdInt = usuarioIdLong.intValue();
     
      
   
     
     List<PacotesUser> pacotesUser = obterEmails(usuarioIdInt);
     modelAndView.addObject("pacote_user", pacotesUser);
        
     
     
    }else {
     modelAndView.addObject("usuarioID", null);
         	
     }
     	 
    
          
     return modelAndView;
      }
      
    
/*
    public List<PacotesUser> obterEmails(int id) {
    	return pacotesuser.findByNomeAndEmail(id);
    	 
    } 
    
    */
    
    
    
    
    
    
    
    
    @GetMapping("/remover")
    public String contratar(@RequestParam int id) {
        PacotesUser pacoteUsuario = new PacotesUser();
       // contratar.setIdUser(userID);
        pacoteUsuario.setIdUser(id);
   
        

        return "redirect:/home";
    }
   
     
    
    
    
    @DeleteMapping("seuRecurso/{id}")
    public String deletarElementoPorId(@PathVariable Long id) {
  	  pacotesuser.deleteById(id);
  	  
  	  
  	  return "redirect:/home";  
  	 
    }
    
    
     
    
    
    
    
    
    
    
    
}







