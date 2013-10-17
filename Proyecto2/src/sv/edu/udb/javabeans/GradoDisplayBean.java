package sv.edu.udb.javabeans;

public class GradoDisplayBean {
	private String idgrado;
	private String grado;
	private String idseccion;
	private String idciclo;
	
	public GradoDisplayBean() {
		// TODO Auto-generated constructor stub
	}

	public GradoDisplayBean(String idgrado, String grado, String idseccion,
			String idciclo) {
		this.idgrado = idgrado;
		this.grado = grado;
		this.idseccion = idseccion;
		this.idciclo = idciclo;
	}

	public String getIdgrado() {
		return idgrado;
	}

	public void setIdgrado(String idgrado) {
		this.idgrado = idgrado;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getIdseccion() {
		return idseccion;
	}

	public void setIdseccion(String idseccion) {
		this.idseccion = idseccion;
	}

	public String getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(String idciclo) {
		this.idciclo = idciclo;
	}
	
	

}
