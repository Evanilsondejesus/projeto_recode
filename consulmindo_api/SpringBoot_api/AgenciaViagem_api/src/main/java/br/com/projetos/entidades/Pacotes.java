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
