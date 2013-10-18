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
			}else{
				msj="Error Interno.";
			}
			request.setAttribute("msj", msj);
			request.setAttribute("listaseccion", gm.listaseccion());
			request.setAttribute("listaciclo", gm.listaciclo());
			return mapping.findForward("ingresado");
			
			}
	
	public ActionForward actulizar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			GradoModelo gm = new GradoModelo();
			String id = request.getParameter("id");
			GradoForm gf =(GradoForm) form; 
			Integer num=gm.actulizar(gf,id);
			form.reset(mapping, request);
			String msj="";
			if(num==0){
				msj="Error, Al Actualizar datos";
			}else if(num==1){
				msj="Datos Actulizados correctamente";	
			}else{
				msj="Error Interno.";
			}
			request.setAttribute("msj", msj);
			request.setAttribute("listaseccion", gm.listaseccion());
			request.setAttribute("listaciclo", gm.listaciclo());
			System.out.println("action grado combos");
			HttpSession gradosesion = request.getSession(true);
			if(gradosesion.getAttribute("listacampos")!=null){
				gradosesion.removeAttribute("listacampos");
				System.out.println("sesion eliminada");
			}
			gf.setCiclo("Seleccione");
			gf.setSeccion("Seleccione");
			form = (ActionForm) gf;
			return mapping.findForward("display");
			
			}	
	
	public ActionForward eliminar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			GradoModelo gm = new GradoModelo();
			String id = request.getParameter("id");
			Integer num=gm.eliminar(id);
			String msj="";
			if(num==0){
				msj="Error, Al Eliminar datos";
			}else if(num==1){
				msj="Datos Eliminados correctamente";
			}else{
				msj="Error Interno.";
			}
			request.setAttribute("listaseccion", gm.listaseccion());
			request.setAttribute("listaciclo", gm.listaciclo());
			request.setAttribute("msj", msj);
			System.out.println("action grado combos");
			HttpSession gradosesion = request.getSession(true);
			if(gradosesion.getAttribute("listacampos")!=null){
				gradosesion.removeAttribute("listacampos");
				System.out.println("sesion eliminada");
			}
			return mapping.findForward("display");
			
			}
	
	public ActionForward mostrar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			GradoModelo gm = new GradoModelo();
			request.setAttribute("listdisplaytag", gm.listadisplaytag());
			request.setAttribute("listaseccion", gm.listaseccion());
			request.setAttribute("listaciclo", gm.listaciclo());
			System.out.println("action grado combos");
			return mapping.findForward("display");
			
			}
	
	public ActionForward campos(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			HttpSession gradosesion = request.getSession(true);
			GradoModelo gm = new GradoModelo();
			String id = request.getParameter("id");
			gradosesion.setAttribute("listacampos", gm.listacampos(id));
			request.setAttribute("listaseccion", gm.listaseccion());
			request.setAttribute("listaciclo", gm.listaciclo());
			System.out.println("action grado combos");
			return mapping.findForward("display");
			
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
			HttpSession gradosesion = request.getSession(true);
			if(gradosesion.getAttribute("listacampos")!=null){
				gradosesion.removeAttribute("listacampos");
				System.out.println("sesion eliminada");
			}
			return mapping.findForward("combo");
			
			}
}
