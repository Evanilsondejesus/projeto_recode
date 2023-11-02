
const alternar = document.getElementById("alternar");
const submitButton = document.querySelector('input[type="submit"]');
 

alternar.addEventListener("click", ()=>{
//alert(alternar.innerText !=="Fazer login")





  if(alternar.innerText =="Fazer login"){
    alternar.innerText ="Não tem conta deseja criar ?";
 submitButton.value ="Login"
  }else{
  alternar.innerText ="Fazer login"
  submitButton.value ="Cadastrar"




  }
 


})


