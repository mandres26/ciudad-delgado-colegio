<%@ include file="../JSP/top-tags.jsp"%>
<script type="text/javascript" language="JavaScript">
function nuevo(){
document.forms[0].method.value ="agregar";
document.forms[0].submit();
}
function update(){
document.forms[0].method.value ="actulizar";
document.forms[0].submit();

}

 
 </script>
 <link href="css/jquery-ui-1.8.22.custom.css" rel="stylesheet" type="text/css">
        <link href="css/jquery.dataTables.css" rel="stylesheet" type="text/css">
        <link href="css/demo_table.css" rel="stylesheet" type="text/css">
        <link href="css/demo_table_jui.css" rel="stylesheet" type="text/css">
<div id="container">
      <div class="post">
      <center>
      <h2 class="aviso"><strong>BUSQUEDA DE ALUMNOS</strong></h2>
      </center>
      <blockquote>
        <p>CENTRO ESCOLAR CATOLICO MONSE�OR ESTEBAN ALLIET.</p>
      </blockquote>
    </div>
<div id="divform">
	<h2>Docentes</h2>
	<br>
	
	<html:form method="POST" action="/docente">
		<table>
			<tr>
				<td><bean:message key="label.nombre" /></td>
				<td>
				<logic:notPresent name="listacampos3"><html:text property="nombre" /></logic:notPresent> 
				<logic:present name="listacampos3">
				<logic:iterate name="listacampos3" id="Id">
				<html:text property="nombre" value="${Id.nombre_docente}" />
				</logic:iterate>
				</logic:present>
				
				</td>
				<td><html:errors property="nombre" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.apellido" /></td>
				<td>
				<logic:notPresent name="listacampos3"><html:text property="apellido"  />
				</logic:notPresent>
				<logic:present name="listacampos3">
				<logic:iterate name="listacampos3" id="Id">
				<html:text property="apellido" value="${Id.apellido_docente}" />
				</logic:iterate>
				</logic:present>
				</td>
				<td><html:errors property="apellido" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.direccion" /></td>
				<td>
				<logic:notPresent name="listacampos3"><html:text property="direccion"  />
				</logic:notPresent>
				<logic:present name="listacampos3">
				<logic:iterate name="listacampos3" id="Id">
				<html:text property="direccion" value="${Id.direccion}" />
				</logic:iterate>
				</logic:present>
				</td>
				<td><html:errors property="direccion" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.telefono" /></td>
				<td>
				<logic:notPresent name="listacampos3"><html:text property="telefono"  />
				</logic:notPresent>
				<logic:present name="listacampos3">
				<logic:iterate name="listacampos3" id="Id">
				<html:text property="telefono" value="${Id.telefono}" />
				</logic:iterate>
				</logic:present>
				</td>
				<td><html:errors property="telefono" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.correo" /></td>
				<td>
				<logic:notPresent name="listacampos3" ><html:text property="correo"  />
				</logic:notPresent>
				<logic:present name="listacampos3">
				<logic:iterate name="listacampos3" id="Id">
				<html:text property="correo" value="${Id.correo}" />
				</logic:iterate>
				</logic:present>
				</td>
				<td><html:errors property="correo" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.genero" /></td>
				<td>
				<logic:notPresent name="listacampos3">
				<logic:present name="listagenero">
				<html:select property="genero" >
				<html:option value="">Seleccione</html:option>
				<html:options collection="listagenero" property="idgenero" labelProperty="genero"/>
				</html:select>
				</logic:present>
				</logic:notPresent>
				
				<logic:present name="listacampos3">
				<html:select property="genero" >
				<html:option value="">Seleccione</html:option>
				<logic:iterate name="listagenero" id="lista">
				<logic:iterate id="c" name="listacampos3">
				<logic:equal name="c" property="id_genero" value="${lista.genero}">
				<option value="${lista.idgenero}" selected="selected">${lista.genero}</option>
				</logic:equal>
				</logic:iterate>
				</logic:iterate>
				</html:select>
				</logic:present>
				
				</td>
				<td><html:errors property="genero" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<html:hidden property="method" value="" />
				<logic:present name="listacampos3">
				<logic:iterate name="listacampos3" id="Id">
				<html:hidden property="codigo" value="${Id.codigo_docentes}" />
				</logic:iterate>
				</logic:present>
				<logic:present name="listacampos3">
					<html:submit property="actulizar" onclick='update()'>
						<bean:message key="label.actualizar" />
					</html:submit>
					
					<html:link action="/docentegenero?method=combo"><bean:message key="label.cancelar" /></html:link>	
					
				</logic:present>
				
				<logic:notPresent name="listacampos3">
					<html:submit property="ingresar" onclick='nuevo()'>
						<bean:message key="label.agregar" />
					</html:submit>  
				</logic:notPresent>	
				
				</td>
			</tr>
		</table>
		<div>
			<html:errors />
			
			<logic:present name="msj">
			<bean:write name="msj" />
			</logic:present>
		</div>
	</html:form>
	
	<html:link action="/docentedisplay?method=mostrar">Mostrar</html:link>				
	
</div>
<div>
	<logic:present name="listadisplaytag">
	<display:table id="docente" name="listadisplaytag" pagesize="2" requestURI=""> 
	<display:column title="Nombre" property="nombre_docente" />
	<display:column title="Apellido" property="apellido_docente" />
	<display:column title="Direccion" property="direccion" />
	<display:column title="Telefono" property="telefono" />
	<display:column title="Correo" property="correo" />
	<display:column title="Genero" property="id_genero" />
	<display:column title="Mantenimiento">
	<html:link action="/docentedisplay?method=eliminar&codigo=${docente.codigo_docentes}">Eliminar</html:link>
	<html:link action="/docentedisplay?method=campos&codigo=${docente.codigo_docentes}">Actulizar</html:link>			
	</display:column>
	</display:table>
	</logic:present>
	</div>
