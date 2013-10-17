package sv.edu.udb.action;

import java.util.ArrayList;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sv.edu.udb.form.VerForm;
import sv.edu.udb.javabeans.BuscaAlumnoBean;
import sv.edu.udb.modelo.LlenarCombosModelo;
import sv.edu.udb.modelo.MatriculaModelo;

public class BuscarAction extends DispatchAction {
	public ActionForward iniciar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
		LlenarCombosModelo lista=new LlenarCombosModelo();
		ArrayList<BuscaAlumnoBean>
		listaalumno=lista.llenearListaAlumno();
		request.setAttribute("listaalumno", listaalumno);
			return mapping.findForward("listaalumno");
			
			}
	public  ActionForward ver(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
		
		VerForm ve= (VerForm) form;
		LlenarCombosModelo ver=new LlenarCombosModelo();
		String codigo= ve.getCodigo();
		System.out.println("Ola k ase XD "+ ve.getCodigo());

		request.setAttribute("veralumno", ver.VerAlumno(codigo));
			return mapping.findForward("veralumno");
			
			}
	public  ActionForward eliminar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
		
		VerForm ve= (VerForm) form;
		MatriculaModelo ver=new MatriculaModelo();
		String codigo= ve.getCodigo();
		System.out.println("Ola k ase XD "+ ve.getCodigo());
		if(ver.eliminar(codigo)){
			
		}
		
			return mapping.findForward("eliminar");
			
			}
}
