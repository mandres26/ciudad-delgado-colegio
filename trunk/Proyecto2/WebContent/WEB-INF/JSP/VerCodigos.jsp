<%@ include file="../JSP/top-tags.jsp"%>

<h2>Ingreso de Notas</h2>
<br>

<html:form method="POST" action="/vercodigos">
<table>
			<tr>
				<td><bean:message key="label.seccion" /></td>
				<td><html:text property="carnet" /></td>
				<td><html:errors property="seccion" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.seccion" /></td>
				<td><html:text property="pass" /></td>
				<td><html:errors property="seccion" /></td>
			</tr>
			<html:submit property="ingresar">
						<bean:message key="label.agregar" />
					</html:submit>  
					</table>
</html:form>

<div>
	<logic:present name="codigosdisplaytag">
	<display:table id="codigos" name="codigosdisplaytag" requestURI=""> 
	<display:column title="#Código" property="" />
	<display:column title="Código" property="" />
	<display:column title="Tipo de Código" property="" />
	</display:table>
	</logic:present>
</div>