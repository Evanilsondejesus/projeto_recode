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

@WebServlet("/Salvar")
public class Autenticacao extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

// pegar os paramentros

String email = request.getParameter("email");
int senha = Integer.parseInt(request.getParameter("senha"));
String estado = request.getParameter("estado"); //login ou cadastrar
String result; //resultado do login ou cadastrar		
	


Usuario objUsuario =  new Usuario();
objUsuario.setEmail(email);
objUsuario.setSenha(senha);


UsuarioSend send = new UsuarioSend();		

 
if(estado.equals("Login") ) {


result = send.login(objUsuario);
 

if(result.equals("logado") ) {
 
RequestDispatcher dispatcher = request.getRequestDispatcher("sucesso.html");
dispatcher.forward(request, response);	
 
HttpSession session = request.getSession(); //armazenar a cessão do usuario logado na aplição
int userID = objUsuario.userID(email);


String[] dadosUsers = new String[]{email, String.valueOf(userID)};  
session.setAttribute("user",dadosUsers);
	
 


	
}else {
//caso login não de certo
RequestDispatcher dispatcher = request.getRequestDispatcher("error.html");
dispatcher.forward(request, response);	
	
}
  





}else {
	 
//caso cadastro

result = send.criar(objUsuario);

if(result.equals("criado") ) {
RequestDispatcher dispatcher = request.getRequestDispatcher("sucesso.html");
dispatcher.forward(request, response);	
 

HttpSession session = request.getSession();
int userID = objUsuario.userID(email);
String[] dadosUsers = new String[]{email, String.valueOf(userID)};  
session.setAttribute("user",dadosUsers);
	
	
}else {

RequestDispatcher dispatcher = request.getRequestDispatcher("error.html");
dispatcher.forward(request, response);	
	
}
  
    }
	}
}



















