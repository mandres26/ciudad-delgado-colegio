package sv.edu.udb.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sv.edu.udb.modelo.CarnetModelo;
import sv.edu.udb.form.DocenteForm;
import sv.edu.udb.javabeans.*;
public class DocenteModelo {

	Coneccion cn =new Coneccion();
	
	public Integer insertar(DocenteForm df){
		CarnetModelo cm = new CarnetModelo();
		Integer valor = 0;
        PreparedStatement pt = null;
        String query = "insert into docentes values(?,?,?,?,?,?,?,?)";
		
        try {
			pt = cn.getConexion().prepareStatement(query);
			pt.setString(1, cm.generar());
			pt.setString(2, df.getNombre());
			pt.setString(3, df.getApellido());
			pt.setString(4, df.getDireccion());
			pt.setString(5, df.getTelefono());
			pt.setString(6, df.getCorreo());
			pt.setString(7, df.getGenero());
			pt.setString(8, null);
			valor = pt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			if (e.getSQLState().equals("23000")) {//error de duplicado de primary key.
                valor = 2;
            }
			e.printStackTrace();
		}
        
        
		return valor;
	}
	
	public Integer actulizar(DocenteForm df,String codigo){
		Integer valor = 0;
		PreparedStatement pt = null;
        String query = "update docentes set nombre_docente=?, apellido_docente=?, direccion=?, telefono=?, correo=?, id_genero=? where codigo_docentes=?";
      
        try {
			pt = cn.getConexion().prepareStatement(query);
			pt.setString(1, df.getNombre());
			pt.setString(2, df.getApellido());
			pt.setString(3, df.getDireccion());
			pt.setString(4, df.getTelefono());
			pt.setString(5, df.getCorreo());
			pt.setString(6, df.getGenero());
			pt.setString(7, codigo);
			valor = pt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return valor;
	}
	
	public Integer eliminar(String codigo){
		Integer valor = 0;
		PreparedStatement pt = null;
        String query = "delete from docentes where codigo_docentes=?";
        try {
			pt = cn.getConexion().prepareStatement(query);
			pt.setString(1, codigo);
			valor = pt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return valor;
	}
	
	public ArrayList<DocenteBean> listadisplaytag(){
		ArrayList<DocenteBean> lista = new ArrayList<DocenteBean>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query ="SELECT docentes.codigo_docentes," +
				"       docentes.nombre_docente," +
				"       docentes.apellido_docente," +
				"       docentes.direccion," +
				"       docentes.telefono," +
				"       docentes.correo," +
				"       genero.genero," +
				"       docentes.fila" +
				"  FROM    colegio2013.docentes docentes" +
				"       INNER JOIN" +
				"          colegio2013.genero genero" +
				"       ON (docentes.id_genero = genero.id_genero)";
		
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
				//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
				DocenteBean db = new DocenteBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
				lista.add(db);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
		
		
		return lista;
	}
	
	public ArrayList<DocenteBean> listacampos(String codigo){
		ArrayList<DocenteBean> lista = new ArrayList<DocenteBean>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query ="SELECT docentes.codigo_docentes," +
				"       docentes.nombre_docente," +
				"       docentes.apellido_docente," +
				"       docentes.direccion," +
				"       docentes.telefono," +
				"       docentes.correo," +
				"       genero.genero" +
				"  FROM    colegio2013.docentes docentes" +
				"       INNER JOIN" +
				"          colegio2013.genero genero" +
				"       ON (docentes.id_genero = genero.id_genero) where docentes.codigo_docentes='"+codigo+"'";
		
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			
			while (rs.next()) {
				//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
				//DocenteBean db = new DocenteBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),"");
//				lista.add(rs.getString(1));
//				lista.add(rs.getString(3));
//				lista.add(rs.getString(4));
//				lista.add(rs.getString(5));
//				lista.add(rs.getString(6));
//				lista.add(rs.getString(7));
//			listUsers.add(new User("user1", "http://www.user1.com"));
				lista.add(new DocenteBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),""));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}
	
	public ArrayList<ComboGenero> listaGenero(){
		ArrayList<ComboGenero> lista = new ArrayList<ComboGenero>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query ="SELECT genero.id_genero, genero.genero FROM colegio2013.genero genero";
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
//				System.out.println(rs.getString(1)+"  "+rs.getString(2));
				ComboGenero cg = new ComboGenero(rs.getString(1),rs.getString(2));
				lista.add(cg);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
}
