package conecao.db;

public class opcaopacote {
	int valorTotal;
	String destino;
	String nomePacote;
	int idPacote;
 
public opcaopacote(String nomePacote, String destino, int valorTotal,  int idPacote) {
	this.nomePacote = nomePacote;
	this.destino = destino;
	this.valorTotal = valorTotal;
	this.idPacote = idPacote;
}




public String getDestino() {
		return destino;
}


public String getNomePacote() {
		return nomePacote;
}



public int getIdPacote() {
		return idPacote;
}

 


public int getValorTotal() {
		return valorTotal;
}

	
	
	
	
	

}
