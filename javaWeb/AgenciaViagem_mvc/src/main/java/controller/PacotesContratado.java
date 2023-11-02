package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pacotes;
import model.PacotesUser;
import model.PacotesUserSend;
import model.Promocao;
 
	 
	

@WebServlet("/Contratado")
public class PacotesContratado extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		

		HttpSession session = req.getSession();
		
		   PacotesUserSend cdao = new PacotesUserSend();
		     
		  
		
		if (session != null) {
		    HttpSession session2 = req.getSession();
		    String[] seuMeu = (String[]) session2.getAttribute("user");
		    
		    

		    if (seuMeu != null && seuMeu.length >= 2) {
		        int userID = Integer.parseInt(seuMeu[1]);
		        
		        List<PacotesUser> pacotesUser = new ArrayList<PacotesUser>();
		        PacotesUserSend cda = new PacotesUserSend();
		        pacotesUser = cda.getPacotesUser(userID);
		       
		        req.setAttribute("pacotesuser", pacotesUser);
		    } else {
		         
		    	
		    }
		} else {
		    
		}

	  
		
		
	  
		 RequestDispatcher dispatcher = req.getRequestDispatcher("Contratado.jsp");
 		dispatcher.forward(req, resp);
     	}
	
	
	  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		*/

	
	
	
	
	