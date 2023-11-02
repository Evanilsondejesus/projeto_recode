<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
	
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>freeSpirit</title>


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/estilos.css">

	
	


 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">


 
</head>
<body class="bg-dark-subtle">
 
 
 

	
 



<header class=" text-center border-0  azul_fraco " >
  <img src="FreeSpirit.svg" alt=""   style="width: 20%;">
 
 
 
 <!--caso usuario esteja logado btao "logar ou cadastra vai desaparecer"  -->
<jstl:if test="${empty sessionScope.user}">
<a href="autenticacao.html" class="float-end  border border-white text-white border-light   h4 d-inline btn btn-outline-primary">entra ou cadastra</a>
</jstl:if>
 
 
 
<p>
<ul class="nav justify-content-center bg-transparent text-center" style="top: 70%;">
<li class="nav-item btn-outline-primary">
<a class="nav-link text-white" href="#">HOME</a>
</li>
<li class="nav-item text-white">
      <a class="nav-link text-white" href="destino.html">DESTINO</a>
</li>
 <li class="nav-item">
<a class="nav-link  text-white" aria-current="page" href="promo">PROMOCÃO</a>
</li>
  
  <li class="nav-item">
<a class="nav-link  text-white" aria-current="page" href="Contratado">CONTRATOS</a>
</li>
  
  
</ul>

<!--usuarios cadastra ou logado terá informação importante -->

<jstl:if test="${not empty sessionScope.user}">
 <jstl:set var="email" value="${user[0]}" />
 <jstl:set var="userID" value="${user[1]}" />
    
</jstl:if>
 
 
 
<br>
<!--usuario saber qual de sua conta que logando  -->
<span>${email}</span>
 </header>
     




<div class="container-fluid position-relative p-0">
  <img src="img/disney.jpeg" class="img-fluid " alt="...">

<img src="img/promocao.png" class="img-thumbnail translate-middle-x bottom w-25 bg-white" alt="..." style="left: 15%;">
 <img src="img/destino.jpg" class="img-thumbnail translate-middle-x bottom w-25 bg-white" alt="..." style="left: 50%;">
 <img src="img/pacote.jpg" class="img-thumbnail translate-middle-x bottom w-25 bg-white" alt="..." style="left: 85%;">
</div>


 

 
 

<!-- Usuario logado tem acesso a uma lista de pacote contrato na pagina home -->
<jstl:if test="${not empty sessionScope.user}">
 <div class="container-fluid  bg-dark-subtle" items="${pacotesuser}" >
 <h2 test="${not empty sessionScope.user}">Veja  seus pacote aqui contratado</h2> 
 <div class=" d-flex">
  <jstl:forEach var="packageUsers" items="${pacotesuser}"   end="1">
     
                
<div class="card me-1" style="width: 18rem;" test="${not empty sessionScope.user}">


  <img src="${packageUsers.img}" class="card-img-top" alt="...">
  
  <div class="card-body">
  <h5 class="card-title">${packageUsers.destino}</h5>
  </div>
  
    <ul class="list-group list-group-flush">
    <li class="list-group-item"><i class="bi bi-airplane"> 3 novembro</i></li>
  <li class="list-group-item"><i class="bi bi-people-fill"></i> acompanhante</li>
  <li class="list-group-item"><i class="bi bi-eye-fill"></i>: <a href=""> ver</a> </i></li>
  </ul>
  
  
   <div class="card-body">
  <a href="excluir?id=${packageUsers.id}&pagina=1" class="btn  btn-danger">REMOVER</a>
   </div>
  </div>
  
  </jstl:forEach> 
     
     
     
     
     
    
  </div>
</div>
	  
     
     
     
     
     
     
  </jstl:if>
          

	  



	
	
	
	
	
	
	
	
	
	
	
	
			
			
			
			
			
	 
 
 <div class="container-fluid bg-dark-subtle" items="${pacotes}">

  <h2>Principais pacotes</h2>
  
  <div class=" d-flex" items="${pacotesuser}">
   
    
        
<div class="card me-1" style="width: 18rem;">
  <img src="${pacotes[0].img}" class="card-img-top" alt="...">
  
  <div class="card-body">
  <h5 class="card-title">${pacotes[0].destino}</h5>
  </div>
    <ul class="list-group list-group-flush">
    <li class="list-group-item"><i class="bi bi-airplane"> 3 novembro</i></li>
  <li class="list-group-item"><i class="bi bi-people-fill"></i> acompanhante</li>
  <li class="list-group-item"><i class="bi bi-eye-fill"></i>: <a href=""> ver</a> </i></li>
  
  
  </ul>
   <div class="card-body">
   
   
   <!--só os usuarios logado pode contratar pacotes  -->
  <jstl:if test="${empty sessionScope.user}">
  <a href="#" class="btn btn-primary" onclick="alert('precisar está longado!!')" >CONTRATAR        </a>
  </jstl:if>
     <jstl:if test="${not empty sessionScope.user}">
 <a href="contrata?id=${pacotes[0].id}&userID=${userID}&pagina=1" class="btn btn-primary" >CONTRATAR</a>
  </jstl:if>
    
 
  
  
  
   </div>
  </div>
  
  
  
  
  
  <div class="card me-1 d-none d-sm-block" style="width: 18rem;">
   <img src="${pacotes[1].img}" class="card-img-top" alt="...">
   <div class="card-body">
    <h5 class="card-title">${pacotes[1].destino}</h5>
    </div>
      <ul class="list-group list-group-flush">
      <li class="list-group-item"><i class="bi bi-airplane"> 30 novembro </i></li>
    <li class="list-group-item"><i class="bi bi-people-fill"></i> acompanhante</li>
    <li class="list-group-item"><i class="bi bi-eye-fill"></i>: <a href=""> ver</a> </i></li>
    
    
    </ul>
     <div class="card-body">
   <jstl:if test="${empty sessionScope.user}">
  <a href="#" class="btn btn-primary" onclick="alert('precisar está longado!!')" >CONTRATAR</a>
  </jstl:if>
  <jstl:if test="${not empty sessionScope.user}">
     <a href="contrata?id=${pacotes[1].id}&userID=${userID}&pagina=1" class="btn btn-primary" >CONTRATAR</a>
  </jstl:if>
          
        
     </div>
    </div>
  
  
  
  
  
 
      <div class="card me-1 d-none d-md-block" style="width: 18rem;">
      <img src="${pacotes[2].img}" class="card-img-top" alt="...">
      <div class="card-body">
      <h5 class="card-title">${pacotes[2].destino}</h5>
      </div>
        <ul class="list-group list-group-flush">
        <li class="list-group-item"><i class="bi bi-airplane"> 30 novembro</i></li>
      <li class="list-group-item"><i class="bi bi-people-fill"></i> acompanhante</li>
      <li class="list-group-item"><i class="bi bi-eye-fill"></i>: <a href=""> ver</a> </i></li>
      
      
      </ul>
       <div class="card-body">
     <jstl:if test="${empty sessionScope.user}">
  <a href="#" class="btn btn-primary" onclick="alert('precisar está longado!!')" >CONTRATAR</a>
  </jstl:if>
  <jstl:if test="${not empty sessionScope.user}">
     <a href="contrata?id=${pacotes[2].id}&userID=${userID}&pagina=1" class="btn btn-primary" >CONTRATAR</a>
  </jstl:if>
      
      
       </div>
      </div>
     
     
     
     <!-- carde 4 -->
   <div class="card me-1 d-none d-lg-block" style="width: 18rem;">
        <img src="${pacotes[3].img }" class="card-img-top" alt="...">
        <div class="card-body">
        
         <h5 class="card-title">${pacotes[3].destino}</h5>
         </div>
          <ul class="list-group list-group-flush">
          <li class="list-group-item"><i class="bi bi-airplane"> 30 novembro</i></li>
        <li class="list-group-item"><i class="bi bi-people-fill"></i> acompanhante</li>
        <li class="list-group-item"><i class="bi bi-eye-fill"></i>: <a href=""> ver</a> </i></li>
        
        
        </ul>
         <div class="card-body">
         
   <jstl:if test="${empty sessionScope.user}">
  <a href="#" class="btn btn-primary" onclick="alert('precisar está longado!!')" >CONTRATAR</a>
  </jstl:if>
  <jstl:if test="${not empty sessionScope.user}">
     <a href="contrata?id=${pacotes[3].id}&userID=${userID}&pagina=1" class="btn btn-primary" >CONTRATAR</a>
  </jstl:if>
   
         </div>
        </div>
      
        
 <div class="card me-1 d-none d-xl-block" style="width: 18rem;">
          <img src="${pacotes[4].img}"     class="card-img-top"      >    
          <div class="card-body">
          <h5 class="card-title">${pacotes[4].destino}</h5>
          </div>
            <ul class="list-group list-group-flush">
            <li class="list-group-item"><i class="bi bi-airplane"> 30 novembro</i></li>
          <li class="list-group-item"><i class="bi bi-people-fill"></i> acompanhante</li>
          <li class="list-group-item"><i class="bi bi-eye-fill"></i>: <a href=""> ver</a> </i></li>
          
          
          </ul>
           <div class="card-body">
  <jstl:if test="${empty sessionScope.user}">
  <a href="#" class="btn btn-primary" onclick="alert('precisar está longado!!')" >CONTRATAR</a>
  </jstl:if>
  <jstl:if test="${not empty sessionScope.user}">
     <a href="contrata?id=${pacotes[4].id}&userID=${userID}&pagina=1" class="btn btn-primary" >CONTRATAR</a>
  </jstl:if>
          
         
          
          
           </div>
          </div>
        
 

</div> 
<div class="  m-auto text-center p-0" >
  <a href="">mais pacotes</a>
 </div>

</div>
 
 
	
 

<div id="promocao" class="bg-dark-subtle">
  

<div class="row mx-auto">
  <h2>PROMOCÃO</h2>
  <div class="col-sm-6 mb-3 mb-sm-0">

    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Viagen especial Disney <s>4000</s> por 2600  </h5>


        <p class="card-text">Com direito a um acompanhante</p>
        <a href="#" class="text-center" >ver</a><br>

        <a href="#" class="btn btn-primary">CONTRATAR</a>


       </div>
    </div>
  </div>


  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Viagem em promoção Hawai <s>7000</s> por 3500</h5>
        <p class="card-text">Por pessoas</p>
        <a href="#" class="text-center" >ver</a><br>
        <a href="#" class="btn btn-primary">CONTRATAR</a>
      </div>
    </div>
  </div>

</div>

	

 <div class="  m-auto text-center p-0" >
   <a href="promo">mais promoções</a>
  </div>
 
</div>		
			
	
	
<div class="accordion accordion-flush container-fluid  mb-3" id="accordionFlushExample">

  <h2>Termos condicões</h2>

  <div class="accordion-item">
    <h2 class="accordion-header">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
        Viagem internacionais
      </button>
    </h2>
    <div id="flush-collapseOne" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
      <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the first item's accordion body.</div>
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
        Viagem nacional
      </button>
    </h2>
    <div id="flush-collapseTwo" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
      <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the second item's accordion body. Let's imagine this being filled with some actual content.</div>
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseThree" aria-expanded="false" aria-controls="flush-collapseThree">
        Accordion Item #3
      </button>
    </h2>
    <div id="flush-collapseThree" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
      <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the third item's accordion body. Nothing more exciting happening here in terms of content, but just filling up the space to make it look, at least at first glance, a bit more representative of how this would look in a real-world application.</div>
    </div>
  </div>
</div>


	
	
	

  <form action="Receber_oferta" method="post">
 
<div class="d-flex  flex-wrap container-fluid    bg-dark-subtle   "   >

  <div class="d-flex  flex-wrap container-fluid " >


 <div>

  <svg xmlns="http://www.w3.org/2000/svg"  width="46" height="46" fill="currentColor" class="bi bi-envelope-plus-fill me-2 flex-grow-1" viewBox="0 0 16 16">
    <path d="M.05 3.555A2 2 0 0 1 2 2h12a2 2 0 0 1 1.95 1.555L8 8.414.05 3.555ZM0 4.697v7.104l5.803-3.558L0 4.697ZM6.761 8.83l-6.57 4.026A2 2 0 0 0 2 14h6.256A4.493 4.493 0 0 1 8 12.5a4.49 4.49 0 0 1 1.606-3.446l-.367-.225L8 9.586l-1.239-.757ZM16 4.697v4.974A4.491 4.491 0 0 0 12.5 8a4.49 4.49 0 0 0-1.965.45l-.338-.207L16 4.697Z"/>
    <path d="M16 12.5a3.5 3.5 0 1 1-7 0 3.5 3.5 0 0 1 7 0Zm-3.5-2a.5.5 0 0 0-.5.5v1h-1a.5.5 0 0 0 0 1h1v1a.5.5 0 0 0 1 0v-1h1a.5.5 0 0 0 0-1h-1v-1a.5.5 0 0 0-.5-.5Z"/>
  </svg>

  <span class="text-center h2">Inscreva-se para receber ofertas exclusivas</span>


 </div>




  
  <input type="email" name="email" class="form-control w-75 me-2 flex-grow-1" id="exampleFormControlInput1" placeholder="seu email" >
  <input type="submit"   value="Quero receber-las!"  class="btn btn-primary">
   
  
   
   
  </div>

  
  </div>
  
  
  </form>
  <br>
  <br>

<footer class="container-fluid  azul_fraco text-light  text-center ">

<div class="w-50 m-auto">
  Free<span class="text-danger">Spirit</span><br>
  
  "Free to fly"<br>

</div>
<a href="logout"  class" btn bg-black">sair</a>
</footer>



 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	 
</body>
</html>