<%@ page contentType="text/html;charset=Shift_JIS" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html:html>
  <head>
    <title>Start(Serverで変更)</title>
  </head>
  <body>
    <h4>Start JSP</h4>
    <html:form action="/StartAction">
    <table>
    <tr>
      <td><font size="3">Id</font></td>
      <td><html:text property="inputId" size="20" maxlength="50" /></td>
    </tr>
    <tr>
      <td><font size="3">Name</font></td>
      <td><html:text property="inputName" size="20" maxlength="50" /></td>
    </tr>    
    </table><br>
      <html:submit property="submit" value="Submit" />
    </html:form>
  </body>
</html:html>
