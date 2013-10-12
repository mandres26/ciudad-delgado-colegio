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
		String turno=(String) sesion.getAttribute("turno");
		String edad=(String) sesion.getAttribute("edad");
		String direccion=(String) sesion.getAttribute("direccion");	
		String grado=(String) sesion.getAttribute("grado");	
		
		try {
			
			
			String query="insert into alumno values(?,?,?,?,?,?,?,?,?)";
			st=cn.prepareStatement(query);
			//st.setString(1, codigo);
			st.setString(2, nombres);
			st.setString(3, apellidos);
			st.setString(4, direccion);
			st.setString(5, edad);
			st.setString(6, fnacimiento);
			st.setString(7, turno);
			st.setString(8, sexo);
			st.setString(9, grado);
			st.executeUpdate(query);
            
			
            estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion();
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
		
		try {
			
			String query="insert into reponsable values(null,?,?,?,?,?,?)";
			st=cn.prepareStatement(query);
			st.setString(2, responsable);
			st.setString(3, duirespo);
			st.setString(3, parentesco);
			st.setString(4, telefonopare);
			st.setString(5, direccion);
			st.setString(6, codigo);
			
			st.executeUpdate(query);
            estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion();
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
		String bautizo=(String) sesion.getAttribute("bautizo");
		String comunion=(String) sesion.getAttribute("comunion");
		String confirma=(String) sesion.getAttribute("confrima");
		String nomemer=(String) sesion.getAttribute("nomemer");
		String telmer=(String) sesion.getAttribute("telmer");
		String codigo=(String) sesion.getAttribute("codigo");

		try {
			
			String query="insert into info_extra values(null,?,?,?,?,?,?,?,?,?,?,?)";
			st=cn.prepareStatement(query);
			st.setString(2, zona);
			st.setString(3, alumnot);
			st.setString(4, repite);
			st.setString(5, estudiopv);
			st.setString(6, religion);
			st.setString(7, bautizo);
			st.setString(8, comunion);
			st.setString(9, confirma);
			st.setString(10, nomemer);
			st.setString(11, telmer);
			st.setString(12, codigo);
            st.executeUpdate(query);
			
            estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion();
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
			
			String query="insert into pares_familia values(null,?,?,?,?,?,?,?)";
			st=cn.prepareStatement(query);
			st.setString(2, nombrep);
			st.setString(3, profesionp);
			st.setString(4, trabajop);
			st.setString(5, telp);
			st.setString(6, duip);
			st.setString(7, codigo);
			st.setString(8, sexp);
			
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion();
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
			
			String query="insert into pares_familia values(null,?,?,?,?,?,?,?)";
			st=cn.prepareStatement(query);
			st.setString(2, nombrem);
			st.setString(3, profesionm);
			st.setString(4, trabajom);
			st.setString(5, telm);
			st.setString(6, duim);
			st.setString(7, codigo);
			st.setString(8, sexm);
			
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion();
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
		String vc=(String) sesion.getAttribute("cv");
		String pesolb=(String) sesion.getAttribute("pesolb");
		String talla=(String) sesion.getAttribute("talla");
		String medif=(String) sesion.getAttribute("medif");
		String infoadd=(String) sesion.getAttribute("infoadd");
		String codigo=(String) sesion.getAttribute("codigo");
		
		
		try {
			
			String query="insert into especiales values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			st=cn.prepareStatement(query);
			st.setString(2, neurologo);
			st.setString(3, psicologo);
			st.setString(4, audio_lenguaje);
			st.setString(5, lenguaje);
			st.setString(6, terapia_educativa);
			st.setString(7, dificultad);
			st.setString(8, diful);
			st.setString(9, enfe);
			st.setString(10, alergias);
			st.setString(11, vc);
			st.setString(12, pesolb);
			st.setString(13, talla);
			st.setString(14, medif);
			st.setString(15, infoadd);
			st.setString(16, codigo);
			
		
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion();
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
			
			String query="insert into partida values(null,?,?,?,?,?)";
			st=cn.prepareStatement(query);
			st.setString(2, npartida);
			st.setString(3, nlibro);
			st.setString(4, nfolio);
			st.setString(5, ntomo);
			st.setString(6, codigo);
		
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion();
			}
		return estado;
		
	}//fin save7
	
	public boolean save8(HttpServletRequest request){
		boolean estado = true;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String codigo=(String) sesion.getAttribute("codigo");
		String h1=(String) sesion.getAttribute("h1");
		if(h1 != null){
			estado = false;
		try {
			
			String query="insert into hermanos(null,?,?)";
			st=cn.prepareStatement(query);
			st.setString(2, codigo);
			st.setString(3, h1);
			
		
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion();
			}
		}
		return estado;
		
	}//fin save8
	
	public boolean save9(HttpServletRequest request){
		boolean estado = true;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String codigo=(String) sesion.getAttribute("codigo");
		String h2=(String) sesion.getAttribute("h2");
		if(h2 != null){
			estado = false;
		try {
			
			String query="insert into hermanos(null,?,?)";
			st=cn.prepareStatement(query);
			st.setString(2, codigo);
			st.setString(3, h2);
			
		
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion();
			}
		}
		return estado;
		
	}//fin save9
	public boolean save10(HttpServletRequest request){
		boolean estado = true;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String codigo=(String) sesion.getAttribute("codigo");
		String h3=(String) sesion.getAttribute("h3");
		if(h3 != null){
			estado = false;
		try {
			
			String query="insert into hermanos(null,?,?)";
			st=cn.prepareStatement(query);
			st.setString(2, codigo);
			st.setString(3, h3);
			
		
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion();
			}
		}
		return estado;
		
	}//fin save10
	
	public boolean save11(HttpServletRequest request){
		boolean estado = true;
		Connection cn=getConexion();
		PreparedStatement st=null;
		HttpSession sesion=request.getSession();
		String codigo=(String) sesion.getAttribute("codigo");;
		String h4=(String) sesion.getAttribute("h4");
		if(h4 != null){
			estado = false;
		try {
			
			String query="insert into hermanos(null,?,?)";
			st=cn.prepareStatement(query);
			st.setString(2, codigo);
			st.setString(3, h4);
			
		
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion();
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
		
		try {
			
			String query="insert into doc_presentados(null,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			st=cn.prepareStatement(query);
			st.setString(2, ccondu);
			st.setString(3, cmedi);
			st.setString(4, cparti);
			st.setString(5, ccerti);
			st.setString(6, cdiplo);
			st.setString(7, clibretap);
			st.setString(8, clibretan);
			st.setString(9, cboleta);
			st.setString(10, ccarta);
			st.setString(11, checes);
			st.setString(12, csangre);
			st.setString(13, corina);
			st.setString(14, codigo);
			
		
            st.executeUpdate(query);
			
			estado= true;
		}catch(SQLException ex){
			System.out.println(ex);
		}finally{
			cierraConexion();
			}
		return estado;
		
	}//fin save12
}
