package sv.edu.udb.javabeans;

public class TurnoBean {
	private String id_turno;
	private String turno;
	public TurnoBean() {
		// TODO Auto-generated constructor stub
	}
	public TurnoBean(String id_turno, String turno) {
		super();
		this.id_turno = id_turno;
		this.turno = turno;
	}
	public String getId_turno() {
		return id_turno;
	}
	public void setId_turno(String id_turno) {
		this.id_turno = id_turno;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	

}
