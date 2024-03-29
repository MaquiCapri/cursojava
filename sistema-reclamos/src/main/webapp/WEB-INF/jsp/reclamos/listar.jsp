<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Curso java listado</title>
<script type="text/javascript" src="../js/bootstrap.js"></script>
	<link href="../css/bootstrap.css" rel="stylesheet" />

</head>
<body>

<jsp:include page="../template_superior.jsp"></jsp:include>
<br>
		<h4><b><u>Listado de reclamos....</u></b></h4>
	
		<table class="table table-bordered">
			<tr>
				<th>Id</th>
				<th>Titulo</th>
				<th>Fecha alta</th>
				<th>Estado</th>
				<th></th>
			</tr>
			<c:forEach items="${reclamos}" var="reclamo">
			<tr>
				<td>${reclamo.id}</td>
				<td>${reclamo.titulo}</td>
				<td>${reclamo.fechaDeAlta}</td>
				<td>${reclamo.estadoReclamo.nombre}</td>
				<td>
					<a class="btn btn-primary" href="/reclamos/ver/${reclamo.id}">Ver</a>
					&nbsp;
					<a class="btn btn-info" href="/reclamos/editar/${reclamo.id}">Editar</a>
					&nbsp;
					<a class="btn btn-danger" href="/reclamos/borrar/${reclamo.id}">Borrar</a>
				</td>
			</tr>
			</c:forEach>
		</table>

			<jsp:include page="../template_inferior.jsp"></jsp:include>
	
</body>
</html>