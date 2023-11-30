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
public class Usuario {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    public Long getId() {
        return userId;
    }

    public void setId(Long userId) {
        this.userId = userId;
    }
 
    
    @Column(nullable = false, length = 255, unique = true)
    private String email;
    
    @Column(nullable = false, length = 8)
    private String senha;

    
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
     
    
        
     
     
    
}


















