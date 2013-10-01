<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
<title><tiles:getAsString name="titulo"/></title>
<meta name="description" content="Instituto Nacional de San Julián, Código: 10698" />
<link href="css/ce.css" rel="stylesheet" type="text/css" media="screen" title="default" />
<link rel="stylesheet" type="text/css" href="css/superfish.css" media="screen">
<link rel="stylesheet" media="screen" href="css/superfish-vertical.css" /> 
<link rel="stylesheet" type="text/css" href="css/matricula.css" media="screen">
</head>
<body>

<!-- Inicia Sitio -->
<div id="wrapper">

<!-- Inicia Menu desplegable-->

<div id="menu_top">

   <tiles:insert attribute="menucabezera"/>
    
    <div class="clear"></div>
</div>


<!-- Termina menus despegable-->


  <!-- Inicia Cabecera BAnner -->
  
	<tiles:insert attribute="banner"/>

  <!-- Termina Cabecera Banner -->
  
  
  <!-- Inicio Contenido -->
 
  <div id="container">
 <tiles:insert attribute="cuerpo"/>
 </div>
  <!-- TERMINA CONTENIDO -->
</div>
  <!-- Inicia Barra Lateral -->
  
  
  <tiles:insert attribute="menulateral"/>
  
  <!-- Termina Barra Lateral -->
  <div class="clear"></div>
  <!-- Inicia Pie -->
    
  <div id="footer">
  
  <tiles:insert attribute="pie"/>
  
  </div>
  
  <!-- Termina Pie -->
</div>
<!--Finaliza Sitio -->
</body>
</html>