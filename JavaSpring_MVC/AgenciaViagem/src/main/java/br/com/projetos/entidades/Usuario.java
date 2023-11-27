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


















