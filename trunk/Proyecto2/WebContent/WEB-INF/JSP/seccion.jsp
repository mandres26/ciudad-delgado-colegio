<%@ include file="../JSP/top-tags.jsp"%>
<script type="text/javascript" language="JavaScript">
function nuevo(){
document.forms[0].method.value ="agregar";
document.forms[0].submit();
}
function update(){
document.forms[0].method.value ="actualizar";
document.forms[0].submit();
}

 
 </script>
<div id="container">
      <div class="post">
      <center>
      <h2 class="aviso"><strong>BUSQUEDA DE ALUMNOS</strong></h2>
      </center>
      <blockquote>
        <p>CENTRO ESCOLAR CATOLICO MONSEÑOR ESTEBAN ALLIET.</p>
      </blockquote>
    </div>
<div id="divform">
	<h2>Seccion</h2>
	<br>
	<html:form method="POST" action="/seccion">
		<table>
			<tr>
				<td><bean:message key="label.seccion" /></td>
				<td>
				<logic:notPresent name="listacampos2"><html:text property="seccion" /></logic:notPresent>
				<logic:present name="listacampos2">
				<logic:iterate name="listacampos2" id="Id">
				<html:text property="seccion" value="${Id.seccion}" />
				</logic:iterate>
				</logic:present>
				</td>
				<td><html:errors property="seccion" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.cupo" /></td>
				<td>
				<logic:notPresent name="listacampos2"><html:text property="cupo" /></logic:notPresent>
				<logic:present name="listacampos2">
				<logic:iterate name="listacampos2" id="Id">
				<html:text property="cupo" value="${Id.limite}" />
				</logic:iterate>
				</logic:present>
				</td>
				<td><html:errors property="cupo" /></td>
			</tr>
			<tr>
				<td colspan="2"><html:hidden property="method" value="" />
				
				<logic:present name="listacampos2">
				<logic:iterate name="listacampos2" id="Id">
				<html:hidden property="id" value="${Id.idseccion}" />
				</logic:iterate>
				</logic:present>
				
				<logic:present name="listacampos2">
					<html:submit property="actulizar" onclick='update()'>
						<bean:message key="label.actualizar" />
					</html:submit> 
				</logic:present>
				
				<logic:notPresent name="listacampos2">
					<html:submit property="ingresar" onclick='nuevo()'>
						<bean:message key="label.agregar" />
					</html:submit>  
				</logic:notPresent>	
					
					</td>
			</tr>
		</table>
		<div>
			<logic:present name="msj">
			<bean:write name="msj" />
			</logic:present>
			<html:errors />
			<logic:present name="listacampos2">
			existe
			</logic:present>
		</div>
	</html:form>
<html:link action="/secciondisplay?method=mostrar">Mostrar</html:link>	
</div>
<div>
	<logic:present name="listdisplaytag">
	<display:table id="seccion" name="listdisplaytag" pagesize="2" requestURI=""> 
	<display:column title="Seccion" property="seccion" />
	<display:column title="Limite" property="limite" />
	<display:column title="Mantenimiento">
	<html:link action="/secciondisplay?method=eliminar&id=${seccion.idseccion}">Eliminar</html:link>
	<html:link action="/secciondisplay?method=campos&id=${seccion.idseccion}">Actulizar</html:link>			
	</display:column>
	</display:table>
	</logic:present>
</div>