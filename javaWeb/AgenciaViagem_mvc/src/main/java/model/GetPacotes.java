package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GetPacotes {
Connection conn = null;
PreparedStatement pstm = null;

	 
public List<Pacotes> getContatos() {

String sql = "SELECT * FROM pacotes";
ResultSet rset = null;

List<Pacotes> pacotes = new ArrayList<Pacotes>();

	 
	
try {
conn = Conexao.createConnectionToMySQL();
pstm = conn.prepareStatement(sql);
rset = pstm.executeQuery();

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
