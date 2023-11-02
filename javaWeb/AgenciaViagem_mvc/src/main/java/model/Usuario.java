package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Usuario {
    private String email;
    private int senha;
    private String msg;
    
    

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
    
    
    public void setMsg(String msg) {
        this.msg = msg;
    } 

    public String getMsg() {
        return msg;
    }
    
    
    
 
    
    
    

public int userID(String email) {
	 try {

Connection connection = Conexao.createConnectionToMySQL();
Statement statement = connection.createStatement();

String consultaSQL = "SELECT * FROM usuarios WHERE Email = '" + email +"'";
ResultSet resultado = statement.executeQuery(consultaSQL);

		 
		 
		 
if(resultado.next()) {
int numeroId = resultado.getInt("userID");
return  numeroId;




}
		        
} catch (Exception e) {
	
e.printStackTrace();
}
	return 0;
			 
			 
	
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}






