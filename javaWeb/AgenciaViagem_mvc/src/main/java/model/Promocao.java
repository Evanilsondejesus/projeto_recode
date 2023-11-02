package model;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
 

public class Promocao {
Connection conn = null;
PreparedStatement pstm = null;
 


	
	public List<Pacotes> getPromocao() {

/* Pegar todas   os pacotes cujo descontos maior que 0
		
		
		*/
		String sql = "SELECT * FROM pacotes WHERE desconto > 0";

		List<Pacotes> pacotes = new ArrayList<Pacotes>();

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, faça
			while (rset.next()) {

				Pacotes pacote = new Pacotes();

				 
				
				pacote.setDestino(rset.getString("destino"));
			    pacote.setValorTotal(rset.getInt("valorTotal"));
				pacote.setImg(rset.getString("img"));
				pacote.setId(rset.getInt("id_pacote"));
					
				
			 
 
			pacotes.add(pacote);
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {

				if (rset != null) {

					rset.close();
				}

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

		return pacotes;
	}

	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
}
