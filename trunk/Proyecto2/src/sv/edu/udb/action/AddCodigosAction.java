package sv.edu.udb.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sv.edu.udb.form.AddCodigosForm;
import sv.edu.udb.form.DocenteForm;
import sv.edu.udb.javabeans.CodigosBean;
import sv.edu.udb.modelo.AddCodigoModelo;
import sv.edu.udb.modelo.DocenteModelo;
import sv.edu.udb.modelo.LlenarCombosModelo;

public class AddCodigosAction extends DispatchAction{
	public ActionForward llenar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
		
		LlenarCombosModelo llenar=new LlenarCombosModelo();
//		ArrayList<CodigosBean> listacodigo = llenar.llenearComboCodigo();
		request.setAttribute("tipo", llenar.llenearComboCodigo());	

		return mapping.findForward("cod");
	}
	
	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
		
		AddCodigoModelo cm = new AddCodigoModelo();
		AddCodigosForm cf = (AddCodigosForm) form;
		Integer num= cm.insertar(cf);
		String msj="";
		if(num==0){
			msj="Error, Al ingresar datos";
		}else if(num==1){
			msj="Datos ingresados correctamente";
		}else{
			msj="Error Interno.";
		}
	
		request.setAttribute("msj", msj);
		LlenarCombosModelo llenar=new LlenarCombosModelo();
		request.setAttribute("tipo", llenar.llenearComboCodigo());	
		return mapping.findForward("cod");
	}
	
	
	public ActionForward mostrar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AddCodigoModelo cm = new AddCodigoModelo();
		request.setAttribute("codisplaytag", cm.cdisplaytag());
		LlenarCombosModelo llenar=new LlenarCombosModelo();
		request.setAttribute("tipo", llenar.llenearComboCodigo());	
		System.out.println("codisplaytag");
		return mapping.findForward("cod");

	}
	
	public ActionForward eliminar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AddCodigoModelo cm = new AddCodigoModelo();
		String codigo = request.getParameter("codigos");
		Integer num = cm.eliminar(codigo);
		String msj="";
		if(num==0){
			msj="Error, Al Eliminar Datos";
		}else if(num==1){
			msj="Datos Eliminados Correctamente";
		}else{
			msj="Error Interno.";
		}
		
		request.setAttribute("msj", msj);
		LlenarCombosModelo llenar=new LlenarCombosModelo();
		request.setAttribute("tipo", llenar.llenearComboCodigo());	
		System.out.println("llego action eliminar");
		return mapping.findForward("cod");

	}
	
	public ActionForward campos(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AddCodigoModelo cm = new AddCodigoModelo();
		String codigo = request.getParameter("codigos");
		request.setAttribute("listacampos", cm.listacampos(codigo));
		LlenarCombosModelo llenar=new LlenarCombosModelo();
		request.setAttribute("tipo", llenar.llenearComboCodigo());
		System.out.println("llego action listacampos" +codigo);
		return mapping.findForward("cod");

	}
	
	public ActionForward actulizar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AddCodigoModelo cm = new AddCodigoModelo();
		String codigo = request.getParameter("codigos");
		System.out.println("codigo"+codigo);
		AddCodigosForm cf = (AddCodigosForm) form;
		Integer num=cm.actulizar(cf, codigo);
		String msj="";
		if(num==0){
			msj="Error, Al Actilizar Datos";
		}else if(num==1){
			msj="Datos Actilizados Correctamente";
		}else{
			msj="Error Interno.";
		}
		
		request.setAttribute("msj", msj);
		LlenarCombosModelo llenar=new LlenarCombosModelo();
		request.setAttribute("tipo", llenar.llenearComboCodigo());
		System.out.println("llego action Actilizar");
		return mapping.findForward("cod");

	}
	
}
