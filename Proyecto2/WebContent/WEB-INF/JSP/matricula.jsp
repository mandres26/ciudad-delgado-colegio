<%@ include file="../JSP/top-tags.jsp"%>
<div id="container">
      <div class="post">
      <center>
      <h2 class="aviso"><strong>FICHA DE MATRICULA</strong></h2>
      </center>
      <blockquote>
        <p>CENTRO ESCOLAR CATOLICO MONSE�OR ESTEBAN ALLIET.</p>
      </blockquote>
    </div>
      <!-- ******************************************** --> 
      <div id="principal">

<div id="titulo1">

Calle Morazan # 26,Ciudad Delgado, San Salvador, El Salvador, C.A.<br />
TELEFAX: 2276-9676 Email: cecmealiet@hotmail.com

</div>

<div id="cuerpo">

<div id="cuerpopri"><br />
<!--************PI*********************-->
<div class="texto" ><br />INDICACION: Llenar completamente la ficha,no se podra guardar fichas incompletas.<br />
- Presentar toda la documentacion necesaria
<br />
- Los documentos deben ser entregados en el folder que se les entrego con el paquete de matricula repetando el color.
 <br />
 - Es indespensable N� Telefonico fijo, pues en la institucion no hay salidas a numeros celulares.<br /><br />
</div><br />

<% 
// session.getAttribute("apellidos");
// 	System.out.println("Apellidos:"+session.getAttribute("apellidos"));
// 	session.getAttribute("nombrep");
// 	System.out.println("nombrep:"+session.getAttribute("nombrep"));
// 	session.getAttribute("duip");
// 	System.out.println("duip:"+session.getAttribute("duip"));
	
	%>

<!--***************PII******************-->

<html:form  method="post" action="/matricula">
<div class="texto" ><div id="p2"><p><strong>LLENAR SEGUN LA PARTIDA DE NACIMIENTO</strong></p></div><br /><br />

<div id="t1">
<div id="n0">&nbsp;</div>
<div id="n1"><div id="error"><html:errors property="apellidos"/></div>&nbsp;</div>
<div id="n2"><div id="error"><html:errors property="nombres"/></div></div>
</div><br /><br />
<span><bean:message key="label.nombreda"/><html:text property="apellidos" size="25"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<html:text property="nombres" size="25"/></span><br />
<div id="t1">
<div id="n0">&nbsp;</div>
<div id="n1"><bean:message key="label.apellidos"/></div>
<div id="n2"><bean:message key="label.nombres"/></div>
</div><br /><br />
<div id="dato1">
<div id="grado">
<bean:message key="label.grado"/>
		<logic:present name="grado">
		<html:select property="grado" styleClass="textBox">
		<html:options collection="grado" property="id_grado"
 		labelProperty="grado" />
		</html:select>
		</logic:present>
</div>

<bean:message key="label.turnom"/>
		<logic:present name="turno">
		<html:select property="turno" styleClass="textBox">
		<html:options collection="turno" property="id_turno"
		labelProperty="turno" /> 
		</html:select>
		</logic:present>


<div id="sexo">

<bean:message key="label.sexo"/>
		<logic:present name="sexo">
		<html:select property="sexo" styleClass="textBox">
		<html:options collection="sexo" property="id_sexo"
		labelProperty="sexo" /> 
		</html:select> 
		</logic:present>
</div>
</div><br /><br /><br />

<div id="dato2">
<div id="nac"><html:errors property="fnacimiento"/></div>
<div id="edad"><html:errors property="edad"/></div><br>
<div id="nac">

<bean:message key="label.fnacimiento"/><html:text property="fnacimiento" size="9"/>
</div>
<div id="edad">
<bean:message key="label.edad"/><html:text property="edad" size="2"/>
</div>
</div><br /><br />
<!-- *** POr si se va a poner meses es aqui XD -->

<bean:message key="label.ndlp"/>
<div id="in">
<html:text property="responsable" size="50"/><br>
<div id="error"><html:errors property="responsable"/></div><br>
<bean:message key="label.dui"/><html:text property="duirespo" />


</div><br /><br />
<div id="pare">
<div id="pare1">
<bean:message key="label.mama"/>&nbsp;
<logic:present name="parentesco">
		<html:select property="parentesco" styleClass="textBox">
		<html:options collection="parentesco" property="id_parentesco"
		labelProperty="parentesco" /> 
		</html:select> 
		</logic:present>
&nbsp;&nbsp;
<bean:message key="label.telefono"/><html:text property="telefono" size="8"/><div id="error"><html:errors property="telefono"/></div>
</div>

</div><br /><br />
<div id="dir">
<div id="error"><html:errors property="direccion"/></div>
<bean:message key="label.direccion"/><html:text property="direccion" size="60"/>

</div><br /><br />
<div id="dato3">
<div id="zona">
<bean:message key="label.rural"/><html:radio property="zona" value="1"></html:radio>&nbsp;&nbsp;
<bean:message key="label.urbana"/><html:radio property="zona" value="2"></html:radio>

</div>

<div id="repite">
<bean:message key="label.repite"/><html:radio property="repite" value="1"></html:radio>    &nbsp;&nbsp;
<bean:message key="label.no"/><html:radio property="repite" value="2"></html:radio>
</div>
</div><br /><br />
<div id="dato4">
<div id="traba">
<bean:message key="label.alumnot"/><html:radio property="alumnot" value="1"></html:radio>
<bean:message key="label.no"/><html:radio property="alumnot" value="2"></html:radio>
  <br /><br />
  �<bean:message key="label.estudiopv"/><html:radio property="estutiopv" value="1"></html:radio>
  <bean:message key="label.no"/><html:radio property="estutiopv" value="2"></html:radio>
</div>
</div><BR /> <br />
<div id="religion">
<div id="error"><html:errors property="religion"/></div>
<bean:message key="label.religion"/><html:text property="religion"  size="30"/><br /><br />
<bean:message key="label.bautizmo"/><html:checkbox property="bautizmo"/>&nbsp;&nbsp;
<bean:message key="label.comunion"/><html:checkbox property="comunion" />&nbsp;&nbsp;
<bean:message key="label.confirma"/><html:checkbox property="confirma" /><br /><br />
<div id="error"><html:errors property="nomemer"/></div>
<bean:message key="label.nomemer"/><html:text property="nomemer"  size="20"/>&nbsp;&nbsp;
<bean:message key="label.telemer"/><html:text property="telmer"  size="8"/>

</div><br />

 </div><br />



<!--*********************************-->
<!--***********PIII****************-->

<div id="p3">

<div id="datop">
<div id="error"><html:errors property="nombrep"/></div>
<bean:message key="label.nombrep"/><html:text property="nombrep"  size="50"/>
</div><br /><html:hidden property="sexp" value="1"/>
<div id="piii">
<div id="dui">
<div id="error"><html:errors property="duip"/></div>
<bean:message key="label.dui"/><html:text property="duip"  size="10"/>
</div>
<div id="po">
<div id="error"><html:errors property="profesionp"/></div>
<bean:message key="label.profesion"/><html:text property="profesionp"  size="30"/>
</div><bR />
</div><br />

<div id="info">
<div id="lt">
<div id="error"><html:errors property="ltrabajop"/></div><div id="error"><html:errors property="telp"/></div>
<bean:message key="label.ltrabajo"/><html:text property="ltrabajop"  size="30"/>&nbsp;&nbsp;

<bean:message key="label.tel"/><html:text property="telp"  size="8"/>
</div>
</div><BR />
<hr />
<div id="datop">
<div id="error"><html:errors property="nombrem"/></div>
<bean:message key="label.nombrem"/><html:text property="nombrem"  size="50"/>
</div><br /><html:hidden property="sexm" value="2"/>
<div id="piii">
<div id="dui">
<div id="error"><html:errors property="duim"/></div>
<bean:message key="label.dui"/><html:text property="duim"  size="10"/>
</div>
<div id="po">
<div id="error"><html:errors property="profesionm"/></div>
<bean:message key="label.profesion"/><html:text property="profesionm"  size="30"/>
</div><bR />
</div><br />

<div id="info">
<div id="lt">
<div id="error"><html:errors property="ltrabajom"/></div><div id="error"><html:errors property="telm"/></div>
<bean:message key="label.ltrabajo"/><html:text property="ltrabajom"  size="30"/>&nbsp;&nbsp;
<bean:message key="label.tel"/><html:text property="telm"  size="8"/>
</div>
</div>


</div><bR />



<!--*********PIV******************-->

<div id="pt4">
<bean:message key="label.salum"/>
<bR />
<div id="pt4-">
<div id="neu"> <bean:message key="label.neu"/><html:checkbox property="neu" /></div>
<div id="psi"> <bean:message key="label.psi"/><html:checkbox property="psi" /></div>
<div id="aulg"><bean:message key="label.aulg"/><html:checkbox property="aulg" /></div>
</div><br /><br />





<div id="pt4-">
<bean:message key="label.terapia"/><br><br>
<div id="neu"> <bean:message key="label.lenguaje"/><html:checkbox property="lenguaje" /></div>
<div id="tedu"> <bean:message key="label.tedu"/><html:checkbox property="tedu" /></div>
<div id="dificultad"><bean:message key="label.dificultad"/><html:checkbox property="dificultad" /></div><br />
<div id="error"><html:errors property="diful"/></div>
<bean:message key="label.diful"/><br /><html:textarea property="diful" rows="4" cols="60"/><br /><br /><br />
<div id="error"><html:errors property="enfe"/></div><div id="error"><html:errors property="alergias"/></div>
<bean:message key="label.enfe"/><html:text property="enfe"  size="20"/>&nbsp;&nbsp;
<bean:message key="label.alergias"/><html:text property="alergias"  size="20"/><br /><br />
<bean:message key="label.vcsi"/><html:radio property="vc" value="1"></html:radio>&nbsp;&nbsp;
<bean:message key="label.no"/><html:radio property="vc" value="2"></html:radio>&nbsp;&nbsp;
<bean:message key="label.pesolb"/><html:text property="pesolb"  size="1"/><br /><br />
<div id="error"><html:errors property="talla"/></div>
<bean:message key="label.talla"/><html:text property="talla"  size="1"/><br /> <br />
<bean:message key="label.medif"/><html:text property="medif"  size="10"/><br /><br />
<bean:message key="label.infoad"/><br />
<html:textarea property="infoad" rows="3" cols="60"></html:textarea> 


</div><br />


</div><br /><bR>




<!--*************PV************-->

<div id="pt4">
 <bean:message key="label.data"/><br><br>
<bean:message key="label.npartida"/><html:text property="npartida"  size="2"/>&nbsp;&nbsp;
<bean:message key="label.nlibro"/><html:text property="nlibro"  size="2"/>&nbsp;&nbsp;
<bean:message key="label.nfolio"/><html:text property="nfolio"  size="2"/>&nbsp;&nbsp;
<bean:message key="label.ntomo"/><html:text property="ntomo"  size="2"/><br/><br/>
</div><br />
<!--*************PVI************-->
<div id="pt4">
<bean:message key="label.inst"/><bR /><br /> <br />
<div id="bc"><bean:message key="label.buscar"/><html:text property="buscar"  /></div><br />
1:<html:text property="h1"  size="40"/> 

<br /><br />
2:<html:text property="h2"  size="40"/> 

<br /><br />
3:<html:text property="h3"  size="40"/> 

<br /><br />
4:<html:text property="h4"  size="40"/> 

<br /><br /><br />
</div><br />
<!--*************PVII************-->
<div id="pt4">
<bean:message key="label.docu"/><br /><br />
<bean:message key="label.ccondu"/><html:checkbox property="ccondu" />&nbsp;&nbsp;
<bean:message key="label.cmedi"/><html:checkbox property="cmedi" /><br /><br />
<bean:message key="label.cparti"/><html:checkbox property="cparti" />&nbsp;&nbsp;&nbsp;&nbsp;
<bean:message key="label.ccerti"/><html:checkbox property="ccerti" /><br /><br />
<bean:message key="label.cdiplo"/><html:checkbox property="cdiplo" /><br /><br />
<bean:message key="label.clibretap"/><html:checkbox property="clibretap" />&nbsp;&nbsp;&nbsp;
<bean:message key="label.clibretan"/><html:checkbox property="clibretan" />&nbsp;&nbsp;&nbsp;&nbsp;
<bean:message key="label.cboleta"/><html:checkbox property="cboleta" /><br /><br />
<bean:message key="label.carta"/><html:checkbox property="ccarta" /><br /><br />

<bean:message key="label.checes"/><html:checkbox property="checes" />&nbsp;&nbsp;&nbsp;
<bean:message key="label.csangre"/><html:checkbox property="csangre" />&nbsp;&nbsp;&nbsp;
<bean:message key="label.corina"/><html:checkbox property="corina" /><br /><br /><br />
</div>

<hr>
<html:submit property="enviar" >Enviar</html:submit>
<html:hidden property="method" value="matricula"/>
<!--*************************-->

</html:form>
</div>
</div>
</div>

     <!-- ******************************************** -->     
      
      
      
    