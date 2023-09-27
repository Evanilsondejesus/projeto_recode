import java.sql.Connection;
import java.util.Scanner;


import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import autenticacao.user.*;


public class Main {
    
public static void main(String[] arg) {
	  Scanner scanner = new Scanner(System.in);
  


autenticacao user = new autenticacao();


String email;
int senha;


 
	
System.out.println("--->cadastra ou fazer login<---");	
System.out.println("1-->CADASTRA");	
System.out.println("2-->LOGIN");	
int numero = scanner.nextInt();




	if(numero == 1) {
System.out.println("digite seu email:");	
 email = scanner.next();
System.out.println("senha:");	
senha = scanner.nextInt();
		
user.criar(email, senha);

		
		
		
	}else {
System.out.println("--->fazendo login<---");	
		
		
		System.out.println("digite seu email:");	
		 email = scanner.next();
		System.out.println("senha:");	
		senha = scanner.nextInt();
				
	
	user.login(email, senha);
	
	}
	
	
	
	scanner.close();

	
	 
	
	
	 
	 
	 
	 
	 
	 
	  
 
 
 
        
        
        

    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}    	
    	 