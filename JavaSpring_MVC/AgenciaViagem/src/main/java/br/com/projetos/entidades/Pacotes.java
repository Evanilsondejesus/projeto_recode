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
import javax.xml.crypto.Data;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Entity
public class Pacotes {
 
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPacote;

    public Long getId() {
        return idPacote;
    }

    public void setId(Long idPacote) {
        this.idPacote = idPacote;
    }
 
    @Column( length = 255)
    private String destino;
    

    @Column(nullable = false, length = 8)
    private int valor;
    
    @Column(nullable = false, length = 2)
    private int desconto;
     
    @Column(nullable = false, length = 8)
    private int valorTotal;
    @Column(nullable = false, length = 255)
    private String img;
     
    @Column(nullable = false)
    private LocalDate dataViagem;
    
      
    public LocalDate getDataViagem() {
        return dataViagem;
    }
    
     public int getValor() {
        return valor;
    }
    
     
    public String getDestino() {
        return destino;
    }
 
    
    
    
    public int getDesconto() {
        return desconto;
    }
     
    public int getValorTotal() {
        return valorTotal;
    }
    
    public String getImg() {
        return img;
    }
     
     
     
    
}
