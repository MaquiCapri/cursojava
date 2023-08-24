<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Curso java</title>

 <script type="text/javascript" src="../../js/bootstrap.js"></script>
	<link href="../../css/bootstrap.css" rel="stylesheet" />
</head>
<body>

<jsp:include page="../template_superior.jsp"></jsp:include>
<br>
	<h3><u>Ver reclamo</u></h3>

	<table>
		<tr>
			<td><b><u>Id: </u></b></td>
			<td>${reclamo.id}</td>
		</tr>
		<tr>
			<td><b><u>Titulo: </u></b></td>
			<td>${reclamo.titulo}</td>
		</tr>
		<tr>
			<td><b><u>Descripcion: </u></td>
			<td>${reclamo.descripcion}</td>
		</tr>		
	</table>
	
	<jsp:include page="../template_inferior.jsp"></jsp:include>
</body>
</html>