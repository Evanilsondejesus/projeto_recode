package conecao.db;
 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conexao {
	
	
	
	
private static final String USERNAME = "root";


private static final String PASSWORD = ""; 
	

private static final String DATABASE_URI ="jdbc:mysql://localhost:3306/agenciaviagem";


public static Connection createConnectionToMysoL () throws Exception{

Connection connection = DriverManager.getConnection(DATABASE_URI,
USERNAME, PASSWORD) ;



return connection;








}
 
}