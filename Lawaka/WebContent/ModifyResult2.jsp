<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.*,form.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Modify Result -1</title>
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
 <%
String serial_no = new String();
 serial_no = request.getParameter("serial_no");
//System.out.println(serial_no+" in ModifyResult2.jsp");
 if(serial_no==null){
	 serial_no = (String)session.getAttribute("serial_no");
 }
 
	
 
%>
<form action="ModifyRecordChoice" method="post" name="searchResult">
 <table cellpadding="20">
 <tr><td>ပြင်မည့် အလွှာရှင်၏Serial No</td><td><%=serial_no %></td></tr>
  <tr><td width="100"><input type="submit" value="အလွှာရှင်"  name="owner"></td>
 <td> </td></tr>
 <tr> <td width="100"><input type="submit"   value="ဖခင်"  name="father" ></td>
 <td width="100"><input type="submit"   value="မိခင်"  name="mother"></td></tr>
  <tr><td width="100"><input type="submit"  value="ဖဘိုး"  name="fgrandfather"></td>
 <td width="100"> <input type="submit"  value="မိဘိုး"  name="mgrandfather"></td></tr>
  <tr><td width="100"><input type="submit"  value="ဖဘွား"  name="fgrandmother"></td>
  <td width="100"><input type="submit"  value="မိဘွား"  name="mgrandmother"></td></tr>  
  </table>
  <%session.setAttribute("serial_no", serial_no) ;%>
</form>

</body>
</html>