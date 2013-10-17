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
			}else{
				msj="Error Interno.";
			}
			request.setAttribute("msj", msj);
			
			return mapping.findForward("ingresado");
			
			}
	public ActionForward actualizar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			SeccionModelo sm = new SeccionModelo();
			SeccionForm sf =(SeccionForm) form; 
			String id = request.getParameter("id");
			System.out.println(id);
			Integer num=sm.actualizar(sf, id);
			String msj="";
			if(num==0){
				msj="Error, Al Actualizar datos";
			}else if(num==1){
				msj="Datos Actulizados correctamente";	
			}else{
				msj="Error Interno.";
			}
			request.setAttribute("msj", msj);
			return mapping.findForward("ingresado");
			
			}
	
	public ActionForward eliminar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			SeccionModelo sm = new SeccionModelo();
			String id = request.getParameter("id");
			Integer num=sm.eliminar(id);
			String msj="";
			if(num==0){
				msj="Error, Al Eliminar datos";
			}else if(num==1){
				msj="Datos Eliminados correctamente";	
			}else{
				msj="Error Interno.";
			}
			request.setAttribute("msj", msj);
			return mapping.findForward("display");
			
			}

	public ActionForward mostrar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			SeccionModelo sm = new SeccionModelo();
			request.setAttribute("listdisplaytag", sm.listadisplaytag());
			
			return mapping.findForward("display");
			
			}
	
	public ActionForward campos(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			HttpSession sessionseccion = request.getSession(true);
			SeccionModelo sm = new SeccionModelo();
			String id = request.getParameter("id");
			sessionseccion.setAttribute("listacampos2", sm.listacampos(id));
			return mapping.findForward("display");
			
			}
}
