package sv.edu.udb.modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.*;

import com.mysql.jdbc.Statement;

public class MatriculaModelo extends Coneccion {
	private Statement st = null;
    private ResultSet rs = null;
    
	//extende desde coneccion para usar sus atributos 
	public MatriculaModelo() {
		super();
	}
	
	
	
	public boolean save1(HttpServletRequest request){
		boolean estado = false;
		HttpSession sesion=request.getSession();
		String codigo=(String) sesion.getAttribute("codigo");
		String apellidos=(String) sesion.getAttribute("apellidos");
		String nombres=(String) sesion.getAttribute("nombres");
		String grado=(String) sesion.getAttribute("grado");
		String turno=(String) sesion.getAttribute("turno");
		String sexo=(String) sesion.getAttribute("sexo");
		String fnacimiento=(String) sesion.getAttribute("fnacimiento");
		String edad=(String) sesion.getAttribute("edad");
		String direccion=(String) sesion.getAttribute("direccion");	
		
		try {
			PreparedStatement st=null;
			String query="insert into alumno values(?,?,?,?,?,?,?,?,?)";
			st.getConnection().prepareStatement(query);
			st.setString(1, codigo);
			st.setString(2, nombres);
			st.setString(3, apellidos);
			st.setString(4, direccion);
			st.setString(5, edad);
			st.setString(6, fnacimiento);
			st.setString(7, turno);
			st.setString(8, sexo);
			st.setString(9, grado);
			st.executeUpdate(query);
            
			
            estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion(getConnection());
			}
		return estado;
		
	}//fin save1
	
	public boolean save2(){
		boolean estado = false;
		try {
			st = (Statement) getConnection().createStatement();
            st.executeUpdate("");
			
            estado= true;
		}catch(SQLException ex){
			
		}
		return estado;
		
	}//fin save2
	
	public boolean save3(){
		boolean estado = false;
		try {
			st = (Statement) getConnection().createStatement();
            st.executeUpdate("");
			
            estado= true;
		}catch(SQLException ex){
			
		}
		return estado;
		
	}//fin save3
	
	public boolean save4(){
		boolean estado = false;
		try {
			st = (Statement) getConnection().createStatement();
            st.executeUpdate("");
			
			estado= true;
		}catch(SQLException ex){
			
		}
		return estado;
		
	}//fin save4
}
