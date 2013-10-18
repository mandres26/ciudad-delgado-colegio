package sv.edu.udb.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sv.edu.udb.form.AddCodigosForm;
import sv.edu.udb.form.DocenteForm;
import sv.edu.udb.javabeans.AddCodigosBean;
import sv.edu.udb.javabeans.DocenteBean;

public class AddCodigoModelo {
		
	Coneccion cn =new Coneccion();
	
	public Integer insertar(AddCodigosForm cf){
		Integer valor = 0;
        PreparedStatement pt = null;
        String query = "insert into codigos values(?,?,?)";
		
        try {
			pt = cn.getConexion().prepareStatement(query);
			pt.setString(1, null);
			pt.setString(2, cf.getCodigo());
			pt.setString(3, cf.getTipo());
			
			valor = pt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return valor;
	}
	
	
	public ArrayList<AddCodigosBean> cdisplaytag(){
		ArrayList<AddCodigosBean> lista = new ArrayList<AddCodigosBean>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query ="SELECT codigos.id_faltas, codigos.codigo, tipecod.Tipo FROM colegio2013.codigos codigos"
				+ " INNER JOIN colegio2013.tipecod tipecod ON (codigos.Tipo = tipecod.idTipeCod)";
		
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
				AddCodigosBean db = new AddCodigosBean(rs.getString(1),rs.getString(2),rs.getString(3));
				lista.add(db);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public ArrayList<AddCodigosBean> listacampos(String codigo){
		ArrayList<AddCodigosBean> lista = new ArrayList<AddCodigosBean>();
		PreparedStatement pt = null;
		ResultSet rs = null;
		String query ="SELECT codigos.id_faltas, codigos.codigo, tipecod.Tipo FROM colegio2013.codigos codigos"
				+ " INNER JOIN colegio2013.tipecod tipecod ON (codigos.Tipo = tipecod.idTipeCod) WHERE codigos.id_faltas='"+codigo+"'";
		
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
				AddCodigosBean db = new AddCodigosBean(rs.getString(1),rs.getString(2),rs.getString(3));
				lista.add(db);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	public Integer eliminar(String codigo){
		Integer valor = 0;
		PreparedStatement pt = null;
        String query = "delete from codigos where id_faltas=?";
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
	
	public Integer actulizar(AddCodigosForm cf,String codigo){
		Integer valor = 0;
		PreparedStatement pt = null;
        String query = "update codigos set codigo=?, tipo=? where id_faltas=?";
      
        try {
			pt = cn.getConexion().prepareStatement(query);
			pt.setString(1, cf.getCodigo());
			pt.setString(2, cf.getTipo());
			pt.setString(3, codigo);
			valor = pt.executeUpdate();
			System.out.println("llego a modelo actualizar");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return valor;
	}
}
