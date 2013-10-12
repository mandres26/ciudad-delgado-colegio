package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sv.edu.udb.javabeans.GradoBean;

public class LlenarCombosModelo extends Coneccion {
	
	private ResultSet rs = null;
	public LlenarCombosModelo() {
		super();
	}
	
	ArrayList<GradoBean> listagrado=new ArrayList<GradoBean>();
	
	public ArrayList<GradoBean> llenearComboGrado() {
		String sql="Select * from grado";
		Connection cn=getConexion();
		PreparedStatement st=null;
		try {
		st=cn.prepareStatement(sql);
		rs=st.executeQuery();
		while(rs.next()){
			GradoBean cat=new GradoBean(rs.getString(1),rs.getString(2));
		listagrado.add(cat);
		System.out.println(rs.getString(1) + " " +rs.getString(2));
		}
		cierraConexion();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return listagrado;
	}
	
}
