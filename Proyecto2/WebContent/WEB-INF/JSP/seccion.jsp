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
<div id="container">
      <div class="post">
      <center>
      <h2 class="aviso"><strong>BUSQUEDA DE ALUMNOS</strong></h2>
      </center>
      <blockquote>
        <p>CENTRO ESCOLAR CATOLICO MONSEÑOR ESTEBAN ALLIET.</p>
      </blockquote>
    </div>
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
				<td colspan="2"><html:hidden property="method" value="" />
					<html:submit property="ingresar" onclick='nuevo()'>
						<bean:message key="label.agregar" />
					</html:submit> <html:button property="actulizar" onclick='update()'>
						<bean:message key="label.actualizar" />
					</html:button> <html:button property="borrar" onclick='remove()'>
						<bean:message key="label.eliminar" />
					</html:button></td>
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