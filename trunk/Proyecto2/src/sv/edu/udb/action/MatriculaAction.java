package sv.edu.udb.action;
import java.util.ArrayList;

import javax.servlet.http.*;

import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;

import sv.edu.udb.form.Matriculasave1Form;
import sv.edu.udb.form.Matriculasave2Form;
import sv.edu.udb.form.Matriculasave3Form;
import sv.edu.udb.form.Matriculasave4Form;
import sv.edu.udb.javabeans.GradoBean;
import sv.edu.udb.modelo.LlenarCombosModelo;


public class MatriculaAction extends DispatchAction{
	public ActionForward llenar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
		LlenarCombosModelo llenar=new LlenarCombosModelo();
		ArrayList<GradoBean> listagrado=llenar.llenearComboGrado();
		request.setAttribute("grado", listagrado);		

		return mapping.findForward("matriculado");
	}
	public ActionForward matricular(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)	
			throws Exception {
		
			return mapping.findForward("matriculado");
			
			}  
	public ActionForward save1(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)	
			throws Exception {
		
		LlenarCombosModelo llenar=new LlenarCombosModelo();
		ArrayList<GradoBean> listagrado=llenar.llenearComboGrado();
		request.setAttribute("grado", listagrado);
		
		Matriculasave1Form matri=(Matriculasave1Form) form;
		HttpSession sesion=request.getSession();
		sesion.setAttribute("apellidos", matri.getApellidos());
		sesion.setAttribute("nombres", matri.getNombres());
		sesion.setAttribute("grado", matri.getGrado());
		sesion.setAttribute("turno", matri.getTurno());
		sesion.setAttribute("sexo", matri.getSexo());
		sesion.setAttribute("fechan", matri.getFnacimiento());
		sesion.setAttribute("edad", matri.getEdad()); //fin tabla alumno
		sesion.setAttribute("responsable", matri.getResponsable());
		sesion.setAttribute("duirespo", matri.getDuirespo());
		sesion.setAttribute("parentesco", matri.getparentesco());
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
		
		
		String ape=(String) sesion.getAttribute("apellidos");
		System.out.println("Session" +ape);
		
		
			return mapping.findForward("matriculado");
			
			}  
	public ActionForward save2(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)	
			throws Exception {
		Matriculasave2Form matri=(Matriculasave2Form) form;
		HttpSession sesion=request.getSession();
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
		
		String ape1=(String) sesion.getAttribute("nombrep");
		System.out.println("Session" +ape1);
			return mapping.findForward("matriculado");
			
			}  
	public ActionForward save3(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)	
			throws Exception {
		Matriculasave3Form matri=(Matriculasave3Form) form;
		HttpSession sesion=request.getSession();
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
		
		
			return mapping.findForward("matriculado");
			
			}  
	public ActionForward save4(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)	
			throws Exception {
		Matriculasave4Form matri=(Matriculasave4Form) form;
		HttpSession sesion=request.getSession();
		sesion.setAttribute("napartida", matri.getNpartida());
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
		
			return mapping.findForward("matriculado");
			
			}  

}
