<%@page import="java.util.Objects"%>
<%@page import="entidades.Pesquisa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados de Pesquisa</title>
</head>
<body>

	<h1>Dados para Pesquisas</h1>
	<form action="/projeto_pesquisa/PesquisaAtualizarServlet" method="post">
		
		<% Pesquisa pesquisa = (Pesquisa) request.getAttribute("pesquisa"); %>
		
		<input type="hidden" name="p_id" value="<%= pesquisa.getId() %>"/>
		<p>Id: <input type="text" name="p_id" size="30" disabled value="<%= pesquisa.getId() %>" /></p>
		<p>Nome: <input type="text" name="p_nome" size="30" value="<%= pesquisa.getNome() %>"/></p>
		<p>Email:  <input type="email" name="p_email" size="30" value="<%= pesquisa.getEmail() %>" /></p>
		
		<p>Sexo:</p>
		<p>Masculino  <input type="radio" name="p_sexo" value="masculino" checked="<%= pesquisa.getSexo().equals("masculino") %>" /></p>
		<p>Feminino  <input type="radio" name="p_sexo" value="feminino" checked="<%= pesquisa.getSexo().equals("feminino") %>" /></p>
		
		<p>Tipos preferidos de filmes:</p>
		<p><input type="checkbox" name="p_ck1" value="romance" <%= pesquisa.getCheck1() != null ? "checked" : "" %>  />Romance</p>
		<p><input type="checkbox" name="p_ck2" value="aventura" <%= pesquisa.getCheck2() != null ? "checked" : "" %> />Aventura</p>
		<p><input type="checkbox" name="p_ck3" value="Ficção" <%= pesquisa.getCheck3() != null ? "checked" : "" %> />Ficção</p>
		
		<p>Tipos preferidos de filmes:</p>
		<select name="p_estadoCivil">
			<option value="solteiro(a)" <%= pesquisa.getEstadoCivil().equals("solteiro(a)") ? "selected" : "" %> >Solteiro(a)</option>
			<option value="casado(a)" <%= pesquisa.getEstadoCivil().equals("casado(a)") ? "selected" : "" %> >Casado(a)</option>
			<option value="Viuvo(a)" <%= pesquisa.getEstadoCivil().equals("Viuvo(a)") ? "selected" : "" %> >Viuvo(a)</option>
		</select>
		
		<p>
			<a href="/projeto_pesquisa/ExcluirPesquisaServlet?p_id=<%= pesquisa.getId() %>">Excluir registro</a>
		</p>
		
		<p>
			<input type="submit" value="Enviar" />
			<input type="reset" value="Limpar" />
		</p>
		
	</form>

</body>
</html>