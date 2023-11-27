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
public class UsuarioController {
 
   @Autowired
   private PacotesDB pacotesDB;

   @Autowired
   private UsuarioDB usuarioDB;
   
   @Autowired
   private PacotesUserDB pacotesuser;
   
   
    
    

   
   @GetMapping("/autenticacao")
   public String mostrarFormulario(Model model) {
       model.addAttribute("usuario", new Usuario());
       return "autenticacao";
   }


   
   @PostMapping("/cadastrar")
   public String processarFormulario(Usuario usuario, HttpSession session) {
   	
       try {
           usuarioDB.save(usuario);
           Long usuarioID = usuarioDB.findIdByEmail(usuario.getEmail());
       	session.setAttribute("usuarioID", usuarioID);
            
           
           return "redirect:/result/sucesso.html";
       } catch (DataIntegrityViolationException e) {
           
       	  return "redirect:/result/error.html"; //caso exista chave duplas
       } catch (Exception e) {
          
           return "redirect:/result/error.html";
       } 
   }
   
   
   
   
   @PostMapping("/login")
   public String login(Usuario usuario,  HttpSession session) {
   	 String email = usuario.getEmail();
   	 String senha = usuario.getSenha();

   	 
   	 Usuario usuarioEncontrado = usuarioDB.findByNomeAndEmail(email, senha);
   	 Long usuarioID = usuarioDB.findIdByEmail(email);

   	 
        if (usuarioEncontrado != null) {
        
       	 session.setAttribute("usuarioID", usuarioID);
        	
        	
       	 
            return "redirect:/result/sucesso.html";
       	 
        } else {
            
            return "redirect:/result/error.html";
        }
 
}

    
    @GetMapping("/logout")
    public String sair(HttpSession session) {
        session.invalidate();
         
        return "redirect:/home";
    }
    
    
      
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    
    
    
    
    
    
    
    
    

}







