package sv.edu.udb.javabeans;

public class SexoBean {
	private String id_sexo;
	private String sexo;
	
	public SexoBean() {
		// TODO Auto-generated constructor stub
	}
	public SexoBean(String id_sexo, String sexo) {
		super();
		this.id_sexo = id_sexo;
		this.sexo = sexo;
	}
	public String getId_sexo() {
		return id_sexo;
	}
	public void setId_sexo(String id_sexo) {
		this.id_sexo = id_sexo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

}
