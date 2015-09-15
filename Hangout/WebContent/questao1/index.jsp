<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Hangout/server" method="POST">
Numero:<input type="number" name="numero"/><br/>
<input type="submit" value="verificar"/>
<input type="hidden" name="acao" value="questao1"/>
<button onclick="window.history.go(-1)">Voltar</button>
</form>

<br/>
<b>
<% if (request.getAttribute("resposta") != null) { %>


Resposta:<%=request.getAttribute("resposta") %>



<% } %>
</b>
</body>
</html>