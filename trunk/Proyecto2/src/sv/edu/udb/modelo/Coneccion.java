package sv.edu.udb.modelo;
import java.sql.*;
public class Coneccion {
	public Coneccion() {
		// TODO Auto-generated constructor stub
	}
	
	public Connection getConnection() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Se obtiene una conexion con la base de datos.
			cn = DriverManager.getConnection("jdbc:mysql://localhost/colegio213", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cn;
	}

	public void cierraConexion(Connection cn) {
		try {
			if (cn != null && !cn.isClosed()) {
				cn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
