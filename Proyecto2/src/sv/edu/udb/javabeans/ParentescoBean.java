package sv.edu.udb.javabeans;

public class ParentescoBean {
	private String id_parentesco;
	private String parentesco;
	
	public ParentescoBean() {
		// TODO Auto-generated constructor stub
	}
	
	public ParentescoBean(String id_parentesco, String parentesco) {
		super();
		this.id_parentesco = id_parentesco;
		this.parentesco = parentesco;
	}
	public String getId_parentesco() {
		return id_parentesco;
	}
	public void setId_parentesco(String id_parentesco) {
		this.id_parentesco = id_parentesco;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	

}
