package sv.edu.udb.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sv.edu.udb.form.LoginForm;


public class LoginModelo {
	Coneccion cn =new Coneccion();
	
	public ArrayList<String> login(LoginForm lm){
		CarnetModelo cm = new CarnetModelo();
		ArrayList<String> lista = new ArrayList<String>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query ="SELECT usuarios.codigo, usuarios.user, usuarios.pass, usuarios.id_privilegio "
				+ "FROM colegio2013.usuarios usuarios where usuarios.user=?";
		try {
			pt = cn.getConexion().prepareStatement(query);
			pt.setString(1, lm.getUsuario());
			rs = pt.executeQuery();
			while (rs.next()) {
				if(rs.getString(3).equals(lm.getPass())){
				lista.add(rs.getString(2));
				lista.add(rs.getString(3));
				lista.add(rs.getString(4));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return lista;
	}

}
