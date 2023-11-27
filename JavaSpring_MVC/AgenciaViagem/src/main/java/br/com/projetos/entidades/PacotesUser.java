package br.com.projetos.entidades;

 

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.crypto.Data;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Entity


public class PacotesUser {
	 


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

   
    public void setId(Long id) {
        this.id = id;
    }
    
    
    @Column(nullable = false, length = 11)
    private int idUser;
    
    @Column
    private String destino;
     
    
    @Column 
    private int idPacote;
     
    
    
    public String getDestino() {
        return destino;
    }
  
    
    public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public int getIdPacote() {
		return idPacote;
	}


	public void setIdPacote(int idPacote) {
		this.idPacote = idPacote;
	}


	public int getDesconto() {
		return desconto;
	}


	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public int getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public LocalDate getDataViagem() {
		return dataViagem;
	}


	public void setDataViagem(LocalDate dataViagem) {
		this.dataViagem = dataViagem;
	}





	@Column 
    private int desconto;
    
    
    @Column 
    private int valor;
     
    @Column 
    private int valorTotal;
     
    @Column 
    private String img;
     
     
      
     
    @Column
    private LocalDate dataViagem;

     
	    
	    
	    
	    
	    
	    
	    
     
    
}
