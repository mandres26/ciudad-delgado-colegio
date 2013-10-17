package sv.edu.udb.modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sv.edu.udb.form.SeccionForm;
import sv.edu.udb.javabeans.ComboSeccion;
public class SeccionModelo {

Coneccion cn =new Coneccion();
	
	public Integer insertar(SeccionForm sf){
		Integer valor = 0;
        PreparedStatement pt = null;
        String query = "insert into seccion values(?,?,?)";
        
        try {
			pt = cn.getConexion().prepareStatement(query);
			pt.setString(1, null);
			pt.setString(2, sf.getSeccion());
			pt.setString(3, sf.getCupo());
			
			valor = pt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return valor;
	}
	
	public Integer actualizar(SeccionForm sf, String id){
		Integer valor = 0;
        PreparedStatement pt = null;
        String query = "update seccion set seccion=?, limite=? where id_seccion=?";
        
        try {
			pt = cn.getConexion().prepareStatement(query);
			pt.setString(1, sf.getSeccion());
			pt.setString(2, sf.getCupo());
			pt.setString(3, id);
			
			valor = pt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return valor;
	}
	
	public Integer eliminar(String id) {
		Integer valor = 0;
		PreparedStatement pt = null;
        String query = "delete from seccion where seccion.id_seccion=?";
        try {
			pt = cn.getConexion().prepareStatement(query);
			pt.setString(1, id);
			valor = pt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return valor;
	}
	
	public ArrayList<ComboSeccion> listadisplaytag(){
		ArrayList<ComboSeccion> lista = new ArrayList<ComboSeccion>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query="SELECT seccion.id_seccion, seccion.seccion, seccion.limite  FROM colegio2013.seccion seccion";
		
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
				
				ComboSeccion cb = new ComboSeccion(rs.getString(1),rs.getString(2),rs.getString(3));
				lista.add(cb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}
	
	public ArrayList<ComboSeccion> listacampos(String id){
		ArrayList<ComboSeccion> lista = new ArrayList<ComboSeccion>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query="SELECT seccion.id_seccion, seccion.seccion, seccion.limite  FROM colegio2013.seccion seccion where seccion.id_seccion="+id;
		
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
				
				ComboSeccion cb = new ComboSeccion(rs.getString(1),rs.getString(2),rs.getString(3));
				lista.add(cb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("fin del metodo");
		return lista;
	}
}
