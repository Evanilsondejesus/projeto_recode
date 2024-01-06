package br.com.projetos.entidades;

 

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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
    
    
    @Column(nullable = false, length = 100)
    private String userId;
    
    
    @Column
    private String destino;
     
    
    @Column 
    private int idPacote;
     
    
    
    public String getDestino() {
        return destino;
    }
  
    
    public String getUserId() {
		return userId;
	}


    
	public String setUserId() {
		return userId;
		
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
