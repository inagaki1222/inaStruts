package inaStruts;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class StartCookie extends InaAbstractAction {

	@Override
	public boolean preProcess() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
	
	@Override
	public ActionForward executeLogic(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO 自動生成されたメソッド・スタブ

		// クッキーをチェック
		checkCookie(request);
		// クッキーセット
		setCookies(request,response);
		/* map.findForward メソッドに success を設定します。 */
		 return mapping.findForward("success");	}
	
	private void checkCookie(HttpServletRequest request) {
	    Cookie cookie[] = request.getCookies();

	    if (cookie != null){
	      for (int i = 0 ; i < cookie.length ; i++){
	          String val = cookie[i].getValue();
	          System.out.println("<p>");
	          System.out.println(cookie[i].getName());
	          System.out.println("=");
	          System.out.println(val);
	          System.out.println("</p>");
	      }
	    }else{
	    	System.out.println("<p>クッキーが見つかりません</p>");
	    }
		
	}

	private void setCookies(HttpServletRequest request,HttpServletResponse response) {

		// 訪問しした履歴
		setVisitCookie(response);
		
		// 本番情報保持
		setHonbanCookie(response);
		
		// 個人情報保持
		setPersonalInfoCookie(response);
		
		// URL取得
		setUrlCookie(request,response);
	}

	private void setUrlCookie(HttpServletRequest request,HttpServletResponse response) {
		Cookie cookie = new Cookie("url", request.getRequestURL().toString());
	    response.addCookie(cookie);
	}

	// 訪問した履歴
	public void setVisitCookie(HttpServletResponse response){
		Cookie cookie = new Cookie("visited", "1");
	    response.addCookie(cookie);
	}
	
	// 本番情報保持
	public void setHonbanCookie(HttpServletResponse response){
		Cookie cookie = new Cookie("honbanFlg", "1");
	    response.addCookie(cookie);
	}

	// 個人情報保持
	public void setPersonalInfoCookie(HttpServletResponse response){
		Cookie cookie = new Cookie("name", "Tarou");
	    response.addCookie(cookie);
	}
}