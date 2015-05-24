package inaStruts;

import inaStruts.ActionForm.StartForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class StartAction extends InaAbstractAction {

	@Override
	public boolean preProcess() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public ActionForward executeLogic(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		// TODO 自動生成されたメソッド・スタブ
		
		 /* Form オブジェクトを受け取ります */
		 StartForm startForm = (StartForm)form;
		  
		 /* Form オブジェクトをリクエストに格納します。 */
		 request.setAttribute("stratForm",startForm);
		 
		 /* map.findForward メソッドに success を設定します。 */
		 return mapping.findForward("success");
	}

}
