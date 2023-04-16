<%@page import="entidades.Pesquisa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmação</title>
</head>
<body>

	<%
		Pesquisa pesquisa = (Pesquisa) request.getAttribute("pesquisa");
	%>
	
	<h1> <%= pesquisa.getId() %></h1>
	<h1> <%= pesquisa.getNome() %></h1>

</body>
</html>