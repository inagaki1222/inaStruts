package inaStruts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public abstract class inaAbstractAction extends Action {
	
	@Override
	final public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		preProcess();
		
		return executeLogic();
		
	}
	
	public abstract boolean preProcess();

	public abstract ActionForward executeLogic();

}
