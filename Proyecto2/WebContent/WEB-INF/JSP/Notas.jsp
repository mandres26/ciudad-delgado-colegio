<%@ include file="../JSP/top-tags.jsp"%>

<h2>Ingreso de Notas</h2>
<br>

<html:form method="POST" action="/notas">

	<table>
		<tr>
			<td><bean:message key="label.genero" /></td>
			<td><logic:present name="grado">
					<html:select property="grado">
						<html:option value="">Selecciona</html:option>
						<html:options collection="grado" property="id_grado" labelProperty="grado" />
					</html:select>
				</logic:present></td>
			<td><html:errors property="genero" /></td>
		</tr>
		<tr>
			<td><bean:message key="label.seccion" /></td>
			<td><logic:present name="listaseccion">
					<html:select property="seccion">
						<html:option value="">Selecciona</html:option>
						<html:options collection="listaseccion" property="idseccion" labelProperty="seccion" />
					</html:select>
				</logic:present></td>
			<td><html:errors property="seccion" /></td>
		</tr>
		<tr colspan="3">
		<html:submit property="consultar" >Consultar</html:submit>
		</tr>
	</table>

</html:form>

<div>
	<logic:present name="notasdisplaytag">
	<display:table id="notas" name="notasdisplaytag" requestURI=""> 
	<display:column title="Nombres" property="" />
	<display:column title="Apellidos" property="" />
	<display:column title="Nota 1" property="" />
	<display:column title="Nota 2" property="" />
	<display:column title="Nota 3" property="" />
	<display:column title="Promedio" property="" />
	<display:column title="Mantenimiento">
	<html:link action="/docentedisplay?method=eliminar&codigo=${docente.codigo_docentes}">Actualizar</html:link>		
	</display:column>
	</display:table>
	</logic:present>
	</div>