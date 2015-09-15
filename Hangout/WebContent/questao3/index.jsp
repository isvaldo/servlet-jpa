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
Matricula:<input type="number" step="any" name="matricula" placeholder="ex, 165156165"/><br/>

Nome:<input type="name" step="any" name="nome" placeholder="ex, isvaldo fernandes"/><br/>

Endereco:<input type="text" step="any" name="endereco" placeholder="ex, rua radix"/><br/>

Telefone:<input type="number" step="any" name="telefone" placeholder="ex, 986545874"/><br/>

<input type="submit" value="registrar"/>
<input type="hidden" name="acao" value="questao3"/>
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