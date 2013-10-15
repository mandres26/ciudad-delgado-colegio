package sv.edu.udb.modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.*;

import com.mysql.jdbc.Statement;

public class MatriculaModelo extends Coneccion {
	
    private ResultSet rs = null;
    
	//extende desde coneccion para usar sus atributos 
	public MatriculaModelo() {
		super();
	}
	
	
	
	public boolean save1(HttpServletRequest request){
		boolean estado = false;
		Connection cn=getConexion();
		PreparedStatement st=null;
		
		HttpSession sesion=request.getSession();
		String codigo=(String) sesion.getAttribute("codigo");
		String apellidos=(String) sesion.getAttribute("apellidos");
		String nombres=(String) sesion.getAttribute("nombres");
		String sexo=(String) sesion.getAttribute("sexo");
		String fnacimiento=(String) sesion.getAttribute("fnacimiento");
		String edad=(String) sesion.getAttribute("edad");
		String direccion=(String) sesion.getAttribute("direccion");	
		String grado=(String) sesion.getAttribute("grado");	
		System.out.println("Ola k ase save1 apellido "+apellidos);
		System.out.println("Ola k ase save1 nombre"+nombres);
		System.out.println("Ola k ase save1 direccion"+direccion);
		System.out.println("Ola k ase save1 edad"+edad);
		System.out.println("Ola k ase save1 fecha"+fnacimiento);
		System.out.println("Ola k ase save1 sexo"+sexo);
		System.out.println("Ola k ase save1 grado"+grado);
		try {
			
			String query;
			query ="insert into alumno(codigo_alumno,nombre_alumno,apellido_alumno,direccion,edad,nacimiento,id_genero,id_grado) values('";
			st=cn.prepareStatement(query);
			query+=sesion.getAttribute("codigo")+"','"+
					sesion.getAttribute("nombres")+"','"+
					sesion.getAttribute("apellidos")+"','"+
					sesion.getAttribute("direccion")+"','"+
					sesion.getAttribute("edad")+"','"+
					sesion.getAttribute("fnacimiento")+"','"+
					sesion.getAttribute("sexo")+"','"+
					sesion.getAttribute("grado")+"')";
					st.executeUpdate(query);
            
			
            estado= true;
		}catch(SQLException ex){
			System.out.println("save1"+ex);
		}finally{
			
			}
		return estado;
		
	}//fin save1
	
	public boolean save2(HttpServletRequest request){
		boolean estado = false;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String responsable=(String) sesion.getAttribute("responsable");
		String duirespo=(String) sesion.getAttribute("duirespo");
		String parentesco=(String) sesion.getAttribute("parentesco");
		String telefonopare=(String) sesion.getAttribute("telefonopare");
		String direccion=(String) sesion.getAttribute("direccion");
		String codigo=(String) sesion.getAttribute("codigo");
		System.out.println("Ola k ase save2 nombre "+responsable);
		System.out.println("Ola k ase save2 dui"+duirespo);
		System.out.println("Ola k ase save2 parentesc"+parentesco);
		System.out.println("Ola k ase save2 telefono"+telefonopare);
		System.out.println("Ola k ase save2 direccon"+direccion);
		System.out.println("Ola k ase save2 codigo"+codigo);
		try {
			
			String query;
			query="insert into responsable(nombre,dui,parentesco,telefono,direccion,codigo_alumno) values('";
			st=cn.prepareStatement(query);
			query+= sesion.getAttribute("responsable")+"','"+
					sesion.getAttribute("duirespo")+"','"+
					sesion.getAttribute("parentesco")+"','"+
					sesion.getAttribute("telefonopare")+"','"+
					sesion.getAttribute("direccion")+"','"+
					sesion.getAttribute("codigo")+"')";
			
			st.executeUpdate(query);
            estado= true;
		}catch(SQLException ex){
			System.out.println("save2"+ex);
		}finally{
			
			}
		return estado;
		
	}//fin save2
	
	public boolean save3(HttpServletRequest request){
		boolean estado = false;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String zona=(String) sesion.getAttribute("zona");
		String repite=(String) sesion.getAttribute("repite");
		String alumnot=(String) sesion.getAttribute("alumnot");
		String estudiopv=(String) sesion.getAttribute("estudiopv");
		String religion=(String) sesion.getAttribute("religion");
		String bautizo=(String) sesion.getAttribute("bautizmo");
		String comunion=(String) sesion.getAttribute("comunion");
		String confirma=(String) sesion.getAttribute("confirma");
		String nomemer=(String) sesion.getAttribute("nomemer");
		String telmer=(String) sesion.getAttribute("telmer");
		String codigo=(String) sesion.getAttribute("codigo");
		
		System.out.println("Ola k ase save2 zona "+zona);
		System.out.println("Ola k ase save2 repite"+repite);
		System.out.println("Ola k ase save2 alumnot"+alumnot);
		System.out.println("Ola k ase save2 estudiopv"+estudiopv);
		System.out.println("Ola k ase save2 religion"+religion);
		System.out.println("Ola k ase save2 bautizmo"+bautizo);
		System.out.println("Ola k ase save2 comunion"+comunion);
		System.out.println("Ola k ase save2 confirma"+confirma);
		System.out.println("Ola k ase save2 nomemer"+nomemer);
		System.out.println("Ola k ase save2 telmer"+telmer);
		System.out.println("Ola k ase save2 codigo"+codigo);
		
		
		
		
		String bauti="2";
		String comu="2";
		String confi="2";
		if(sesion.getAttribute("bautizmo")!= null){
			 bauti="1";
		
		}if(sesion.getAttribute("comunion")!= null){
			comu="1";
		
		}if(sesion.getAttribute("confirma")!= null){
			confi="1";
		}
		
		
		
		try {
			String query;
			query="insert into info_extra(zona,alumno_trabaja,repite_grado,estudio_parvularia,religion,bautizo,comunion,confirma,"
					+ "persona_emergencia,telefono,codigo_alumno) values('";
			st=cn.prepareStatement(query);
			query+= sesion.getAttribute("zona")+"','"+
					sesion.getAttribute("alumnot")+"','"+
					sesion.getAttribute("repite")+"','"+
					sesion.getAttribute("estudiopv")+"','"+
					sesion.getAttribute("religion")+"','"+
					bauti+"','"+
					comu+"','"+
					confi+"','"+
					sesion.getAttribute("nomemer")+"','"+
					sesion.getAttribute("telmer")+"','"+
					sesion.getAttribute("codigo")+"')";
           			st.executeUpdate(query);
			
            estado= true;
		}catch(SQLException ex){
			System.out.println("save3"+ex);
		}finally{
			
			}
		return estado;
		
	}//fin save3
	
	public boolean save4(HttpServletRequest request){
		boolean estado = false;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String nombrep=(String) sesion.getAttribute("nombrep");
		String duip=(String) sesion.getAttribute("duip");
		String profesionp=(String) sesion.getAttribute("profesionp");
		String trabajop=(String) sesion.getAttribute("trabajop");
		String telp=(String) sesion.getAttribute("telp");
		String sexp=(String) sesion.getAttribute("sexp");
		String codigo=(String) sesion.getAttribute("codigo");
		try {
			
			String query;
			query="insert into padres_familia(nombre,profesion,lugar_trabajo,telefono,dui,codigo_alumno,sexo) values('";
			st=cn.prepareStatement(query);
			query+= sesion.getAttribute("nombrep")+"','"+
					sesion.getAttribute("profesionp")+"','"+
					sesion.getAttribute("trabajop")+"','"+
					sesion.getAttribute("telp")+"','"+
					sesion.getAttribute("duip")+"','"+
					sesion.getAttribute("codigo")+"','"+
					sesion.getAttribute("sexp")+"')";
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println("save4"+ex);
		}finally{
			
			}
		return estado;
		
	}//fin save4
	
	public boolean save5(HttpServletRequest request){
		boolean estado = false;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String nombrem=(String) sesion.getAttribute("nombrem");
		String duim=(String) sesion.getAttribute("duim");
		String profesionm=(String) sesion.getAttribute("profesionm");
		String trabajom=(String) sesion.getAttribute("trabajom");
		String telm=(String) sesion.getAttribute("telm");
		String sexm=(String) sesion.getAttribute("sexm");
		String codigo=(String) sesion.getAttribute("codigo");
		try {
			String query;
			query="insert into padres_familia(nombre,profesion,lugar_trabajo,telefono,dui,codigo_alumno,sexo) values('";
			st=cn.prepareStatement(query);
			query+= sesion.getAttribute("nombrem")+"','"+
					sesion.getAttribute("profesionm")+"','"+
					sesion.getAttribute("trabajom")+"','"+
					sesion.getAttribute("telm")+"','"+
					sesion.getAttribute("duim")+"','"+
					sesion.getAttribute("codigo")+"','"+
					sesion.getAttribute("sexm")+"')";
			
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println("save5"+ex);
		}finally{
			
			}
		return estado;
		
	}//fin save5
	
	public boolean save6(HttpServletRequest request){
		boolean estado = false;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String neurologo=(String) sesion.getAttribute("neurologo");
		String psicologo=(String) sesion.getAttribute("psicologo");
		String audio_lenguaje=(String) sesion.getAttribute("audio_lenguaje");
		String lenguaje=(String) sesion.getAttribute("lenguaje");
		String terapia_educativa=(String) sesion.getAttribute("terapia_educativa");
		String dificultad=(String) sesion.getAttribute("dificultad");
		String diful=(String) sesion.getAttribute("diful");
		String enfe=(String) sesion.getAttribute("enfe");
		String alergias=(String) sesion.getAttribute("alergias");
		String vc=(String) sesion.getAttribute("vc");
		String pesolb=(String) sesion.getAttribute("pesolb");
		String talla=(String) sesion.getAttribute("talla");
		String medif=(String) sesion.getAttribute("medif");
		String infoadd=(String) sesion.getAttribute("infoadd");
		String codigo=(String) sesion.getAttribute("codigo");
		System.out.println("Vacuna"+vc);
		
		String neu="2";
		String psi="2";
		String audi="2";
		String leng="2";
		String tera="2";
		String difi="2";
		if(sesion.getAttribute("neurologo")!= null){
			neu="1";
		}if(sesion.getAttribute("psicologo") != null){
			psi="1";
		}if(sesion.getAttribute("audio_lenguaje") != null){
			audi="1";
		}if(sesion.getAttribute("lenguaje") != null){
			leng="1";
		}if(sesion.getAttribute("terapia_educativa") != null){
			tera="1";
		}if(sesion.getAttribute("dificultad") != null){
			difi="1";
		}
		
		
		
		
		try {
			
			String query;
			query="insert into especiales(neurologo,psicologico,audicion_lengueje,terapia_lenguaje,"
					+ "terapia_auditiva,dificultad_motora,discapacidad,enfermedad_cronica,alergias,"
					+ "vacunacion,peso,talla,medicamento,info_adicional,codigo) values('";
			st=cn.prepareStatement(query);
			query+= neu+"','"+
					psi+"','"+
					audi+"','"+
					leng+"','"+
					tera+"','"+
					difi+"','"+
					sesion.getAttribute("diful")+"','"+
					sesion.getAttribute("enfe")+"','"+
					sesion.getAttribute("alergias")+"','"+
					sesion.getAttribute("vc")+"','"+
					sesion.getAttribute("pesolb")+"','"+
					sesion.getAttribute("talla")+"','"+
					sesion.getAttribute("medif")+"','"+
					sesion.getAttribute("infoadd")+"','"+
					sesion.getAttribute("codigo")+"')";	
            		st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println("save6"+ex);
		}finally{
			
			}
		return estado;
		
	}//fin save6
	
	public boolean save7(HttpServletRequest request){
		boolean estado = false;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String npartida=(String) sesion.getAttribute("npartida");
		String nlibro=(String) sesion.getAttribute("nlibro");
		String nfolio=(String) sesion.getAttribute("nfolio");
		String ntomo=(String) sesion.getAttribute("ntomo");
		String codigo=(String) sesion.getAttribute("codigo");
		try {
			
			String query;
			query="insert into partida(numero_partida,numero_libro,numero_folio,tomo,codigo_alumno) values('";
			st=cn.prepareStatement(query);
			query+= sesion.getAttribute("npartida")+"','"+
					sesion.getAttribute("nlibro")+"','"+
					sesion.getAttribute("nfolio")+"','"+
					sesion.getAttribute("ntomo")+"','"+
					sesion.getAttribute("codigo")+"')";
            		st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println("save7"+ex);
		}finally{
			
			}
		return estado;
		
	}//fin save7
	
	public boolean save8(HttpServletRequest request){
		boolean estado = false;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String codigo=(String) sesion.getAttribute("codigo");
		String h1=(String) sesion.getAttribute("h1");
		System.out.println("h1"+sesion.getAttribute("h1"));
		if(sesion.getAttribute("h1") != " "){
			
		try {
			
			String query;
			query="insert into hermanos(codigo_alumno,codigo_hermano) values('";
			st=cn.prepareStatement(query);
			st=cn.prepareStatement(query);
			query+= sesion.getAttribute("codigo")+"','"+
					sesion.getAttribute("h1")+"')";	
            		st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println("save8"+ex);
		}finally{
			
			}
		}
		return estado;
		
	}//fin save8
	
	public boolean save9(HttpServletRequest request){
		boolean estado = false;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String codigo=(String) sesion.getAttribute("codigo");
		String h2=(String) sesion.getAttribute("h2");
		System.out.println("h2"+sesion.getAttribute("h2"));
		if(sesion.getAttribute("h2") != " "){
			
		try {
			String query;
			query="insert into hermanos(codigo_alumno,codigo_hermano) values('";
			st=cn.prepareStatement(query);
			st=cn.prepareStatement(query);
			query+= sesion.getAttribute("codigo")+"','"+
					sesion.getAttribute("h2")+"')";	
            		st.executeUpdate(query);
			
		
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println("save9"+ex);
		}finally{
			
			}
		}
		return estado;
		
	}//fin save9
	public boolean save10(HttpServletRequest request){
		boolean estado = false;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String codigo=(String) sesion.getAttribute("codigo");
		String h3=(String) sesion.getAttribute("h3");
		System.out.println("h3"+sesion.getAttribute("h3"));
		if(sesion.getAttribute("h3") != " "){
		try {
			String query;
			query="insert into hermanos(codigo_alumno,codigo_hermano) values('";
			st=cn.prepareStatement(query);
			st=cn.prepareStatement(query);
			query+= sesion.getAttribute("codigo")+"','"+
					sesion.getAttribute("h3")+"')";	
            		st.executeUpdate(query);
			
		
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println("save10"+ex);
		}finally{
			
			}
		}
		return estado;
		
	}//fin save10
	
	public boolean save11(HttpServletRequest request){
		boolean estado = false;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String codigo=(String) sesion.getAttribute("codigo");;
		String h4=(String) sesion.getAttribute("h4");
		System.out.println("h4"+sesion.getAttribute("h4"));
		if(sesion.getAttribute("h4") != " "){
		try {
			String query;
			query="insert into hermanos(codigo_alumno,codigo_hermano) values('";
			st=cn.prepareStatement(query);
			query+= sesion.getAttribute("codigo")+"','"+
					sesion.getAttribute("h4")+"')";	
            		st.executeUpdate(query);
			
		
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println("save11"+ex);
		}finally{
			
			}
		}
		return estado;
		
	}//fin save11
	
	public boolean save12(HttpServletRequest request){
		boolean estado = false;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String ccondu=(String) sesion.getAttribute("ccondu");
		String cmedi=(String) sesion.getAttribute("cmedi");
		String cparti=(String) sesion.getAttribute("cparti");
		String ccerti=(String) sesion.getAttribute("ccerti");
		String cdiplo=(String) sesion.getAttribute("cdiplo");
		String clibretap=(String) sesion.getAttribute("clibretap");
		String clibretan=(String) sesion.getAttribute("clibretan");
		String cboleta=(String) sesion.getAttribute("cboleta");
		String ccarta=(String) sesion.getAttribute("ccarta");
		String checes=(String) sesion.getAttribute("checes");
		String csangre=(String) sesion.getAttribute("csangre");
		String corina=(String) sesion.getAttribute("corina");
		String codigo=(String) sesion.getAttribute("codigo");
		String condu="2";
		String medi="2";
		String parti="2";
		String certi="2";
		String diplo="2";
		String libretap="2";
		String libretan="2";
		String boleta="2";
		String carta="2";
		String heces="2";
		String sangre="2";
		String orina="2";
			if(sesion.getAttribute("ccondu") != null){
				condu="1";
			}if(sesion.getAttribute("cmedi") != null){
				medi="1";
			}if(sesion.getAttribute("cparti") != null){
				parti="1";
			}if(sesion.getAttribute("ccerti") != null){
				certi="1";
			}if(sesion.getAttribute("cdiplo") != null){
				diplo="1";
			}if(sesion.getAttribute("clibretap") != null){
				libretap="1";
			}if(sesion.getAttribute("clibretan") != null){
				libretan="1";
			}if(sesion.getAttribute("cboleta") != null){
				boleta="1";
			}if(sesion.getAttribute("ccarta") != null){
				carta="1";
			}if(sesion.getAttribute("csangre") != null){
				sangre="1";
			}if(sesion.getAttribute("checes") != null){
				heces="1";
			}if(sesion.getAttribute("corina") != null){
				orina="1";
			}
		
		try {
			
			String query;
			query="insert into doc_presentado(constacia_conducta,constancia_medico_psicologico,copia_partida,"
					+ "certificado_anterior,copia_diploma_parvularia,libreta_padres,libreta_notas,boleta_pago,"
					+ "carta_compromiso,examen_heces,examen_sangre,examen_orina,codigo_alumno) values('";
			st=cn.prepareStatement(query);
			query+= condu+"','"+
					medi+"','"+
					parti+"','"+
					certi+"','"+
					diplo+"','"+
					libretap+"','"+
					libretan+"','"+
					boleta+"','"+
					carta+"','"+
					heces+"','"+
					sangre+"','"+
					orina+"','"+
					sesion.getAttribute("codigo")+"')";
		
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println("save12"+ex);
		}finally{
			cierraConexion();
			}
		return estado;
		
	}//fin save12
	
	
	
	public boolean cerrar(HttpServletRequest request){
		boolean estado=true;
		HttpSession sesion=request.getSession();
		
		sesion.invalidate();
		return estado;
	}
	
}
