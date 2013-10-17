<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
    <display:table  name="veralumno"  >
		<display:column property="codigo" title="Codigo" />
		<display:column property="nombre" title="Nombres" />
		<display:column property="apellido" title="Apellidos"/>

		</display:table>
    
    
    <!-- ******************************************** --> 
      <div id="principal">



<div id="cuerpo">

<div id="cuerpopri">
<!--************PI*********************--><br />
<!--***************PII******************-->
<form action="#" name="matricula">
<c:forEach var="veralumno" items="${veralumno}">
<div class="texto" ><div id="p2">
  <p><strong>DATOS GENERALES</strong></p></div><br /><br />
<span>Codigo:<c:out value="${veralumno.codigo}"/>
</span><br /><br />
<div id="t1">
<div id="n0">Nombres:</div>
<div id="n1"><c:out value="${veralumno.apellido}"/></div>
<div id="n2"><c:out value="${veralumno.nombre}"/></div>
</div><br /><br />
<div id="dato1">
<div id="grado">Sexo:<c:out value="${veralumno.sexo}"/></div>
<div id="turno1">Grado:<c:out value="${veralumno.grado}"/>
</div>
<div id="turno2">Seccion:<c:out value="${veralumno.seccion}"/></div>
<div id="sexo">

<!-- ****************************************************************************************************** -->

</div>
</div><br /><br /><br />
<div id="dato2">
<div id="nac">
Fecha de Nacimiento:<c:out value="${veralumno.fechan}"/>
</div>
<div id="edad">
Edad:<c:out value="${veralumno.edad}"/>
</div>
</div><br /><br />
<!-- *** POr si se va a poner meses es aqui XD -->

Nombre de la Persona Responsable con quien vive el alumno/a:
<div id="in">
<c:out value="${veralumno.nomrespo}"/>
</div><br />
<div id="pare">

</div>
<div id="dir">
Direccion:<c:out value="${veralumno.direccion}"/>
Telefono:<c:out value="${veralumno.telefono}"/>
</div><br />
<div id="dato3">


<div id="repite"></div>
</div><br /><br />
<div id="dato4">
<div id="traba">Fecha de Matricula:<c:out value="${veralumno.año}"/><br />
</div>
</div><BR /> <br />
<div id="religion">  </div><br />

 </div><br />
</c:forEach>
<!--*********************************-->
<!--***********PIII****************-->




<!--*************PVI************-->

<!--*************PVII************-->

<!--*************************-->


</div>

</div>
</div>
    
    
</body>
</html>