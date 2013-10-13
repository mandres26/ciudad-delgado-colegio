package sv.edu.udb.action;

import javax.servlet.http.*;

import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;

import sv.edu.udb.modelo.CarnetModelo;
public class DocenteAction extends DispatchAction{

	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			CarnetModelo cm = new CarnetModelo();
			cm.generar();
			return mapping.findForward("ingresado");
			
			}
	
}
