package sv.edu.udb.action;
import javax.servlet.http.*;

import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;
import sv.edu.udb.form.SeccionForm;
import sv.edu.udb.modelo.SeccionModelo;
import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;

public class SeccionAction extends DispatchAction{
	
	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			SeccionModelo sm = new SeccionModelo();
			SeccionForm sf =(SeccionForm) form; 
			Integer num=sm.insertar(sf);
			String msj="";
			if(num==0){
				msj="Error, Al ingresar datos";
			}else if(num==1){
				msj="Datos ingresados correctamente";	
			}
			request.setAttribute("msj", msj);
			
			return mapping.findForward("ingresado");
			
			}

}
