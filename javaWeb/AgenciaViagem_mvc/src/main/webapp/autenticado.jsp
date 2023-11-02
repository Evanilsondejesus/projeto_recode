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
    // O usuário está autenticado, então você pode personalizar o conteúdo da página.
%>
    <h1>Bem-vindo à página protegida, <%= user %>!</h1>
<%
} else {
    // O usuário não está autenticado, você pode tomar ações apropriadas, como redirecioná-lo para a página de login.
    response.sendRedirect("login.jsp");
}
%>












</body>
</html>