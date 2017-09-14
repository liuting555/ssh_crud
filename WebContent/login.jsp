<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>雇员登陆</title>

<style type="text/css">
 body {
	background-image: url("image/lb.jpg");
	background-position:left;
	background-repeat: no-repeat;
	margin-top: 380px;
}
table {
	margin-top: 0px;
	margin-left: 350px;
}

#div01{
  position:absolute;top: 300px;right: 470px;
   }
</style>
</head>
<body>
<center>
  
 <div id="div01">
   <font size="16" color="green">用户登录系统</font></div>
 <s:form action="login">
  <table>
   <tr>
    <td><s:textfield name="name" label="姓名" /></td>
   </tr>
   <tr>
    <td><s:textfield name="phone" label="电话" /></td>
   </tr> 
   <tr>
    <td align="center" colspan="2">
     <s:submit value="登陆" />
     <s:reset value="重置" />
    </td>
   </tr>  
  </table>
 </s:form>
</center>
</body>
</html>