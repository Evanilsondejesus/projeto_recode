<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
	



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contratado</title>


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
 



 
 <header class="azul_fraco border  border-end-0 border-bottom-1 border-top-0 border-1 border-start-0">


        <nav style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="home">Home</a></li>
              <li class="breadcrumb-item active" aria-current="page">Pacotes contratados</li>
            </ol>
          </nav>
    
    
    
    
    <h1 class="text-center">Pacotes contratado</h1>
</header>
 

  
  
  
  
  <jstl:if test="${not empty sessionScope.user}">
    <jstl:set var="email" value="${user[0]}" />
     <jstl:set var="userID" value="${user[1]}" />
    
</jstl:if>
 
 
 
<br> 



 <jstl:if test="${empty sessionScope.user}">
  <h1>Esteja logado para ver seus pacotes</h1>
  </jstl:if>
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

<jstl:if test="${not empty sessionScope.user}">
   
   <div class="container-fluid  bg-dark-subtle" items="${pacotesuser}" >
     <h2 test="${not empty sessionScope.user}">Veja  seus pacote aqui contratado</h2> 
  <div class="d-flex flex-wrap">
     
    <jstl:forEach var="packageUsers" items="${pacotesuser}"   >
                
<div class="card me-1 " style="width: 18rem;" test="${not empty sessionScope.user}">


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
 <a href="excluir?id=${packageUsers.id}&pagina=2" class="btn  btn-danger">REMOVER</a>
   
   </div>
  </div>
  
  </jstl:forEach> 
 </div>
</div>
	  
     
     
     
     
     
     
  </jstl:if>
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 


 
    
     
   
   
   
   
   
   
   
    


<footer class="container-fluid azul_fraco text-light  text-center border border-1 ">

    <div class="w-50 m-auto">
      Free<span class="text-danger">Spirit</span><br>
      
      "Free to fly"<br>
    
    </div>
    @Site desenvolvido por Evanilson, todos direitos reservados
    </footer>
    
   
   
   
   
    






</body>
</html>