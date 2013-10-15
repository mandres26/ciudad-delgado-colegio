package sv.edu.udb.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sv.edu.udb.form.GradoForm;
import sv.edu.udb.form.DocenteForm;
import sv.edu.udb.javabeans.*;
public class GradoModelo {

	Coneccion cn =new Coneccion();
	
	public Integer insertar(GradoForm gf){
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
	
	public ArrayList<ComboSeccion> listaseccion(){
		ArrayList<ComboSeccion> lista = new ArrayList<ComboSeccion>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query ="SELECT seccion.id_seccion, seccion.seccion, seccion.limite  FROM colegio2013.seccion seccion";
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
				ComboSeccion cs = new ComboSeccion(rs.getString(1),rs.getString(2),rs.getString(3));
				lista.add(cs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}
	
	public ArrayList<ComboCiclo> listaciclo(){
		ArrayList<ComboCiclo> lista = new ArrayList<ComboCiclo>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query ="SELECT ciclo.id_ciclo, ciclo.tipo_ciclo FROM colegio2013.ciclo ciclo";
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
				ComboCiclo cc = new ComboCiclo(rs.getString(1),rs.getString(2));
				lista.add(cc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}
}
