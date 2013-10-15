package sv.edu.udb.form;

import org.apache.struts.action.ActionForm;

public class VerForm extends ActionForm {
	private String codigo;

	
	public VerForm() {
		// TODO Auto-generated constructor stub
	}
	public VerForm(String codigo) {
		super();
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
