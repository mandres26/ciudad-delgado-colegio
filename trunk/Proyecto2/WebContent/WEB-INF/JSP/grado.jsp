<%@ include file="../JSP/top-tags.jsp"%>
<script type="text/javascript" language="JavaScript">
function nuevo(){
document.forms[0].method.value ="agregar";
document.forms[0].submit();
}
function update(){
document.forms[0].method.value ="actulizar";
document.forms[0].submit();
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
	<h2>Grado</h2>
	<br>
	<html:form method="POST" action="/grado">
		<table>
			<tr>
				<td><bean:message key="label.grado" /></td>
				<td>
				<logic:notPresent name="listacampos"><html:text property="grado" /></logic:notPresent>
				
				<logic:present name="listacampos">
				<logic:iterate name="listacampos" id="Id">
				<html:text property="grado" value="${Id.grado}" />
				</logic:iterate>
				</logic:present>
				</td>
				<td><html:errors property="grado" /></td>
			</tr>
			<tr>
				<td><bean:message key="label.seccion" /></td>
				<td>
				<logic:notPresent name="listacampos">
				<logic:present name="listaseccion">
				<html:select property="seccion">
						<html:option value="">Seleccione</html:option>
						<html:options collection="listaseccion" property="idseccion" labelProperty="seccion" />
					</html:select>
				</logic:present>
				</logic:notPresent>
				
				<logic:present name="listacampos">
				<html:select property="seccion">
						<html:option value="">Seleccione</html:option>
						<logic:iterate name="listaseccion" id="lista">
						<logic:iterate id="c" name="listacampos">
						<logic:equal name="c" property="idseccion" value="${lista.seccion}">
						<option value="${lista.idseccion}" selected="selected">${lista.seccion}</option>
						</logic:equal>
						<logic:notEqual name="c" property="idseccion" value="${lista.seccion}">
						<html:option value="${lista.idseccion}">${lista.seccion}</html:option>
						</logic:notEqual>
						</logic:iterate>					
						</logic:iterate>
				</html:select>
				</logic:present>

					</td>
				<td><html:errors property="seccion" /></td>

			</tr>
			<tr>
				<td><bean:message key="label.ciclo" /></td>
				<td>
				<logic:notPresent name="listacampos">
				<logic:present name="listaciclo">
				<html:select property="ciclo">
						<html:option value="">Seleccione</html:option>
						<html:options collection="listaciclo" property="idciclo" labelProperty="ciclo" />
					</html:select>
				</logic:present>
				</logic:notPresent>
				
				<logic:present name="listacampos">
				<html:select property="ciclo">
						<html:option value="">Seleccione</html:option>
						<logic:iterate name="listaciclo" id="lista">
						<logic:iterate id="c" name="listacampos">
						<logic:equal name="c" property="idciclo" value="${lista.ciclo}">
						<option value="${lista.idciclo}" selected="selected">${lista.ciclo}</option>
						</logic:equal>
						<logic:notEqual name="c" property="idciclo" value="${lista.ciclo}">
						<option value="${lista.idciclo}" >${lista.ciclo}</option>
						</logic:notEqual>
						</logic:iterate>
						</logic:iterate>
					</html:select>
				</logic:present>
				
					
					</td>
				<td><html:errors property="ciclo" /></td>
			</tr>
			<tr>
				<td colspan="2"><html:hidden property="method" value="" />
				
				<logic:present name="listacampos">
				<logic:iterate name="listacampos" id="Id">
				<html:hidden property="id" value="${Id.idgrado}" />
				</logic:iterate>
				</logic:present>
				
				<logic:present name="listacampos">
					<html:submit property="actulizar" onclick='update()'>
						<bean:message key="label.actualizar" />
					</html:submit> 
				</logic:present>
				
				<logic:notPresent name="listacampos">
					<html:submit property="ingresar" onclick='nuevo()'>
						<bean:message key="label.agregar" />
					</html:submit>  
				</logic:notPresent>	
					
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
<html:link action="/gradodisplay?method=mostrar">Mostrar</html:link>	
</div>
<div>
	<logic:present name="listdisplaytag">
	<display:table id="grado" name="listdisplaytag" pagesize="2" requestURI=""> 
	<display:column title="Ciclo" property="idciclo" />
	<display:column title="Grado" property="grado" />
	<display:column title="Seccion" property="idseccion" />
	<display:column title="Mantenimiento">
	<html:link action="/gradodisplay?method=eliminar&id=${grado.idgrado}">Eliminar</html:link>
	<html:link action="/gradodisplay?method=campos&id=${grado.idgrado}">Actulizar</html:link>			
	</display:column>
	</display:table>
	</logic:present>
</div>