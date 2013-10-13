package sv.edu.udb.modelo;
import java.sql.*;
public class Coneccion {
	Connection cn = null;
	public Coneccion () {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Se obtiene una conexion con la base de datos.
			cn = DriverManager.getConnection("jdbc:mysql://localhost/colegio2013", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

	public void cierraConexion() {
		try {
			 
				cn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConexion(){
		return cn;
	}

}
