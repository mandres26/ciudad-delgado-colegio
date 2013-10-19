package sv.edu.udb.action;

import java.util.ArrayList;
import javax.servlet.http.*;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import sv.edu.udb.form.LoginForm;
import sv.edu.udb.modelo.LoginModelo;

public class LoginAction extends DispatchAction {

	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LoginForm lf = (LoginForm) form;
		LoginModelo lm = new LoginModelo();
		ArrayList<String> datos = lm.login(lf);
		HttpSession sesion = request.getSession(true);
		sesion.setAttribute("usuario", datos.get(0));
		sesion.setAttribute("tipo", datos.get(2));
		
		System.out.println("usuario "+sesion.getAttribute("usuario"));
		System.out.println("tipo "+sesion.getAttribute("tipo"));
		return mapping.findForward("inicio");

	}
}
