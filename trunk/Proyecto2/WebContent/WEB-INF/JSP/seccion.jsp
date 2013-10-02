<%@ include file="../JSP/top-tags.jsp"%>
<div id="divform">
	<h2>Seccion</h2>
	<br>
	<html:form method="POST" action="/seccion">
		<table>
			<tr>
				<td><bean:message key="label.seccion" /></td>
				<td><html:text property="seccion" /></td>
				<td><html:errors property="seccion" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.cupo" /></td>
				<td><html:text property="cupo" /></td>
				<td><html:errors property="cupo" /></td>
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