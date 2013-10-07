package sv.edu.udb.action;
import javax.servlet.http.*;
import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;
public class MatriculaAction extends DispatchAction{

	public ActionForward matricular(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {

			return mapping.findForward("matriculado");
			
			} 

}
