package home.user;

public class listaObjeto {
	
	
	String destino ;

	String nomePacote ;
	int valorTotal;
	int idPacote;
	
	
	public listaObjeto(String nomePacote, String destino, int valorTotal, int idPacote ) {
		
		this.nomePacote = nomePacote;
		this.destino = destino;
		this.valorTotal = valorTotal;
		this.idPacote = idPacote;
		
		
		
	}

	

	
	public String getNomePacote() {
		return nomePacote;
	}
 	 
	

	
	public String getDestino() {
		return destino;
	}
 	 
	
	
	
	public int getValorTotal() {
		return valorTotal;
	}
 	 
	

	public int getIdPacote() {
		return idPacote;
	}
 	 
	

	
	
	
	
	
	
	
	
	
	

}
