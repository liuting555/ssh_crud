<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>错误页面</title>
</head>
<body>

 <h3>
  <font color="red">错误显示页面...</font>
 </h3>
 <br />
 <br />
 系统将在5s后返回登录界面
 <%
  response.setHeader("Refresh", "5,URL=/ssh_crud/login.jsp") ;
 %>
 <br />
 <br />
 <a href="/ssh_crud/add.jsp">添加</a>
</body>
</html>