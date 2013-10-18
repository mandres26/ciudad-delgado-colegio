package sv.edu.udb.javabeans;

public class AddCodigosBean {
	
	private String id_faltas;
	private String codigo;
	private String Tipo;
	
	
	
	public String getId_faltas() {
		return id_faltas;
	}
	public void setId_faltas(String id_faltas) {
		this.id_faltas = id_faltas;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	/**
	 * @param id_faltas
	 * @param codigo
	 * @param tipo
	 */
	public AddCodigosBean(String id_faltas, String codigo, String tipo) {
		this.id_faltas = id_faltas;
		this.codigo = codigo;
		Tipo = tipo;
	}
	
	
	/**
	 * 
	 */
	public AddCodigosBean() {
		// TODO Auto-generated constructor stub
	}

}
