package sv.edu.udb.action;
import javax.servlet.http.*;
import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;
import sv.edu.udb.form.GradoForm;
import sv.edu.udb.modelo.GradoModelo;

public class GradoAction extends DispatchAction{
	
	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			GradoModelo gm = new GradoModelo();
			GradoForm gf =(GradoForm) form; 
			Integer num=gm.insertar(gf);
			String msj="";
			if(num==0){
				msj="Error, Al ingresar datos";
			}else if(num==1){
				msj="Datos ingresados correctamente";	
			}
			request.setAttribute("msj", msj);
			request.setAttribute("listaseccion", gm.listaseccion());
			request.setAttribute("listaciclo", gm.listaciclo());
			return mapping.findForward("ingresado");
			
			}
	
	public ActionForward combo(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			GradoModelo gm = new GradoModelo();
			request.setAttribute("listaseccion", gm.listaseccion());
			request.setAttribute("listaciclo", gm.listaciclo());
			System.out.println("action grado combos");
			return mapping.findForward("ingresado");
			
			}
}
