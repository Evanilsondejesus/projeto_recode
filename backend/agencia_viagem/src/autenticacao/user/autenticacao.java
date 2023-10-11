package autenticacao.user;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
 

 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import conecao.db.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import home.user.*;







/*Main > usuario >
 * 
 * 
 * 
 * 
 * 
 */










public class autenticacao {

//interfaceuser  interfaceuser =	new  interfaceuser(); 
	  Scanner scanner = new Scanner(System.in);
		
 
 public boolean verificarEmail(String email) {
	 try {
 Connection connection = conexao.createConnectionToMysoL();
 Statement statement = connection.createStatement();
 //String consultaSQL = "SELECT * FROM usuarios WHERE email = 'eva@gmail.com'";
 
 
 String consultaSQL = "SELECT * FROM usuarios WHERE Email = '" + email +"'";

 ResultSet resultado = statement.executeQuery(consultaSQL);


  
return resultado.next();


 } catch (Exception e) {
 e.printStackTrace();
 
 return false;
 
	
 }
	 
	 
	 
	 
	 
	
}
	
 
 
 
 
 
 public void login(String email, int senha) { 
	 

try {
Connection connection = conexao.createConnectionToMysoL();
Statement statement = connection.createStatement();
//String consultaSQL = "SELECT * FROM usuarios WHERE email = 'eva@gmail.com' AND senha = '12412916' ";

String consultaSQL = "SELECT * FROM usuarios WHERE Email = '" + email +"'"+ "AND Senha ="+ "'"+senha+"'";










ResultSet resultado = statement.executeQuery(consultaSQL);



if(!(resultado.next()) ) {
System.out.print( "email ou senha não existem ou estão incorreto!!!");

	
	
}else {
	
	
	Userid(email);
	
	
}




 
 
} catch (Exception e) {
e.printStackTrace();
System.out.print("qual "+e);
//return false;

	
}


 
	
}
	

      
	
 
 
 
	
public void criar(String email, int senha) {
System.out.println(verificarEmail(email) == true ? "esse email já foi cadastrado" : "" );
	





if(!(verificarEmail(email))) {

	 
	
	

try {

	 Connection connection = conexao.createConnectionToMysoL();

	   
	    String insercaoSQL = "INSERT INTO usuarios (Email, Senha) VALUES (?, ?)";
	    PreparedStatement insercaoStatement = connection.prepareStatement(insercaoSQL);
	    insercaoStatement.setString(1, email);
	    insercaoStatement.setInt(2, senha);
	    
	    int linhasAfetadas = insercaoStatement.executeUpdate();
	     System.out.print("sua conta foi cadastrada com sucesso!! 11111");
	
	     Userid(email);

} catch (Exception e) {
	 
	 
}
}else {
	 System.out.print("deu error" );


	
	
}
		 






 		 
		 
}




public void Userid(String email) {
	 try {
Connection connection = conexao.createConnectionToMysoL();
Statement statement = connection.createStatement();
String consultaSQL = "SELECT * FROM usuarios WHERE Email = '" + email +"'";
 
ResultSet resultado = statement.executeQuery(consultaSQL);


		 
		 
		 
if(resultado.next()) {
int valor = resultado.getInt("usuarioID");
 


home interfaceuser =new home(valor);
interfaceuser.Logado();

 


}
		        
 } catch (Exception e) {
	
e.printStackTrace();
}
			 
			 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}













}
		 
		 
		 
		 
		
	
		

	
	

	
	

	
	
	
	
	
	
	
	
	
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	























