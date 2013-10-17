package sv.edu.udb.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sv.edu.udb.form.GradoForm;
import sv.edu.udb.form.DocenteForm;
import sv.edu.udb.javabeans.*;

public class GradoModelo {

	Coneccion cn = new Coneccion();

	public Integer insertar(GradoForm gf) {
		Integer valor = 0;
		PreparedStatement pt = null;
		String query = "insert into grado values(?,?,?,?)";

		try {
			pt = cn.getConexion().prepareStatement(query);
			pt.setString(1, null);
			pt.setString(2, gf.getGrado());
			pt.setString(3, gf.getSeccion());
			pt.setString(4, gf.getCiclo());
			valor = pt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return valor;
	}
	
	
	public Integer actulizar(GradoForm gf, String id) {
		Integer valor = 0;
		PreparedStatement pt = null;
        String query = "update grado set grado=?, idseccion=?, idciclo=? where id_grado=?";
        try {
			pt = cn.getConexion().prepareStatement(query);
			pt.setString(1, gf.getGrado());
			pt.setString(2, gf.getSeccion());
			pt.setString(3, gf.getCiclo());
			pt.setString(4, id);
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
        String query = "delete from grado where id_grado=?";
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
	

	public ArrayList<GradoDisplayBean> listadisplaytag(){
		ArrayList<GradoDisplayBean> lista = new ArrayList<GradoDisplayBean>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query="SELECT grado.id_grado,"
       +"grado.grado, "
       +"seccion.seccion,"
       +"ciclo.tipo_ciclo "
       +"FROM (colegio2013.grado grado "
       +"INNER JOIN colegio2013.ciclo ciclo ON "
       +"(grado.idciclo = ciclo.id_ciclo)) INNER JOIN "
       +"colegio2013.seccion seccion ON "
       +"(grado.idseccion = seccion.id_seccion)";
		
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
				GradoDisplayBean gd = new GradoDisplayBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				lista.add(gd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}
	
	public ArrayList<GradoDisplayBean> listacampos(String id){
		ArrayList<GradoDisplayBean> lista = new ArrayList<GradoDisplayBean>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query="SELECT grado.id_grado,"
       +"grado.grado, "
       +"seccion.seccion,"
       +"ciclo.tipo_ciclo "
       +"FROM (colegio2013.grado grado "
       +"INNER JOIN colegio2013.ciclo ciclo ON "
       +"(grado.idciclo = ciclo.id_ciclo)) INNER JOIN "
       +"colegio2013.seccion seccion ON "
       +"(grado.idseccion = seccion.id_seccion) where grado.id_grado="+id;
		
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
				GradoDisplayBean gd = new GradoDisplayBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				lista.add(gd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}

	public ArrayList<ComboSeccion> listaseccion() {
		ArrayList<ComboSeccion> lista = new ArrayList<ComboSeccion>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query = "SELECT seccion.id_seccion, seccion.seccion, seccion.limite  FROM colegio2013.seccion seccion";
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
				ComboSeccion cs = new ComboSeccion(rs.getString(1),
						rs.getString(2), rs.getString(3));
				lista.add(cs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}

	public ArrayList<ComboCiclo> listaciclo() {
		ArrayList<ComboCiclo> lista = new ArrayList<ComboCiclo>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query = "SELECT ciclo.id_ciclo, ciclo.tipo_ciclo FROM colegio2013.ciclo ciclo";
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
				ComboCiclo cc = new ComboCiclo(rs.getString(1), rs.getString(2));
				lista.add(cc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}
}
