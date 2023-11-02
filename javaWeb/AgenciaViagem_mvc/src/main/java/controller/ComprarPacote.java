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
 
	 
	

@WebServlet("/contrata")
public class ComprarPacote extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 
		int id = Integer.parseInt(req.getParameter("id"));
		int userid = Integer.parseInt(req.getParameter("userID"));
		int pagina = Integer.parseInt(req.getParameter("pagina"));
		
		
		PacotesUserSend user = new PacotesUserSend();	
		
		
		
		
		
		
		if(pagina == 1) {
			
			
			user.Comprar(userid, id);	
			
			resp.sendRedirect("home");
			
		}else if(pagina == 2) {
			
				
			user.Comprar(userid, id);	
			resp.sendRedirect("promo");
			
			
		}
		
		
		
		
	}}
		
		
		
		 

	
	
	
	
	