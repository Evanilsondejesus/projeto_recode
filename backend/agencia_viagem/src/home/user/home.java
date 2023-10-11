package home.user;



import java.util.List;
import java.util.Scanner;
import pacote.user.*;
import conecao.db.*;





/*Main > home > 
 * home interface para usuario intergir com sistema: onde apenas interface "front-end"
 nessa interface outra classe si relacionar
 
* listaDB: receber dados do banco de dados em uma lista de objeto local
 
 */

 
public class home {
Scanner scanner = new Scanner(System.in);
int userId;
pacotesUsuario pacotesUsuario = new pacotesUsuario();



int num;
int idPacote;
String nomePacote;
String destino;
int  valorTotal;
listaObjeto[] listaObjeto = new listaObjeto[100];
int quantidades = 0;










	
public home(int valor) {

this.userId = valor;
 Logado();
}






///para menu para usuario logado
	
public void Logado() { 
	 
quantidades = 0;
 
List<opcaopacote> listaDB =   pacotes.listadepacotes(); 

  
 
 System.out.println(".........>Lista de pacotes<...........");
for (opcaopacote lista : listaDB) {
quantidades++; 
	   
String nomePacote = lista.getNomePacote();
String destino = lista.getDestino();
int valorTotal = lista.getValorTotal();
int idPacote = lista.getIdPacote();



listaObjeto[quantidades] = new listaObjeto(nomePacote,destino,valorTotal, idPacote );




 
  System.out.println("\n NUMERO: "+ quantidades);
  System.out.println("Nome do Pacote: "+ nomePacote);
  System.out.println("Destino: "+ destino);
  System.out.println("idPacote: "+ idPacote);
  
  System.out.print("-------------------->||<--------------------");
           
            
             
   }
    	
    	
 System.out.println("\n >Escolhar sua opcao<...........");
 System.out.println("1-->CONTRATAR PACOTES");
 System.out.println("2-->PACOTES CONTRATADOS");
 System.out.println("3-->REMOVER PACOTES");      
  
 System.out.print("Digite opcao.... ");
 int numero = scanner.nextInt(); 
  
 
 
 
if(numero == 1 ) {
promptUser("contratar"); 
pacotesUsuario.contratar(userId, idPacote, nomePacote, destino, valorTotal);

}else if(numero == 2){
pacotesUsuario.Pacotescontrados(userId);
	  
	 
}else if(numero == 3){
promptUser("deleta");
pacotesUsuario.removerlista(idPacote, userId);
	 
}  



}
 	 
	
public void promptUser(String estado ) { 
System.out.print("Digite o numero do pacote para "+ estado);

num= scanner.nextInt();

while(num > quantidades || num == 0) {

System.out.print("digite um numero valido!! \n") ;
promptUser(estado);
}


idPacote = listaObjeto[num].getIdPacote();
nomePacote = listaObjeto[num].getNomePacote();
destino = listaObjeto[num].getDestino();
valorTotal = listaObjeto[num].getValorTotal();




}













 


	

    
	
	
	
	
	

}






