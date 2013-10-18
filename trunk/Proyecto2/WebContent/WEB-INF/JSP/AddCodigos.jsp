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
function eliminar(){
	document.forms[0].method.value ="eliminar";
	document.forms[0].submit();

	}
 
 </script>

<h2>Codigos</h2>
<br>

<html:form method="POST" action="/addcodigos">
<table>

			<tr>
				<td><bean:message key="label.codigo" /></td>
				<td>
					<logic:notPresent name="listacampos">
						<html:text property="codigo" />		
					</logic:notPresent>
					<logic:present name="listacampos">
						<logic:iterate name="listacampos" id="Id">
							<html:text property="codigo" value="${Id.codigo}" />
						</logic:iterate>	
					</logic:present>
				</td>
				<td><html:errors property="codigo" /></td>
			</tr>
			<tr>
			<td><bean:message key="label.tipo" /></td>
			<td><logic:present name="tipo">
					<html:select property="tipo">
						<html:option value="">Selecciona</html:option>
						<html:options collection="tipo" property="idTipeCod" labelProperty="tipo" />
					</html:select>
				</logic:present></td>
			<td><html:errors property="tipo" /></td>
		</tr>
						<td colspan="2">
				<html:hidden property="method" value="" />
				
				<logic:present name="listacampos">
				<logic:iterate name="listacampos" id="Id">
							<html:hidden property="codigos" value="${Id.id_faltas}" />
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
		</table>
		<div>
			
			<logic:present name="msj">
			<bean:write name="msj" />
			</logic:present>
		</div>
	</html:form>
	
	<html:link action="/codigosdisplay?method=mostrar">Mostrar</html:link>				


<div>
	<logic:present name="codisplaytag">
	<display:table id="cod" name="codisplaytag" requestURI=""> 
	<display:column title="Codigo" property="codigo" />
	<display:column title="Tipo de Código" property="tipo" />
	<display:column title="Mantenimiento">
	<html:link action="/codigosdisplay?method=campos&codigos=${cod.id_faltas}">Actualizar</html:link>
	<html:link action="/codigosdisplay?method=eliminar&codigos=${cod.id_faltas}">Eliminar</html:link>			
	</display:column>
	</display:table>
	</logic:present>
	</div>
		