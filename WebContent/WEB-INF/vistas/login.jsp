<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>


<div class="row mx-auto py-5">

<div class="col-lg-4 offset-lg-4 col-md-6 offset-md-3">
<form action="login" method="post" class="needs-validation" novalidate>
  <h2>Registro</h2>
  <div class="form-group">
    <label for="usuario">Administrador</label>
    <input type="text" class="form-control" id="usuario" name="usuario" aria-describedby="emailHelp" autofocus required>
    <div class="invalid-feedback">Debe introducir el nombre de administrador</div>
  </div>
  <div class="form-group">
    <label for="password">Password</label>
    <input type="password" class="form-control" id="password" name="password" required>
    <div class="invalid-feedback">Debe introducir una contraseña</div>
  </div>
  <button type="submit" class="btn btn-success btn-block">Entrar</button>
</form>

</div>
</div>



<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>