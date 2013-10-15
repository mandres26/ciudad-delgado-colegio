<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/jquery-ui-1.8.22.custom.css" rel="stylesheet" type="text/css">
        <link href="css/jquery.dataTables.css" rel="stylesheet" type="text/css">
        <link href="css/demo_table.css" rel="stylesheet" type="text/css">
        <link href="css/demo_table_jui.css" rel="stylesheet" type="text/css">
</head>
<body>
<%@ include file="../JSP/top-tags.jsp"%>
<div id="container">
      <div class="post">
      <center>
      <h2 class="aviso"><strong>BUSQUEDA DE ALUMNOS</strong></h2>
      </center>
      <blockquote>
        <p>CENTRO ESCOLAR CATOLICO MONSEÑOR ESTEBAN ALLIET.</p>
      </blockquote>
    </div>
   <html:form  action="/buscar"> 
   <html:hidden property="iniciar" value="inicar"/>
  
   <html:submit property="buscar">Iniciar Busqueda</html:submit>
    <html:hidden property="method" value="inicar"/>
   </html:form>
   
	<display:table  name="listaalumno" id="listaalumno" >
		<display:column property="codigo" title="Codigo" />
		<display:column property="nombre" title="Nombres" />
		<display:column property="apellido" title="Apellidos"/>
		<display:column title="Ver">
		<c:out value="${listaalumno.codigo}"/>
		</display:column>c
		</display:table>
		
		<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.22.custom.min.js"></script>
        <script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
        <script type="text/javascript" language="JavaScript">
        $(document).ready( function() {

            $("#listaalumno").dataTable();

        });
        </script>
		
		
</body>
</html>