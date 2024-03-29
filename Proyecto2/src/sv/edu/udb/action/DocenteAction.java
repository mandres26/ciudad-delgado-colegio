package sv.edu.udb.action;

import javax.servlet.http.*;

import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;

import sv.edu.udb.form.DocenteForm;
import sv.edu.udb.modelo.DocenteModelo;
public class DocenteAction extends DispatchAction{

	public ActionForward agregar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DocenteModelo dm = new DocenteModelo();
		DocenteForm df = (DocenteForm) form;
		Integer num=dm.insertar(df);
		String msj="";
		if(num==0){
			msj="Error, Al ingresar datos";
		}else if(num==1){
			msj="Datos ingresados correctamente";
		}else{
			msj="Error Interno.";
		}
		
		form = (ActionForm) df;
		request.setAttribute("listagenero", dm.listaGenero());
		request.setAttribute("msj", msj);
		return mapping.findForward("ingresado");

	}
	public ActionForward actulizar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DocenteModelo dm = new DocenteModelo();
		String codigo = request.getParameter("codigo");
		DocenteForm df = (DocenteForm) form;
		Integer num=dm.actulizar(df, codigo);
		String msj="";
		if(num==0){
			msj="Error, Al Actualizar Datos";
		}else if(num==1){
			msj="Datos Actualizados Correctamente";
		}else{
			msj="Error Interno.";
		}
		df.setNombre("");
		df.setApellido("");
		df.setDireccion("");
		df.setTelefono("");
		df.setCorreo("");
		df.setGenero("Seleccione");
	form = (ActionForm) df;
		request.setAttribute("listagenero", dm.listaGenero());
		request.setAttribute("msj", msj);
		HttpSession docentesesion = request.getSession(true);
		if(docentesesion.getAttribute("listacampos3")!=null){
			docentesesion.removeAttribute("listacampos3");
			System.out.println("sesion eliminada");
		}
		System.out.println("llego action Actulizar");
		return mapping.findForward("ingresado");

	}
	
	
	public ActionForward eliminar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DocenteModelo dm = new DocenteModelo();
		String codigo = request.getParameter("codigo");
		Integer num=dm.eliminar(codigo);
		String msj="";
		if(num==0){
			msj="Error, Al Eliminar Datos";
		}else if(num==1){
			msj="Datos Eliminados Correctamente";
		}else{
			msj="Error Interno.";
		}
		request.setAttribute("listagenero", dm.listaGenero());
		request.setAttribute("msj", msj);
		HttpSession docenteseccion = request.getSession(true);
		if(docenteseccion.getAttribute("listacampos3")!=null){
			docenteseccion.removeAttribute("listacampos3");
			System.out.println("sesion eliminada");
		}else{
			System.out.println("no existe la sesion");
		}
		System.out.println("llego action eliminar");
		return mapping.findForward("ingresado");

	}
	
	public ActionForward campos(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DocenteModelo dm = new DocenteModelo();
		HttpSession docenteseccion = request.getSession(true);
		String codigo = request.getParameter("codigo");
		docenteseccion.setAttribute("listacampos3", dm.listacampos(codigo));
		request.setAttribute("listagenero", dm.listaGenero());
		System.out.println("llego action listacampos");
		return mapping.findForward("ingresado");

	}

	
	public ActionForward mostrar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DocenteModelo dm = new DocenteModelo();
		request.setAttribute("listadisplaytag", dm.listadisplaytag());
		request.setAttribute("listagenero", dm.listaGenero());
		System.out.println("llego action listadisplaytag");
		return mapping.findForward("ingresado");

	}
	
	
	public ActionForward combo(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DocenteModelo dm = new DocenteModelo();
		request.setAttribute("listagenero", dm.listaGenero());
		HttpSession docentesesion = request.getSession(true);
		if(docentesesion.getAttribute("listacampos3")!=null){
			docentesesion.removeAttribute("listacampos3");
			System.out.println("sesion eliminada");
		}else{
			System.out.println("no existe la sesion");
		}
		
		return mapping.findForward("ingresado");

	}
	
}
