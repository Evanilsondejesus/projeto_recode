package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UsuarioSend {
Connection conn = null;
PreparedStatement pstm = null;


	public String criar(Usuario contato) {
		 String sql = "INSERT INTO usuarios(email,senha)" + " VALUES(?,?)";
		try {
			 conn	 = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, contato.getEmail());
			pstm.setInt(2, contato.getSenha());
			
			
			pstm.execute();
			return "criado";
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			// Fecha as conexões

			try {
				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		return sql;
	}
	
   
 public String login(Usuario contato) { 
		 
try {
conn = Conexao.createConnectionToMySQL();
Statement statement = conn.createStatement();
String consultaSQL = "SELECT * FROM usuarios WHERE Email = '" + contato.getEmail() +"'"+ "AND Senha ="+ "'"+contato.getSenha()+"'";
ResultSet resultado = statement.executeQuery(consultaSQL);


if(!(resultado.next()) ) {
return "email ou senha incorreta";
	}else {

return "logado";


}
} catch (Exception e) {
e.printStackTrace();
 return "erro";
		
	}
	 
	 
		
	}
 


 


 
public String Contato_oferta(String email) {
	 String sql = "INSERT INTO contato_oferta(email) VALUES(?)";
	try {
		 conn	 = Conexao.createConnectionToMySQL();
		pstm = conn.prepareStatement(sql);

		pstm.setString(1, email);
		 
		
		pstm.execute();
		return "criado";
	} catch (Exception e) {

		e.printStackTrace();
	} finally {

		 

		try {
			if (pstm != null) {

				pstm.close();
			}

			if (conn != null) {
				conn.close();
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	return sql;
}


 
	



















}


































