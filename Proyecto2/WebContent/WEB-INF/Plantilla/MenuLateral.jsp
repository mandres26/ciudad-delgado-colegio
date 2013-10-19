<%@ include file="../JSP/top-tags.jsp"%>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$(".login").focus(function() {
        if( this.value == this.defaultValue ) {
        this.value = "";
        }
        }).blur(function() {
        if( !this.value.length ) {
        this.value = this.defaultValue;
        }
    });
});
</script>

	
	
<div id="sidebar">
    <div id="wrapper_sidebar">
    <h2>menu principal</h2>
    <ul class="sf-menu sf-vertical sf-js-enabled sf-shadow">
      <li> <a href="noticias.html" rel="bookmark"> Noticias</a></li>
      <li> <a href="#" rel="bookmark">Admin</a>
      	<ul>
      	<li> <html:link action="/docentegenero?method=combo">Docente</html:link></li>
      	<li> <html:link action="/gradocombos?method=combo">Grado</html:link></li>
      	<li> <html:link action="/secciondisplay?method=cancelar">Seccion</html:link></li>
       </ul>
      </li>
      <li><a href="biblioteca.html" rel="bookmark">Biblioteca Virtual</a></li>
      <li><a href="aula_info.html" rel="bookmark">Aula Informática</a>
      	<ul>
      		<li><a href="comite.html" rel="bookmark">Comités de Apoyo Tecnológico</a></li>
			<li><a href="aula_info.html" rel="bookmark">Aula Informática</a></li>
			<li><a href="proyecto_v15.html" rel="bookmark">Proyecto V-15</a></li>
		</ul>
      </li>
      <li> <a href="enlaces" rel="bookmark">Enlaces de Interés</a>
      	<ul>
        <li><a href="http://www.mined.gob.sv/" rel="bookmark">www.mined.gob.sv</a></li>
		<li><a href="http://www.gradodigital.edu.sv/" rel="bookmark">www.gradodigital.edu.sv</a></li>
		<li><a href="http://www.miportal.edu.sv/" rel="bookmark">www.miportal.edu.sv</a></li>
		<li><a href="http://www.piensa.edu.sv/" rel="bookmark">www.piensa.edu.sv</a></li>
        </ul>
      </li>
      <li> <a href="guia.html" rel="bookmark">Guías de Estudio</a>
      	<ul>
        <li><a href="desastre.html" rel="bookmark">En caso de desastres</a></li>
        </ul>
      </li>
      <li> <a href="eventos.html" rel="bookmark">Eventos</a>
      	<ul>
        <li><a href="calendario.html" rel="bookmark">Calendario de Actividades</a></li>
        </ul>
      </li>
    </ul>
    </div>
    <div class="clear"></div>
    <logic:notPresent name="usuario">
  <div class="logo">
  	<bean:message key="label.logueo" />
    <html:form action="/login">
    <html:text property="usuario" styleClass="login" value="Usuario"/>
    <html:password property="pass" styleClass="login" value="Contraseña"/>
    <html:hidden property="method" value="login"/>
    <html:submit property="Entrar" value="Entrar" style="width:35%;" />
    </html:form>
    </div>
   </logic:notPresent>
 </div>
<!--     <div class="clear"></div> -->
    
    <div class="logo"><img src="images/plan.jpg" width="151" height="72" alt="Plan Social" /></div>
    <div class="logo"><a href="http://www.miportal.edu.sv/index.php/noticias/itemlist/category/42" target="_blank"><img src="http://www.miportal.edu.sv/images/mipais.gif" width="151"  alt="Plan Social" /></a></div>
    <div class="logo"><a href="http://www.mined.gob.sv" target="_blank"><img src="images/logo.png" width="151"  alt="Plan Social" /></a></div>    
  