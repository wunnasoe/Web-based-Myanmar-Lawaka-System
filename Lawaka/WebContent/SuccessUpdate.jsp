<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>မှတ်တမ်းပြင်ဆင်ခြင်း</title>
<style type="text/css">
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
   border: 1px solid gray;
}
</style>
</head>
<body>
<%
String btnName = request.getParameter("submit");
String serial_no = (String)session.getAttribute("serial_no");
if(btnName!=null && btnName.equals("OK")){	
	session.setAttribute("serial_no", serial_no);
	response.sendRedirect("ModifyResult2.jsp");	
}	
%>
 <img src="images/logo.png"  align="middle"  hspace="200"/>
 <form action="SuccessUpdate.jsp" method="post" accept-charset="utf-8" >
 <table align="center">
 <tr align="center"><td><h4>မှတ်တမ်းပြင်ဆင်ခြင်း အောင်မြင်စွာ ပြီးစီးပါပြီ။</h4><br></td></tr>
  <tr align="center"><td><input type="submit" value="OK" name="submit"></td></tr>
 </table>  
 </form>
</body>
</html>