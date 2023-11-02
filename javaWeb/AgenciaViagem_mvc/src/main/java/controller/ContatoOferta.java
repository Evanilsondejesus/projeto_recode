package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuario;
import model.UsuarioSend;
import model.Promocao;
import model.Pacotes;

@WebServlet("/Receber_oferta")
public class ContatoOferta extends HttpServlet {
	
	
/* pegar o email do usuarios para que possar receber ofertas
 * 
 * 
 * 
 * 
 * *\
 */
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 		
		String email = request.getParameter("email");
		 
		
		
		 
		
		 UsuarioSend cdao = new UsuarioSend();		
		String result = cdao.Contato_oferta(email);
		
		

				
		if(result.equals("criado") ) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("sucesso.html");
			dispatcher.forward(request, response);	

			 
			
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.html");
			dispatcher.forward(request, response);	
			
		}




		

 }




}














