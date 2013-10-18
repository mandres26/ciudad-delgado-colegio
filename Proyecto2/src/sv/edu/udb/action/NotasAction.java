package sv.edu.udb.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sv.edu.udb.form.SeccionForm;
import sv.edu.udb.javabeans.GradoBean;
import sv.edu.udb.javabeans.ParentescoBean;
import sv.edu.udb.javabeans.SexoBean;
import sv.edu.udb.javabeans.TurnoBean;
import sv.edu.udb.modelo.GradoModelo;
import sv.edu.udb.modelo.LlenarCombosModelo;

public class NotasAction extends DispatchAction{
	public ActionForward llenar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
		
		LlenarCombosModelo llenar=new LlenarCombosModelo();
		ArrayList<GradoBean> listagrado=llenar.llenearComboGrado();
		request.setAttribute("grado", listagrado);	
		
		GradoModelo gm = new GradoModelo();
		request.setAttribute("listaseccion", gm.listaseccion());

		return mapping.findForward("notas");
	}

}
