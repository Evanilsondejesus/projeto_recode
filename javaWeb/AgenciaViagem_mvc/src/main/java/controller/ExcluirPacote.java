package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 import model.Promocao;
import model.PacotesUserSend;
@WebServlet("/excluir")
public class ExcluirPacote extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idContato = Integer.parseInt(req.getParameter("id"));


	PacotesUserSend cdao = new PacotesUserSend();
	cdao.removeById(idContato);

	
	
	
	
	
	int pagina = Integer.parseInt(req.getParameter("pagina"));
	
	
	
	
	
	
	if(pagina == 1) {
		
		  
		resp.sendRedirect("home");
		
	}else if(pagina == 2) {
		
	  
		
		resp.sendRedirect("Contratado");
		
		
	}
	
	
	
	
	
		 
	}

}
