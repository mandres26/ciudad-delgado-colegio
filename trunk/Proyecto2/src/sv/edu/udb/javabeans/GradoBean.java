package sv.edu.udb.javabeans;

public class GradoBean {
	private String id_grado;
	private String grado;
	private String idseccion;
	private String idciclo;
	
	public GradoBean() {
		// TODO Auto-generated constructor stub
	}		
	public GradoBean(String id_grado, String grado) {
		super();
		this.id_grado = id_grado;
		this.grado = grado;
	}
	public String getId_grado() {
		return id_grado;
	}
	public void setId_grado(String id_grado) {
		this.id_grado = id_grado;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	

}
