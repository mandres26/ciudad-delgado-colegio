<%@ include file="../JSP/top-tags.jsp"%>
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
				<td><bean:message key="label.materia" /></td>
				<td><html:select property="materia">
						<html:option value="">Seleccione</html:option>
						<html:option value="1">Ciencia</html:option>
					</html:select></td>
				<td><html:errors property="materia" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.seccion" /></td>
				<td><html:select property="seccion">
						<html:option value="">Seleccione</html:option>
						<html:option value="1">A</html:option>
					</html:select></td>
				<td><html:errors property="seccion" /></td>
				
			</tr>
			<tr>
				<td><bean:message key="label.ciclo" /></td>
				<td><html:select property="ciclo">
						<html:option value="">Seleccione</html:option>
						<html:option value="1">Ciclo 1</html:option>
					</html:select></td>
				<td><html:errors property="ciclo" /></td>
			</tr>
			<tr>
				<td colspan="2"><html:hidden property="method" value="agregar" />
					<html:submit property="ingresar">
						<bean:message key="label.agregar" />
					</html:submit> <html:button property="actulizar">
						<bean:message key="label.actualizar" />
					</html:button> <html:button property="borrar">
						<bean:message key="label.eliminar" />
					</html:button></td>
			</tr>
		</table>

	</html:form>

</div>