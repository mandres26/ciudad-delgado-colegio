package sv.edu.udb.form;

import org.apache.struts.action.ActionForm;

public class NotasForm extends ActionForm{
	private static final long serialVersionUID = 1L;
	private String grado;
	private String seccion;

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	
	
}
