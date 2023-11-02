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
 
	 
	

@WebServlet("/logout")
public class Lagout extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
HttpSession session = req.getSession(false);
session.invalidate();
 


RequestDispatcher dispatcher = req.getRequestDispatcher("home");
dispatcher.forward(req, resp);
		
	 	 
		
		
	}}
		
		
		
		 

	
	
	
	
	