
const alternar = document.getElementById("alternar");
const submitButton = document.querySelector('input[type="submit"]');
const form = document.querySelectorAll("form")[0];

 
form.action ="login"

alternar.addEventListener("click", ()=>{
 

  if(alternar.innerText =="Fazer login"){
    alternar.innerText ="Não tem conta deseja criar ?";
 submitButton.value ="Login"
 form.action ="login"

 
  }else{
  alternar.innerText ="Fazer login"
  submitButton.value ="Cadastrar"
 form.action ="cadastrar"



  }
 


})


