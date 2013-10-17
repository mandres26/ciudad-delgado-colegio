package sv.edu.udb.javabeans;

public class VerBean {
	private String codigo;
	private String apellido;
	private String nombre;
	private String sexo;
	private String grado;
	private String seccion;
	private String fechan;
	private String edad;
	private String nomrespo;	
	private String direccion;
	private String telefono;
	private String año;
	
	public VerBean() {
		// TODO Auto-generated constructor stub
	}
	public VerBean(String codigo, String apellido, String nombre, String sexo,
			String grado, String seccion, String fechan, String edad,
			String nomrespo, String direccion, String telefono, String año) {
		super();
		this.codigo = codigo;
		this.apellido = apellido;
		this.nombre = nombre;
		this.sexo = sexo;
		this.grado = grado;
		this.seccion = seccion;
		this.fechan = fechan;
		this.edad = edad;
		this.nomrespo = nomrespo;
		this.direccion = direccion;
		this.telefono = telefono;
		this.año = año;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getFechan() {
		return fechan;
	}
	public void setFechan(String fechan) {
		this.fechan = fechan;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getNomrespo() {
		return nomrespo;
	}
	public void setNomrespo(String nomrespo) {
		this.nomrespo = nomrespo;
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
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	
	
	
	
	
	
	
}
