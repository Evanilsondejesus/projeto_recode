<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





<%
String user = (String) session.getAttribute("user");
if (user != null) {
    // O usu�rio est� autenticado, ent�o voc� pode personalizar o conte�do da p�gina.
%>
    <h1>Bem-vindo � p�gina protegida, <%= user %>!</h1>
<%
} else {
    // O usu�rio n�o est� autenticado, voc� pode tomar a��es apropriadas, como redirecion�-lo para a p�gina de login.
    response.sendRedirect("login.jsp");
}
%>












</body>
</html>