<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>��Ա�б�</title>
<style type="text/css">
 table{
  border: 1px solid black ;
  border-collapse: collapse; 
 }
 table thead tr th{
  border: 1px solid black ;
  padding: 3px ;
  backgroud-color: #cccddd;
 }
 table tbody tr td{
  border: 1px solid black ;
  padding: 3px ;
 }
</style>
</head>    
<body>
<center>
 <h2>
  <font color="blue">��ǰϵͳ��Ա�б�</font>
 </h2>
 <s:form action="delete" theme="simple">
  <table cellspacing="1">
   <thead>
    <tr>
     <th>Select</th>
     <th>Id</th>
     <th>Name</th>
     <th>Address</th>
     <th>Phone</th>
     <th>Operation</th>
    </tr>
   </thead>
   <tbody>
    <s:iterator  value="listEmployee">
     <tr>
      <td>
       <input type="checkbox" name="ids" value='<s:property value="id" />' />
      </td>
      <td>
       <a href='<s:url action="edit"><s:param  name="id" value="id" /></s:url>'><s:property value="id" /></a>
      </td>
      <td><s:property value="name" /></td>
      <td><s:property value="address" /></td>
      <td><s:property value="phone" /></td>
      <td>
       <a href='<s:url action="edit"><s:param name="id" value="id" /></s:url>'>Edit</a>&nbsp;
       <a href='<s:url action="delete"><s:param name="id" value="id" /></s:url>'>Delete</a> 
      </td>
     </tr>
     </s:iterator>
   </tbody>
   
   <s:iterator value="pageBean">    
        <tr>    
         <td colspan="6" align="center" bgcolor="gray">    
         ��<s:property value="allRow"/>����¼        
         ��<s:property value="totalPage"/>ҳ        
         ��ǰ��<s:property value="currentPage"/>ҳ<br>    
        
         <s:if test="%{currentPage == 1}">    
           ��һҳ  ��һҳ    
         </s:if>    
         <!-- currentPageΪ��ǰҳ -->    
         <s:else>    
           <a href="pageAction.action?page=1">��һҳ</a>    
           <a href="pageAction.action?page=<s:property value="%{currentPage-1}"/>">��һҳ</a>    
         </s:else>    
        
         <s:if test="%{currentPage != totalPage}">    
         <a href="pageAction.action?page=<s:property value="%{currentPage+1}"/>">��һҳ</a>    
         <a href="pageAction.action?page=<s:property value="totalPage"/>">���һҳ</a>    
         </s:if>    
        
         <s:else>    
         ��һҳ  ���һҳ    
         </s:else>    
         </td>      
        </tr>    
</s:iterator>    
   
  </table> 
  <br>
  <br>
  <s:submit value="����ɾ��" />
  &nbsp;&nbsp;
  <a href="add.jsp">Add</a>
  <br><br>
 </s:form>
</center> 
</body>
</html>