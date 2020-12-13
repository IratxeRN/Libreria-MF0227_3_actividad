<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>

<form action="" method="post" class="needs-validation p-5" novalidate>
<h2>Nuevo Libro </h2>
  <div class="form-row">
  		<div class="form-group col-2">
	    <label for="id">Id</label>
	    <input type="number" class="form-control" id="id" name="id" readonly value="${libro.id}" >
	  </div>
	   <div class="form-group col-10">
	    <label for="nombre">Nombre</label>
	    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Titulo mayor de 3 caracteres, (max. 150)." required minlength="3" value="${libro.nombre}" autofocus >
	  <div class="invalid-feedback">Debe introducir un titulo de entre 3 y 150 caracteres</div>
	  </div>
	  <div class="form-group col-12">
	    <label for="autor">Autor</label>
	    <input type="text" class="form-control" id="autor" name="autor" placeholder="Por defecto Anónimo" value="${libro.autor}" >
	  </div>
  </div>
  
  <div class="form-row">
    <div class="form-group col-lg-6 col-md-6 col-sm-6" >
      <label for="precio">Precio</label>
      <div class="input-group mb-2">
        <input type="number" step=".01" class="form-control" id="precio" name="precio" placeholder="precio" min=0 value="${libro.precio}" required>
        <div class="input-group-prepend">
          <div class="input-group-text">€</div>
        </div>
        <div class="invalid-feedback">Debe introducir un valor</div>
      </div>
      
    </div>
 
    <div class="form-group col-lg-6 col-md-6 col-sm-6" >
      <label for="descuento">Descuento</label>
      <div class="input-group mb-2">
        <input type="number" class="form-control" id="descuento" name="descuento" placeholder="descuento" min=0 max= 100 required value="${libro.descuento}" required>
        <div class="input-group-prepend">
          <div class="input-group-text">%</div>
        </div>
        <div class="invalid-feedback">Debe introducir un valor entre 0 y 100</div>
      </div>
      
   </div>
 </div>  
  <div class="form-row">  
  <div class="form-group col-12">
		<label for="urlImagen">Portada del Libro</label>
		
			<div class="col">
			<input type="url" class="form-control" id="urlImagen" name="urlImagen"
				placeholder="URL de la imagen a mostrar del producto" value="${libro.urlImagen}">
			<div class="valid-feedback">Imagen correcta</div>
		</div>
		
	</div>
</div>
  
<div class="d-grid gap-2 d-md-flex justify-content-md-end">
  <button type="submit" class="btn btn-success center">Guardar Datos</button>
</div>
</form>



<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>