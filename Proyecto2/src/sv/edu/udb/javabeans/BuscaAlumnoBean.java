package sv.edu.udb.javabeans;

public class BuscaAlumnoBean {
	private String codigo;
	private String nombre;
	private String apellido;
	
	
	public BuscaAlumnoBean() {
		// TODO Auto-generated constructor stub
	}
	public BuscaAlumnoBean(String codigo, String nombre, String apellido) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
}
