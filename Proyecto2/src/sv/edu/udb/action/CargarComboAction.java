package sv.edu.udb.action;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sv.edu.udb.form.GradoForm;
import sv.edu.udb.javabeans.GradoBean;
import sv.edu.udb.modelo.LlenarCombosModelo;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class CargarComboAction extends DispatchAction{
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

}
