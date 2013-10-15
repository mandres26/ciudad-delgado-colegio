package sv.edu.udb.form;

import org.apache.struts.action.ActionForm;

public class BuscarForm extends ActionForm {
	
	private String iniciar;
	
	public BuscarForm() {
		// TODO Auto-generated constructor stub
	}

	public BuscarForm(String iniciar) {
		super();
		this.iniciar = iniciar;
	}

	public String getIniciar() {
		return iniciar;
	}

	public void setIniciar(String iniciar) {
		this.iniciar = iniciar;
	}
	

}
