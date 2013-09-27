<%@ include file="../JSP/top-tags.jsp"%>
<div id="divform">
<h2>Grado</h2><br>
<html:form method="POST" action="/grado">
<table>
<tr>
<td><bean:message key="label.grado"/></td><td><html:text property="grado" /></td>
</tr>
<tr>
<td><bean:message key="label.materia"/></td><td><html:select property="materia" /></td>
</tr>
<tr>
<td><bean:message key="label.seccion"/></td><td><html:select property="seccion" /></td>
</tr>
<tr>
<td><bean:message key="label.ciclo"/></td><td><html:select property="ciclo" /></td>
</tr>
<tr>
<td colspan="2">
<html:button property="ingresar" ><bean:message key="label.agregar"/></html:button>
 <html:button property="actulizar" ><bean:message key="label.actualizar"/></html:button> 
 <html:button property="borrar" ><bean:message key="label.eliminar"/></html:button>
</td>
</tr>
</table>

</html:form>

</div>