package sv.edu.udb.javabeans;

public class CodigosBean {
	private String idTipeCod;
	private String Tipo;
	
	
	public String getIdTipeCod() {
		return idTipeCod;
	}
	public void setIdTipeCod(String idTipeCod) {
		this.idTipeCod = idTipeCod;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	/**
	 * @param idTipeCod
	 * @param tipo
	 */
	public CodigosBean(String idTipeCod, String tipo) {
		this.idTipeCod = idTipeCod;
		Tipo = tipo;
	}
	/**
	 * 
	 */
	public CodigosBean() {
		// TODO Auto-generated constructor stub
	}
	
}
	
	
	
