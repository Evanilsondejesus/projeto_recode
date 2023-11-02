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
import model.Promocao;
 
	 
	

@WebServlet("/promo")
public class Promo extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 
		Promocao cdao = new Promocao();
	 
		
		List<Pacotes> listpromo = new ArrayList<Pacotes>();
		listpromo = cdao.getPromocao();
		req.setAttribute("pacotes_promo", listpromo);

	  
	   
	  
		 RequestDispatcher dispatcher = req.getRequestDispatcher("promo.jsp");
 		dispatcher.forward(req, resp);
     	}
	
	
	  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		*/

	
	
	
	
	