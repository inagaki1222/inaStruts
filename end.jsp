<%@ page contentType="text/html;charset=Shift_JIS" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html:html>
  <head>
    <title>End JSP</title>
  </head>
  <body>
    <h4>End JSP</h4> 
    <table>
	    <tr>
	      <td><font size="3">Id</font></td>
	      <td><bean:write name="startForm" property="inputId" /></td>
	    </tr>
	    <tr>
	      <td><font size="3">Name</font></td>
	      <td><bean:write name="startForm" property="inputName" /></td>
	    </tr>    
    </table>      
  </body>
</html:html>