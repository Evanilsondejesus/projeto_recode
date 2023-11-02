package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PacotesUserSend {
	Connection conn = null;
	PreparedStatement pstm = null;

	

	
	
	public List<PacotesUser> getPacotesUser(int id) {
		
		

		String sql = "SELECT * FROM pacotesuser WHERE userID = "+id;
		
		
		

		List<PacotesUser> pacotesUser = new ArrayList<PacotesUser>();

		 
		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
 
            
			while (rset.next()) {
       PacotesUser pacote = new PacotesUser();
       pacote.setDestino(rset.getString("destino"));
	   pacote.setValorTotal(rset.getInt("valorTotal"));
	   pacote.setImg(rset.getString("img"));
	   pacote.setId(rset.getInt("id"));
			 	
				
	pacotesUser.add(pacote);
			
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

		return pacotesUser;
	}

	
	
	

	
	
	public void Comprar(int userId, int idpacote ) {

		 
		try {
			

Connection connection = Conexao.createConnectionToMySQL();
		//Connection connection = conexao.createConnectionToMysoL();
		String insercaoSQL = "INSERT INTO pacotesuser (userID, id_pacote) VALUES (?, ?)";
		PreparedStatement insercaoStatement = connection.prepareStatement(insercaoSQL);
		insercaoStatement.setInt(1, userId);
		insercaoStatement.setInt(2, idpacote);
		 
		insercaoStatement.executeUpdate();
			    
		//(userid, id);	
		 
		} catch (Exception e) {
		//System.out.print("deu error ao adicionar pacote, talvez vc já tem adicionado o mesmo anteriomente");
		 

				
		} }
	
	
	 
	
	


	public void removeById(int id) {

		String sql = "DELETE FROM pacotesuser WHERE id = ?";

		try {
			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

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
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
}
