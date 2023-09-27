package pacote.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import conecao.db.*;
import home.user.*;


public class pacotesUsuario {
	 Scanner scanner = new Scanner(System.in);

	 
	/* home > pacoteUsuario
	pacotesUsuario tem uma banco de dados 'pacotesusuarios'
	onde o  usuarios vai alteração ADICIONAR, EXCLUIR, CONSULTAR pacotes contratado
	 
	  
	 
	 
	 
	 */
	 
	 
	 
	 
	 
public void contratar(int userId, int idpacote, String nomePacote, String destino, int valorTotal) {

 
try {
Connection connection = conexao.createConnectionToMysoL();
String insercaoSQL = "INSERT INTO pacotesusuarios (userid, id_pacote, nome_pacote, valor_total) VALUES (?, ?, ?, ?)";
PreparedStatement insercaoStatement = connection.prepareStatement(insercaoSQL);
insercaoStatement.setInt(1, userId);
insercaoStatement.setInt(2, idpacote);
insercaoStatement.setString(3, nomePacote);
insercaoStatement.setInt(4, valorTotal);
insercaoStatement.executeUpdate();
	    
	         
System.out.print("PACOTE CONTRATADO!!");
Voltar(userId);
} catch (Exception e) {
System.out.print("deu error ao adicionar pacote, talvez vc já tem adicionado o mesmo anteriomente");
Voltar(userId);


		
} }

	
public void Pacotescontrados(int userid) {

 try {
 Connection connection = conexao.createConnectionToMysoL();
 Statement statement = connection.createStatement();
        
       
 String consultaSQL = "SELECT * FROM pacotesusuarios WHERE userid = "+ userid;
 ResultSet resultado = statement.executeQuery(consultaSQL);
 System.out.print("--->PACOTES CONTRATADOS<---\n");

 
 
 
 
if (!resultado.next()) {
	System.out.println("\n \n VOCÊ AINDA NÃO CONTRATOU NENHUM PACOTE");
	Voltar(userid);
	

}else {

	 

	
do {
   
	String nomePacote = resultado.getString("nome_pacote");
	String idpacote = resultado.getString("id_pacote");
	System.out.print("\nPACOTE: "+nomePacote + "\nID DO PACOTE: "+ idpacote + "\n");
	System.out.println(nomePacote == "" ? "\n \n VOCÊ AINDA NÃO CONTRATOU NENHUM PACOTE": "");
		
	
	
	
	
	
} while (resultado.next());


//2System.out.print("\nnome do pacote: "+nomePacote + "\nid do pacote: "+idpacote + "\n");
Voltar(userid);

   }

	
	
	

 
 
 
 
 
 
 






 resultado.close();
 statement.close();
 connection.close();
 } catch (Exception e) {
  e.printStackTrace();
        
        
}
  
	

}




public void removerlista(int idpacote , int userid) {

try {
Connection connection = conexao.createConnectionToMysoL();
Statement statement = connection.createStatement();
String consultaSQL = "DELETE  FROM pacotesusuarios WHERE id_pacote ="+ idpacote + " AND userid= "+ userid;
statement.executeUpdate(consultaSQL);


System.out.print("--->PACOTE EXCLUIDO!!<---\n");
Voltar(userid);
 
statement.close();
connection.close();
} catch (Exception e) {
 e.printStackTrace();
 
 System.out.print("...>"+e);
       
       
}
 
	
}
















//navegação usuario
public void Voltar(int userid) {
System.out.print("\n ..................................... \n");

System.out.print("\n <--click 0 para voltar-->\n");



int nu =  scanner.nextInt();
 

	
	if(nu == 0) {
		

new home(userid);
	 

	}else if(nu > 0 ) {

System.out.print("DIGITE NUMERP VÁLIDO");

		Voltar(userid);
	}

	
	
}













	
	
	
	
	
	
	
	
	
	
	
}
