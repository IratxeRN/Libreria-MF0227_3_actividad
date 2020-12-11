<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>

<form action="admin/nuevo" method="post" class="needs-validation p-5" novalidate>
<h2>Nuevo Libro</h2>
  <div class="form-row">
	   <div class="form-group col-12">
	    <label for="nombre">Nombre</label>
	    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Titulo mayor de 3 caracteres, (max. 150)." pattern="[A-Z][a-z]*" autofocus >
	  </div>
	  <div class="form-group col-12">
	    <label for="autor">Autor</label>
	    <input type="text" class="form-control" id="autor" name="autor" placeholder="Por defecto Anónimo">
	  </div>
  </div>
  
  <div class="form-row">
    <div class="form-group col-lg-6 col-md-6 col-sm-6" >
      <label for="precio">Precio</label>
      <div class="input-group mb-2">
        <input type="number" class="form-control" id="inlineFormInputGroup" placeholder="precio" min=0 required>
        <div class="input-group-prepend">
          <div class="input-group-text">€</div>
        </div>
      </div>
    </div>
 
    <div class="form-group col-lg-6 col-md-6 col-sm-6" >
      <label for="descuento">Descuento</label>
      <div class="input-group mb-2">
        <input type="number" class="form-control" id="inlineFormInputGroup" placeholder="descuento" min=0 required>
        <div class="input-group-prepend">
          <div class="input-group-text">%</div>
        </div>
      </div>
   </div>
 </div>  
  <div class="form-row">  
  <div class="form-group col-12">
		<label for="imagen">Portada del Libro</label>
		
			<div class="custom-file">
				<input type="file" class="custom-file-input" id="urlImagen"
					name="urlImagen" lang="es"> <label class="custom-file-label"
					for="urlImagen" data-browse="Elegir">Seleccionar Archivo</label>
			</div>
			<div class="valid-feedback">Imagen correcta</div>
			<div class="invalid-feedback"></div>
		
	</div>
</div>
  
<div class="d-grid gap-2 d-md-flex justify-content-md-end">
  <button type="submit" class="btn btn-success center">Guardar Datos</button>
</div>
</form>



<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>