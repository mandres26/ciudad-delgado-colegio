<%@ include file="../JSP/top-tags.jsp"%>
<div id="divform">
<h2>Seccion</h2><br>
<html:form method="POST" action="/seccion">
<table>
<tr>
<td><bean:message key="label.seccion"/></td><td><html:text property="seccion" /></td>
</tr>
<tr>
<td><bean:message key="label.cupo"/></td><td><html:text property="cupo" /></td>
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