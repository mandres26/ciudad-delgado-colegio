package sv.edu.udb.javabeans;

public class ComboSeccion {

	private String idseccion;
	private String seccion;
	private String limite;
	
	public ComboSeccion() {
		// TODO Auto-generated constructor stub
	}

	public ComboSeccion(String idseccion, String seccion, String limite) {
		this.idseccion = idseccion;
		this.seccion = seccion;
		this.limite = limite;
	}

	public String getIdseccion() {
		return idseccion;
	}

	public void setIdseccion(String idseccion) {
		this.idseccion = idseccion;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getLimite() {
		return limite;
	}

	public void setLimite(String limite) {
		this.limite = limite;
	}
	
}
