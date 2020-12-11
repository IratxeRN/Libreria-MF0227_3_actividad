
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setLocale value="es_ES" />
<!DOCTYPE html>
<html lang="es">
<head>
<base href="${pageContext.request.contextPath}/" />
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Datatables -->
<link rel="stylesheet" href="css/dataTables.bootstrap4.min.css" />
<!-- CSS propia -->
<link rel="stylesheet" href="css/micss.css">

<title>Libreria</title>
</head>
<body>
	<header class="border-bottom border-success">
		<div class="card bg-dark text-white">
			<img src="img/library3.jpg" alt="libreria" class="card-img img-fluid">
			<div class="card-img-overlay">
				<h1 class="card-title px-5 pt-3vh pb-1">
					<svg width="1em" height="1em" viewBox="0 0 16 16"
						class="bi bi-book-half" fill="currentColor"
						xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd"
							d="M8.5 2.687v9.746c.935-.53 2.12-.603 3.213-.493 1.18.12 2.37.461 3.287.811V2.828c-.885-.37-2.154-.769-3.388-.893-1.33-.134-2.458.063-3.112.752zM8 1.783C7.015.936 5.587.81 4.287.94c-1.514.153-3.042.672-3.994 1.105A.5.5 0 0 0 0 2.5v11a.5.5 0 0 0 .707.455c.882-.4 2.303-.881 3.68-1.02 1.409-.142 2.59.087 3.223.877a.5.5 0 0 0 .78 0c.633-.79 1.814-1.019 3.222-.877 1.378.139 2.8.62 3.681 1.02A.5.5 0 0 0 16 13.5v-11a.5.5 0 0 0-.293-.455c-.952-.433-2.48-.952-3.994-1.105C10.413.809 8.985.936 8 1.783z" />
</svg>
					Libreria&nbsp;

				</h1>
			</div>
		</div>
	</header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarTogglerDemo03"
			aria-controls="navbarTogglerDemo03" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<a class="navbar-brand" href="index">[ Libreria ]</a>

		<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active"><a class="nav-link" href="index">Presentación<span
						class="sr-only">(current)</span></a></li>
				<c:choose>
					<c:when test="${sessionScope.usuario != null}">
						<li class="nav-item"><a class="nav-link" href="admin/gestion">Gestion
								de Libros</a></li>
					</c:when>
				</c:choose>
			</ul>
		</div>
		<ul class="navbar-nav">
			<li class="nav-item"><c:choose>
					<c:when test="${sessionScope.usuario == null}">
						<a class="nav-link" href="login">Area de administracion</a>
					</c:when>
					<c:otherwise>
						<li class="navbar-text">@Administrador -</li>
						<li class="nav-item"><a class="nav-link" href="logout">Cerrar
								sesión</a></li>
					</c:otherwise>
				</c:choose></li>
		</ul>
	</nav>
	<c:if test="${alertaTexto != null}">
		<div class="alert alert-${alertaNivel} alert-dismissible fade show"
			role="alert">
			${alertaTexto}
			<button type="button" class="close" data-dismiss="alert"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
		</div>
	</c:if>
	<main class="container pt-3">