package model;
import java.util.Date;

public class Pacotes {

	private int id, valorTotal;
	
	private String destino;
	private String nomePacote, img;
	
	private int idade;
	
	private Date dataCadastro;

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getNomePacote() {
		return nomePacote;
	}

	
	
	
	public void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
	}

	
	
	
	public void setValorTotal(int valor) {
		this.valorTotal = valor;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	
	

	public void setImg(String img) {
		this.img = img;
	}

	public String getImg() {
		return img;
	}

	 
	
	
	
	
	
	
	
	
	
	
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
