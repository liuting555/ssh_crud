<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加雇员</title>
</head>
<body>
 <center>
  <h3>新增雇员</h3>
 
  <s:form action="add">
   <table>
    <tr>
     <td>
      <s:textfield name="employee.name" label="姓名"/>
     </td>
    </tr>
    <tr>
     <td>
      <s:textfield name="employee.address" label="地址"/>
     </td>
    </tr>
    <tr>
     <td>
      <s:textfield name="employee.phone" label="电话"/>
     </td>
    </tr>
    <tr>
     <td align="center" colspan="2">
      <input type="submit" value="提交"/>
      <input type="reset" value="重置"/>
     </td> 
    </tr>
   </table>
  </s:form>
 </center>

</body>
</html>