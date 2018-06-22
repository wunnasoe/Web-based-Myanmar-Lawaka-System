<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
     <%@ page import ="java.util.*,form.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>မှတ်တမ်းသွင်း ဝန်ထမ်းစာရင်း</title>
<style>
body {
	background: url("images/photo_bg.jpg") no-repeat center center fixed;
	background-size: cover;
	font-size: 16px;
	font-family: Myanmar3;
	font-weight: 300;
	margin: 0;
	color: #fff;
}
input{
   font-family: Myanmar3;
	padding:8px;
	letter-spacing: 0.5px;
	padding-top: 10px;
	padding-bottom: 10px;
			}
lable{
 font-family: Myanmar3;
 font-size: 18px;
	padding:8px;
	letter-spacing: 0.5px;
	padding-top: 10px;
	padding-bottom: 10px;
}
table {
    border-collapse: collapse;
}
table, th, td {
   border: 1px solid black;
}
</style>
</head>
<body>
<img src="images/logo.png"  align="middle"  hspace="200"/>
<form action="ReadStaff.jsp" method="post" accept-charset="utf-8">
<% ArrayList<UserForm> userList = new ArrayList<UserForm>();
       userList =(ArrayList<UserForm>)session.getAttribute("userList");
%>
<table cellspacing="5" >
<thead align="center"><tr><td>မှတ်တမ်းသွင်း ဝန်ထမ်းစာရင်း</td></tr>
<tr><td>စဉ်</td><td>အမည်</td><td>Role</td></tr>
</thead>
<tbody>
<% for(int i=0;i<userList.size();i++){ %>
<tr><td><%= userList.get(i).getNo() %></td><td><%=userList.get(i).getName() %></td><td><% String str="";if(userList.get(i).isRole()){str="Admin";}else{str="Normal User";} %><%=str %></td></tr>
<%} %>
</tbody>
</table>
<%String value = request.getParameter("Ok");
     if(value!=null&&value.equals("OK"))
          response.sendRedirect("AdminMenu.jsp");  %>
<input type="submit" value="OK" name="Ok">
</form>
</body>
</html>