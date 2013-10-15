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
function remove(){
document.forms[0].method.value ="eliminar";
document.forms[0].submit();
}
function show(){
document.forms[0].method.value ="mostrar";
// document.forms[0].submit();

}
 
 </script>
<div id="divform">
	<h2>Grado</h2>
	<br>
	<html:form method="POST" action="/grado">
		<table>
			<tr>
				<td><bean:message key="label.grado" /></td>
				<td><html:text property="grado" /></td>
				<td><html:errors property="grado" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.seccion" /></td>
				<td>
				<logic:present name="listaseccion">
				<html:select property="seccion">
						<html:option value="">Seleccione</html:option>
						<html:options collection="listaseccion" property="idseccion" labelProperty="seccion" />
					</html:select>
				</logic:present>
					</td>
				<td><html:errors property="seccion" /></td>

			</tr>
			<tr>
				<td><bean:message key="label.ciclo" /></td>
				<td>
				<logic:present name="listaciclo">
				<html:select property="ciclo">
						<html:option value="">Seleccione</html:option>
						<html:options collection="listaciclo" property="idciclo" labelProperty="ciclo" />
					</html:select>
				</logic:present>	
					</td>
				<td><html:errors property="ciclo" /></td>
			</tr>
			<tr>
				<td colspan="2"><html:hidden property="method" value="" />
					<html:submit property="ingresar" onclick='nuevo()'>
						<bean:message key="label.agregar" />
					</html:submit> <html:button property="actulizar" onclick='update()'>
						<bean:message key="label.actualizar" />
					</html:button> <html:button property="borrar" onclick='remove()'>
						<bean:message key="label.eliminar" />
					</html:button>
					</td>
			</tr>
		</table>
		<div>
			<logic:present name="msj">
			<bean:write name="msj" />
			</logic:present>
			<html:errors />
		</div>
	</html:form>

</div>