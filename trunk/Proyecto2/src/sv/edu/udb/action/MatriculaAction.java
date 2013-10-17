package sv.edu.udb.action;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.http.*;

import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;

import sv.edu.udb.form.MatriculaForm;
import sv.edu.udb.javabeans.GradoBean;
import sv.edu.udb.javabeans.ParentescoBean;
import sv.edu.udb.javabeans.SexoBean;
import sv.edu.udb.javabeans.TurnoBean;
import sv.edu.udb.modelo.CarnetModelo;
import sv.edu.udb.modelo.LlenarCombosModelo;
import sv.edu.udb.modelo.MatriculaModelo;


public class MatriculaAction extends DispatchAction{
	public ActionForward llenar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {			
		
		LlenarCombosModelo llenar=new LlenarCombosModelo();
		ArrayList<GradoBean> listagrado=llenar.llenearComboGrado();
		request.setAttribute("grado", listagrado);	
		
		ArrayList<TurnoBean> listaturno=llenar.llenearComboTurno();
		request.setAttribute("turno", listaturno);	
		
		ArrayList<SexoBean> listasexo=llenar.llenearComboSexo();
		request.setAttribute("sexo", listasexo);	
		
		ArrayList<ParentescoBean> listapare=llenar.llenearComboPare();
		request.setAttribute("parentesco", listapare);

		return mapping.findForward("matriculado");
	}
	public ActionForward matricula(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
		System.out.println("Ola k ase XD ");
		LlenarCombosModelo llenar=new LlenarCombosModelo();
		ArrayList<GradoBean> listagrado=llenar.llenearComboGrado();
		request.setAttribute("grado", listagrado);	
		
		ArrayList<TurnoBean> listaturno=llenar.llenearComboTurno();
		request.setAttribute("turno", listaturno);	
		
		ArrayList<SexoBean> listasexo=llenar.llenearComboSexo();
		request.setAttribute("sexo", listasexo);
			
		ArrayList<ParentescoBean> listapare=llenar.llenearComboPare();
		request.setAttribute("parentesco", listapare);
		
		MatriculaForm matri=(MatriculaForm) form;
		HttpSession sesion=request.getSession();
		CarnetModelo cm = new CarnetModelo();
		sesion.setAttribute("codigo", cm.generar());
		sesion.setAttribute("usuario", "moy");
		sesion.setAttribute("observaciones", "nada");
		sesion.setAttribute("apellidos", matri.getApellidos());
		sesion.setAttribute("nombres", matri.getNombres());
		sesion.setAttribute("grado", matri.getGrado());
		sesion.setAttribute("turno", matri.getTurno());
		sesion.setAttribute("sexo", matri.getSexo());
		sesion.setAttribute("fnacimiento", matri.getFnacimiento());
		sesion.setAttribute("edad", matri.getEdad()); //fin tabla alumno
		sesion.setAttribute("responsable", matri.getResponsable());
		sesion.setAttribute("duirespo", matri.getDuirespo());
		sesion.setAttribute("parentesco", matri.getParentesco());
		sesion.setAttribute("telefonopare", matri.getTelefono());
		sesion.setAttribute("direccion", matri.getDireccion());//fin tabla responsable
		sesion.setAttribute("zona", matri.getZona());
		sesion.setAttribute("repite", matri.getRepite());
		sesion.setAttribute("alumnot", matri.getAlumnot());
		sesion.setAttribute("estudiopv", matri.getEstutiopv());
		sesion.setAttribute("religion", matri.getReligion());
		sesion.setAttribute("bautizmo", matri.getBautizmo());
		sesion.setAttribute("comunion", matri.getComunion());
		sesion.setAttribute("confirma", matri.getConfirma());
		sesion.setAttribute("nomemer", matri.getNomemer());
		sesion.setAttribute("telmer", matri.getTelmer());//fin tabla info_extra

		sesion.setAttribute("nombrep", matri.getNombrep());
		sesion.setAttribute("duip", matri.getDuip());
		sesion.setAttribute("profesionp", matri.getProfesionp());
		sesion.setAttribute("trabajop", matri.getLtrabajop());
		sesion.setAttribute("telp", matri.getTelp());
		sesion.setAttribute("sexp", matri.getSexp());
		sesion.setAttribute("nombrem", matri.getNombrem());
		sesion.setAttribute("duim", matri.getDuim());
		sesion.setAttribute("profesionm", matri.getProfesionm());
		sesion.setAttribute("trabajom", matri.getLtrabajom());
		sesion.setAttribute("telm", matri.getTelm());		
		sesion.setAttribute("sexm", matri.getSexm());

		sesion.setAttribute("neurologo", matri.getNeu());
		sesion.setAttribute("psicologo", matri.getPsi());
		sesion.setAttribute("audio_lenguaje", matri.getAulg());
		sesion.setAttribute("lenguaje", matri.getLenguaje());
		sesion.setAttribute("terapia_educativa", matri.getTedu());
		sesion.setAttribute("dificultad", matri.getDificultad());
		sesion.setAttribute("diful", matri.getDiful());
		sesion.setAttribute("enfe", matri.getEnfe());
		sesion.setAttribute("alergias", matri.getAlergias());
		sesion.setAttribute("vc", matri.getVc());
		sesion.setAttribute("pesolb", matri.getPesolb());
		sesion.setAttribute("talla", matri.getTalla());
		sesion.setAttribute("medif", matri.getMedif());
		sesion.setAttribute("infoadd", matri.getInfoad());

		sesion.setAttribute("npartida", matri.getNpartida());
		sesion.setAttribute("nlibro", matri.getNlibro());
		sesion.setAttribute("nfolio", matri.getNfolio());
		sesion.setAttribute("ntomo", matri.getNtomo());
		sesion.setAttribute("buscar", matri.getBuscar());
		sesion.setAttribute("h1", matri.getH1());
		sesion.setAttribute("h2", matri.getH2());
		sesion.setAttribute("h3", matri.getH3());
		sesion.setAttribute("h4", matri.getH4());
		sesion.setAttribute("ccondu", matri.getCcondu());
		sesion.setAttribute("cmedi", matri.getCmedi());
		sesion.setAttribute("cparti", matri.getCparti());
		sesion.setAttribute("ccerti", matri.getCcerti());
		sesion.setAttribute("cdiplo", matri.getCdiplo());
		sesion.setAttribute("clibretap", matri.getClibretap());
		sesion.setAttribute("clibretan", matri.getClibretan());
		sesion.setAttribute("cboleta", matri.getCboleta());
		sesion.setAttribute("ccarta", matri.getCcarta());
		sesion.setAttribute("checes", matri.getCheces());
		sesion.setAttribute("csangre", matri.getCsangre());
		sesion.setAttribute("corina", matri.getCorina());
		
		
		MatriculaModelo mati=new MatriculaModelo();
		if(mati.save1(request)){
					
		}if(mati.save2(request)){
			
		}if(mati.save3(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.save4(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.save5(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.save6(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.save7(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.save8(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.save9(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.save10(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.save11(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.save12(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.fecha(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.idresponsble(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.idinfoextra(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.idpadres(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.idespeciales(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.idpartida(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.idhermanos(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.iddoc(request)){
			request.setAttribute("mensaje", "Exito");
			
		}if(mati.matriculas(request)){
			request.setAttribute("mensaje", "Exito");
			
		}
		if(mati.cerrar(request)){
			request.setAttribute("mensaje", "Exito");
			return mapping.findForward("matriculado");
		}
		else{
			request.setAttribute("mensaje", "Fracaso");
			return mapping.findForward("matriculado");
			}	
		
		
			
			}  

}
