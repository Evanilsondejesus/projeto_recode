<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
	



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda</title>


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
 

<jstl:if test="${not empty sessionScope.user}">
    <jstl:set var="email" value="${user[0]}" />
     <jstl:set var="userID" value="${user[1]}" />
    
</jstl:if>
 





 
 <header class="azul_fraco border  border-end-0 border-bottom-1 border-top-0 border-1 border-start-0">


        <nav style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="home">Home</a></li>
              <li class="breadcrumb-item active" aria-current="page">Promoção</li>
            </ol>
          </nav>
    
    
    
    
    <h1 class="text-center">Promoção</h1>
</header>
 

 


 
    
     
    
<div class="container-fluid ">
<div class="d-flex flex-wrap">

<span class="h2">Principais  destaque  <i class="bi bi-arrow-right"></i></span>
 <jstl:set var="count" value="0" />
 
 
<jstl:forEach items="${pacotes_promo}" var="promocao">
    <jstl:if test="${count < 5}">
      
   
   <div class="card" style="width: 18rem;">
        <img src="${pacotes_promo[count].img}" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">   <li>${pacotes_promo[count].destino}</li>
     </h5>
          
        </div>
        <ul class="list-group list-group-flush">
          <li class="list-group-item"><i class="bi bi-clock">:</i>17 dias restantes</li>
          <li class="list-group-item"><i class="bi bi-cash"></i>:</i>17 dias restantes</li>
          <li class="list-group-item"></i>30% mais barato</li>


 
           </ul>
        <div class="card-body">
           
       <jstl:if test="${empty sessionScope.user}">
  <a href="#" class="btn btn-primary" onclick="alert('precisar está longado!!')" >CONTRATAR</a>
  </jstl:if>
  <jstl:if test="${not empty sessionScope.user}">
     <a href="contrata?id=${pacotes_promo[count].id}&userID=${userID}&pagina=2" class="btn btn-primary" >CONTRATAR</a>
  </jstl:if>     
            
            
            
            
            
            
            
            
            
        </div>
      </div>
   
        <jstl:set var="count" value="${count + 1}"  />
         </jstl:if>
 </jstl:forEach>
    </div>
    </div>
   
   
   
   
   
   
   
   
   
   
   <div class="container-fluid ">
<div class="d-flex flex-wrap">

<span class="h2">Pacotes para passeios  <i class="bi bi-arrow-right"></i></span>
 <jstl:set var="count" value="5" />
 
 
<jstl:forEach items="${pacotes_promo}" var="promocao">
    <jstl:if test="${count < 8}">
      
   
   <div class="card" style="width: 18rem;">
        <img src="${pacotes_promo[count].img}" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">   <li>${pacotes_promo[count].destino}</li>
     </h5>
          
        </div>
        <ul class="list-group list-group-flush">
          <li class="list-group-item"><i class="bi bi-clock">:</i>17 dias restantes</li>
          <li class="list-group-item"><i class="bi bi-cash"></i>:</i>17 dias restantes</li>
          <li class="list-group-item"></i>30% mais barato</li>


 
           </ul>
        <div class="card-body">
            <a href="destino.html">VER</a><br>
   <jstl:if test="${empty sessionScope.user}">
  <a href="#" class="btn btn-primary" onclick="alert('precisar está longado!!')" >CONTRATAR</a>
  </jstl:if>
  <jstl:if test="${not empty sessionScope.user}">
     <a href="contrata?id=${pacotes_promo[count].id}&userID=${userID}&pagina=2" class="btn btn-primary" >CONTRATAR</a>
  </jstl:if>     
               
            
            
            
            
            
        </div>
      </div>
   
        <jstl:set var="count" value="${count + 1}"  />
         </jstl:if>
 </jstl:forEach>
    </div>
    </div>
   
    


<footer class="container-fluid azul_fraco text-light  text-center border border-1 ">

    <div class="w-50 m-auto">
      Free<span class="text-danger">Spirit</span><br>
      
      "Free to fly"<br>
    
    </div>
    @Site desenvolvido por Evanilson, todos direitos reservados
    </footer>
    
   
   
   
   
    






</body>
</html>