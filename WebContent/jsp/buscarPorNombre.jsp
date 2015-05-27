<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Buscar por nombre</title>
<style>
 body {
 background: #CEF6F5;
 }
 form {
  
  margin: 0 auto;
  margin-top: 3em;
  width: 50%;
 }
 .texto {
   margin: .5em;   
   margin-left: 1em;
 }
 .cuadro {
   margin-left: 2em;
   margin-bottom: 1.3em;
 }
</style>
</head>
<body>

   <form action="${pageContext.request.contextPath}/Tienda/buscarPorNombre" method="get" name="buscarPorNombre" enctype="text/html">
   <!-- esta instruccion java busca el nombre del proyecto --> 
   <fieldset>
    <legend style="font-size: 1.3em">BUSCAR POR NOMBRE</legend>
   
      <div class="texto">
      <label for="nombre">NOMBRE</label>
    </div>
    <div class="cuadro">
      <input type="text" name="nombre" id="nombre"  />
    </div>
    
    <div class="texto">
     <input type="submit" name="enviar" id="enviar" value="Enviar" /> 
     <input type="reset" name="reiniciar" id="reiniciar" value="Reiniciar" />
    </div>
   
   </fieldset>
   </form>

</body>
</html>