<!DOCTYPE HTML>
<%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	
<html>
<head>
<title>index</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<p>Introducir nombre de tabla</p>
<form action="/SitioWebFinal/Table">
<input type="text" name="TableName" />
<p>Introducir nombre columna</p>
<input type="text" name="nameColumn" />
<input type="submit" value="Enviar" />
</form>
<% String variable = request.getParameter("nameColumn"); %>
<% String variable2 = request.getParameter("TableName"); %>






</body>
</html>