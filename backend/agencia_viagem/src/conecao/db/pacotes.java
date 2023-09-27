package conecao.db;
 import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import conecao.db.*;
 

/*'pacotes' é uma lista de viagem é redederizado para usuarios
 * opcaopacote são dos os dados que pacotes contém
 * 
 * 
 */




public class pacotes {
    public static List<opcaopacote> listadepacotes() {
        List<opcaopacote> lista = new ArrayList<>();

        try {
            Connection connection = conexao.createConnectionToMysoL();
            Statement statement = connection.createStatement();
            String consultaSQL = "SELECT nome_pacote, destino, id, valor, valor_total FROM pacotes";
            
            
            
            ResultSet resultado = statement.executeQuery(consultaSQL);

            while (resultado.next()) {
     
              String nomePacote = resultado.getString("nome_pacote");
              String destino = resultado.getString("destino");
              int idpacote = resultado.getInt("id");
              int valorTotal = resultado.getInt("valor_total");
              
             opcaopacote usuario = new opcaopacote(nomePacote, destino, valorTotal, idpacote);
              lista.add(usuario);

              
           
              
              
            }

            resultado.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
