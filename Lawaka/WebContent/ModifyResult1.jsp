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
<%
 ArrayList<OwnerRecordForm> resultList =(ArrayList<OwnerRecordForm>) session.getAttribute("MList"); 
 OwnerRecordForm temp;%>
 <img src="images/logo.png"  align="middle"  hspace="200"/>
<div align="right"><form  action="ModifyResult2.jsp" method="post"><table cellpadding="5" ><tr><td><label>အသေးစိတ်ပြင်ရန်serial noရိုက်ထည့်ပါ</label></td><td><input type="text" name="serial_no" id="srSerial_no"></td><td><input type="submit" value="ပြင်ရန်"></td></tr></table></form></div>
<form action="ModifyResult1.jsp" method="post" name="searchResult">
<table cellpadding="10">
<thead><tr><th>အမည်</th><th>ကျား/မ</th><th>မှတ်ပုံတင်အမှတ်</th><th>serial အမှတ်</th><th>လူမျိုး</th><th>လျှောက်ထားမှုပုံစံ</th><th> ဒေသ</th><th>file အမှတ်</th><th>ထုတ်ပေးသည့် ရက်စွဲ</th></tr></thead>
<%for(int i=0;i<resultList.size();i++){
	temp = resultList.get(i);
	System.out.println(i+": i values in jsp");
	System.out.println( resultList.get(i).getName()+": Name values in jsp");%>
<tr><td><%= temp.getName()%></td>
<td><%=temp.getGender() %></td>
<td><%=temp.getNrc_no() %></td>
<td><%=temp.getSerial_no() %></td>
<td><%=temp.getNationality() %></td>
<td><%=temp.getType_of_law() %></td>
<td> <%=temp.getRegion() %></td>
<td><%=temp.getFile_no() %></td>
<td><%=temp.getIssued_date() %></td><tr>
<% } %>
</table>
</form>

</body>
</html>