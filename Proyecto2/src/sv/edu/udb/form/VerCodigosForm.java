package sv.edu.udb.form;

import org.apache.struts.validator.ValidatorForm;

public class VerCodigosForm extends ValidatorForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idcodigos;
	private String idalumno;
	private String idcodigo;
	private String idTipeCod;
	private String fecha;
	
	public String getIdcodigos() {
		return idcodigos;
	}
	public void setIdcodigos(String idcodigos) {
		this.idcodigos = idcodigos;
	}
	public String getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(String idalumno) {
		this.idalumno = idalumno;
	}
	public String getIdcodigo() {
		return idcodigo;
	}
	public void setIdcodigo(String idcodigo) {
		this.idcodigo = idcodigo;
	}
	public String getIdTipeCod() {
		return idTipeCod;
	}
	public void setIdTipeCod(String idTipeCod) {
		this.idTipeCod = idTipeCod;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
