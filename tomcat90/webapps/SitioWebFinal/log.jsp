<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOG</title>
</head>
<body>
<p></p>
<p>Introducir nombre de Base de Datos</p>
<form action="/SitioWebFinal/Logs">
<input type="text" name="DBname" />
<input type="submit" value="Enviar" />
</form>
<% String variable = request.getParameter("DBname"); %>

</body>
</html>