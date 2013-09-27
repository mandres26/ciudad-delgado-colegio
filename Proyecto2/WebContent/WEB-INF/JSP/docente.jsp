<%@ include file="../JSP/top-tags.jsp"%>
<div id="divform">
<h2>Docentes</h2><br>
<html:form method="POST" action="/docente">
<table>
<tr>
<td><bean:message key="label.nombre"/></td><td><html:text property="nombre" /></td>
</tr>
<tr>
<td><bean:message key="label.apellido"/></td><td><html:text property="apellido" /></td>
</tr>
<tr>
<td><bean:message key="label.direccion"/></td><td><html:text property="direccion" /></td>
</tr>
<tr>
<td><bean:message key="label.telefono"/></td><td><html:text property="telefono" /></td>
</tr>
<tr>
<td><bean:message key="label.correo"/></td><td><html:text property="correo" /></td>
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