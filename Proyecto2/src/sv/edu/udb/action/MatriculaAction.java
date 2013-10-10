package sv.edu.udb.action;
import javax.servlet.http.*;

import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;

import sv.edu.udb.form.Matriculasave1Form;
import sv.edu.udb.form.Matriculasave2Form;
import sv.edu.udb.form.Matriculasave3Form;


public class MatriculaAction extends DispatchAction{

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
		Matriculasave1Form matri=(Matriculasave1Form) form;
		HttpSession sesion=request.getSession();
		sesion.setAttribute("apellidos", matri.getApellidos());
		sesion.setAttribute("nombres", matri.getNombres());
		sesion.setAttribute("grado", matri.getGrado());
		sesion.setAttribute("turno", matri.getTurno());
		sesion.setAttribute("sexo", matri.getSexo());
		sesion.setAttribute("fechan", matri.getFnacimiento());
		sesion.setAttribute("edad", matri.getEdad());
		sesion.setAttribute("responsable", matri.getResponsable());
		sesion.setAttribute("parentesco", matri.getparentesco());
		sesion.setAttribute("telefonopare", matri.getTelefono());
		sesion.setAttribute("zona", matri.getZona());
		sesion.setAttribute("repite", matri.getRepite());
		sesion.setAttribute("alumnot", matri.getAlumnot());
		sesion.setAttribute("estudiopv", matri.getEstutiopv());
		sesion.setAttribute("religion", matri.getReligion());
		sesion.setAttribute("bautizmo", matri.getBautizmo());
		sesion.setAttribute("comunion", matri.getComunion());
		sesion.setAttribute("confirma", matri.getConfirma());
		sesion.setAttribute("nomemer", matri.getNomemer());
		sesion.setAttribute("telmer", matri.getTelmer());
		
		
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
		sesion.setAttribute("nombrem", matri.getNombrem());
		sesion.setAttribute("duim", matri.getDuim());
		sesion.setAttribute("profesionm", matri.getProfesionm());
		sesion.setAttribute("trabajom", matri.getLtrabajom());
		sesion.setAttribute("telm", matri.getTelm());		
		
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
		
			return mapping.findForward("matriculado");
			
			}  
	public ActionForward save4(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)	
			throws Exception {
		
			return mapping.findForward("matriculado");
			
			}  

}
