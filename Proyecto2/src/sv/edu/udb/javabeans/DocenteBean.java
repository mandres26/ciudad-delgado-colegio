package sv.edu.udb.javabeans;

public class DocenteBean {

	private String codigo_docentes;
	private String nombre_docente;
	private String apellido_docente;
	private String direccion;
	private String telefono;
	private String correo;
	private String id_genero;
	private String fila;

	public DocenteBean() {
		// TODO Auto-generated constructor stub
	}

	public DocenteBean(String codigo_docentes, String nombre_docente,
			String apellido_docente, String direccion, String telefono,
			String correo, String id_genero, String fila) {
		this.codigo_docentes = codigo_docentes;
		this.nombre_docente = nombre_docente;
		this.apellido_docente = apellido_docente;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.id_genero = id_genero;
		this.fila = fila;
	}

	public String getCodigo_docentes() {
		return codigo_docentes;
	}

	public void setCodigo_docentes(String codigo_docentes) {
		this.codigo_docentes = codigo_docentes;
	}

	public String getNombre_docente() {
		return nombre_docente;
	}

	public void setNombre_docente(String nombre_docente) {
		this.nombre_docente = nombre_docente;
	}

	public String getApellido_docente() {
		return apellido_docente;
	}

	public void setApellido_docente(String apellido_docente) {
		this.apellido_docente = apellido_docente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getId_genero() {
		return id_genero;
	}

	public void setId_genero(String id_genero) {
		this.id_genero = id_genero;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

}
