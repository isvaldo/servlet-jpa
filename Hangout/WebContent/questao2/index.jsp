<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>IMC</title>
</head>
<body>
<form action="/Hangout/server" method="POST">
Altura:<input type="number" step="any" name="altura" placeholder="ex, 1.8"/><br/>

Peso:<input type="number" step="any" name="peso" placeholder="ex, 50.5"/><br/>

<input type="submit" value="calcular"/>
<input type="hidden" name="acao" value="questao2"/>
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