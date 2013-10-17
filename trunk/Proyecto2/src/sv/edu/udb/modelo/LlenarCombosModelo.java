package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sv.edu.udb.javabeans.BuscaAlumnoBean;
import sv.edu.udb.javabeans.GradoBean;
import sv.edu.udb.javabeans.ParentescoBean;
import sv.edu.udb.javabeans.SexoBean;
import sv.edu.udb.javabeans.TurnoBean;
import sv.edu.udb.javabeans.VerBean;

public class LlenarCombosModelo extends Coneccion {
	
	private ResultSet rs = null;
	public LlenarCombosModelo() {
		super();
	}
	
	ArrayList<GradoBean> listagrado=new ArrayList<GradoBean>();
	ArrayList<TurnoBean> listaturno=new ArrayList<TurnoBean>();
	ArrayList<SexoBean> listasexo=new ArrayList<SexoBean>();
	ArrayList<ParentescoBean> listapare=new ArrayList<ParentescoBean>();
	ArrayList<BuscaAlumnoBean> listaalumno=new ArrayList<BuscaAlumnoBean>();
	ArrayList<VerBean> veralumno=new ArrayList<VerBean>();
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
		
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return listagrado;
	}
	public ArrayList<TurnoBean> llenearComboTurno() {
		String sql="Select * from turno";
		Connection cn=getConexion();
		PreparedStatement st=null;
		try {
		st=cn.prepareStatement(sql);
		rs=st.executeQuery();
		while(rs.next()){
			TurnoBean cat=new TurnoBean(rs.getString(1),rs.getString(2));
		listaturno.add(cat);
		System.out.println(rs.getString(1) + " " +rs.getString(2));
		}
		
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return listaturno;
	}
	
	public ArrayList<SexoBean> llenearComboSexo() {
		String sql="Select * from genero";
		Connection cn=getConexion();
		PreparedStatement st=null;
		try {
		st=cn.prepareStatement(sql);
		rs=st.executeQuery();
		while(rs.next()){
			SexoBean  cat=new SexoBean(rs.getString(1),rs.getString(2));
		listasexo.add(cat);
		System.out.println(rs.getString(1) + " " +rs.getString(2));
		}
		
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return listasexo;
	}
	public ArrayList<ParentescoBean> llenearComboPare() {
		String sql="Select * from parentesco";
		Connection cn=getConexion();
		PreparedStatement st=null;
		try {
		st=cn.prepareStatement(sql);
		rs=st.executeQuery();
		while(rs.next()){
			ParentescoBean  cat=new ParentescoBean(rs.getString(1),rs.getString(2));
		listapare.add(cat);
		System.out.println(rs.getString(1) + " " +rs.getString(2));
		}
		cierraConexion();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return listapare;
	}
	
	public ArrayList<BuscaAlumnoBean> llenearListaAlumno() {
		String sql="Select * from alumno";
		Connection cn=getConexion();
		PreparedStatement st=null;
		try {
		st=cn.prepareStatement(sql);
		rs=st.executeQuery();
		while(rs.next()){
			BuscaAlumnoBean cat=new BuscaAlumnoBean(rs.getString(1),rs.getString(2),rs.getString(3));
		listaalumno.add(cat);
		System.out.println(rs.getString(1) + " " +rs.getString(2)+ " " +rs.getString(3));
		}
		cierraConexion();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return listaalumno;
	}
	
	
	public ArrayList<VerBean> VerAlumno(String codigo) {
		String sql="SELECT alumno.codigo_alumno,alumno.apellido_alumno, alumno.nombre_alumno,genero.genero,grado.grado,seccion.seccion,"
      +" alumno.nacimiento,alumno.edad,responsable.nombre, responsable.direccion,responsable.telefono,matricula.año"
 +" FROM (((((((colegio2013.grado grado"
             +" CROSS JOIN colegio2013.seccion seccion"
                +" ON (grado.idseccion = seccion.id_seccion))"
            +" INNER JOIN colegio2013.alumno alumno"
               +" ON (alumno.id_grado = grado.id_grado))"
           +" INNER JOIN colegio2013.responsable responsable"
             +"  ON (responsable.codigo_alumno = alumno.codigo_alumno))"
           +"INNER JOIN colegio2013.matricula matricula"
             +" ON     (matricula.codigo_alumno = alumno.codigo_alumno)"
             +"    AND (matricula.id_responsable = responsable.id_responsable))"
        +"  INNER JOIN colegio2013.info_extra info_extra"
          +"   ON     (matricula.id_info_extra = info_extra.id_info_extra)"
          +"      AND (info_extra.codigo_alumno = alumno.codigo_alumno))"
       +"  INNER JOIN colegio2013.turno turno"
          +"  ON (matricula.id_turno = turno.id_turno))"
       +" INNER JOIN colegio2013.zona zona ON (info_extra.zona = zona.idzona))"
       +"INNER JOIN colegio2013.genero genero"
        +"  ON (alumno.id_genero = genero.id_genero)"
        +" WHERE alumno.codigo_alumno = '"+codigo+"'";
		Connection cn=getConexion();
		PreparedStatement st=null;
		try {
		st=cn.prepareStatement(sql);
		rs=st.executeQuery();
		while(rs.next()){
			VerBean cat=new VerBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
					rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),
					rs.getString(10),rs.getString(11),rs.getString(12));
		veralumno.add(cat);
		System.out.println(rs.getString(1) + " " +rs.getString(2)+ " " +rs.getString(3));
		}
		cierraConexion();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return veralumno;
	}
}
