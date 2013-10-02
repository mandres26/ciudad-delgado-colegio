<%@ include file="../JSP/top-tags.jsp"%>
<div id="divform">
	<h2>Docentes</h2>
	<br>
	<html:form method="POST" action="/docente">
		<table>
			<tr>
				<td><bean:message key="label.nombre" /></td>
				<td><html:text property="nombre" /></td>
				<td><html:errors property="nombre" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.apellido" /></td>
				<td><html:text property="apellido" /></td>
				<td><html:errors property="apellido" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.direccion" /></td>
				<td><html:text property="direccion" /></td>
				<td><html:errors property="direccion" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.telefono" /></td>
				<td><html:text property="telefono" /></td>
				<td><html:errors property="telefono" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.correo" /></td>
				<td><html:text property="correo" /></td>
				<td><html:errors property="correo" /></td>
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
		<div>
			<html:errors />
		</div>
	</html:form>
</div>
