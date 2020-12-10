<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>

<div class="table-responsive mb-5">
<p class="text-right">
	<a class="btn btn-success" href="admin/nuevo"><svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-plus-circle-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zM8.5 4.5a.5.5 0 0 0-1 0v3h-3a.5.5 0 0 0 0 1h3v3a.5.5 0 0 0 1 0v-3h3a.5.5 0 0 0 0-1h-3v-3z"/>
</svg> Añadir Nuevo Libro</a>  
</p>
<table class="table table-striped table-bordered table-hover table-sm">
<caption>Inventario de Libros</caption>
<thead class="thead-dark">	
	<tr>
		<th scope="col">Id</th>
		<th scope="col">Imagen</th>
		<th scope="col">Título</th>
		<th scope="col">Autor</th>
		<th scope="col">Precio</th>
		<th scope="col">Descuento</th>
		<th scope="col">Gestion</th>
	</tr>
</thead>
<tbody>
	<c:forEach items="${libros}" var="libro">
		<tr>
			<th scope="row">${libro.id}</th>
			<td class="text-center"><img src="${libro.urlImagen}" alt="" style="height: 8em" /></td>
			<td>${libro.nombre}</td>
			<td>${libro.autor}</td>
			<td class="text-right"><fmt:formatNumber type="currency" value="${libro.precio}" /></td>
			<td class="text-right"><fmt:formatNumber type="percent" value="${libro.descuento / 100}" /></td>
			<td class="text-center">
						
							<a class="btn btn-success btn-sm " href="#"><svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-pencil-square" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456l-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
  <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
</svg> Editar</a>
							<a class="btn btn-success btn-sm" href="#"><svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-x-circle-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zM5.354 4.646a.5.5 0 1 0-.708.708L7.293 8l-2.647 2.646a.5.5 0 0 0 .708.708L8 8.707l2.646 2.647a.5.5 0 0 0 .708-.708L8.707 8l2.647-2.646a.5.5 0 0 0-.708-.708L8 7.293 5.354 4.646z"/>
</svg> Borrar </a>
						
			</td>
		</tr>
	</c:forEach>
</tbody>
</table>

</div>




<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>