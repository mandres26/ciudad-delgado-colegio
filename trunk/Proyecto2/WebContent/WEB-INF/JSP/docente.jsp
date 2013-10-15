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
<div id="divform">
	<h2>Docentes</h2>
	<br>
	
	<html:form method="POST" action="/docente">
		<table>
			<tr>
				<td><bean:message key="label.nombre" /></td>
				<td>
				<logic:notPresent name="listacampos"><html:text property="nombre" /></logic:notPresent> 
				<logic:present name="listacampos">
				<logic:iterate name="listacampos" id="Id">
				<html:text property="nombre" value="${Id.nombre_docente}" />
				</logic:iterate>
				</logic:present>
				
				</td>
				<td><html:errors property="nombre" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.apellido" /></td>
				<td>
				<logic:notPresent name="listacampos"><html:text property="apellido" />
				</logic:notPresent>
				<logic:present name="listacampos">
				<logic:iterate name="listacampos" id="Id">
				<html:text property="apellido" value="${Id.apellido_docente}" />
				</logic:iterate>
				</logic:present>
				</td>
				<td><html:errors property="apellido" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.direccion" /></td>
				<td>
				<logic:notPresent name="listacampos"><html:text property="direccion" />
				</logic:notPresent>
				<logic:present name="listacampos">
				<logic:iterate name="listacampos" id="Id">
				<html:text property="direccion" value="${Id.direccion}" />
				</logic:iterate>
				</logic:present>
				</td>
				<td><html:errors property="direccion" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.telefono" /></td>
				<td>
				<logic:notPresent name="listacampos"><html:text property="telefono" />
				</logic:notPresent>
				<logic:present name="listacampos">
				<logic:iterate name="listacampos" id="Id">
				<html:text property="telefono" value="${Id.telefono}" />
				</logic:iterate>
				</logic:present>
				</td>
				<td><html:errors property="telefono" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.correo" /></td>
				<td>
				<logic:notPresent name="listacampos" ><html:text property="correo" />
				</logic:notPresent>
				<logic:present name="listacampos">
				<logic:iterate name="listacampos" id="Id">
				<html:text property="correo" value="${Id.correo}" />
				</logic:iterate>
				</logic:present>
				</td>
				<td><html:errors property="correo" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.genero" /></td>
				<td>
				
				<logic:present name="listagenero">
				<html:select property="genero" >
				<html:option value="">Seleciona</html:option>
				<html:options collection="listagenero" property="idgenero" labelProperty="genero"/>
				</html:select>
				</logic:present>
				

				</td>
				<td><html:errors property="genero" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<html:hidden property="method" value="" />
				<logic:present name="listacampos">
				<logic:iterate name="listacampos" id="Id">
				<html:hidden property="codigo" value="${Id.codigo_docentes}" />
				</logic:iterate>
				</logic:present>
				<logic:present name="listacampos">
					<html:submit property="actulizar" onclick='update()'>
						<bean:message key="label.actualizar" />
					</html:submit> 
				</logic:present>
				
				<logic:notPresent name="listacampos">
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
