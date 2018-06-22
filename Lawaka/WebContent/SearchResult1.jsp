<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.*,form.OwnerRecordForm" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Search Result -1</title>
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
 ArrayList<OwnerRecordForm> resultList =(ArrayList<OwnerRecordForm>) session.getAttribute("resultList"); 
 OwnerRecordForm temp;%>
 <img src="images/logo.png"  align="middle"  hspace="200"/>
<div align="right"><form  action="SearchDetail" method="post"><table cellpadding="5" ><tr><td><label>အသေးစိတ်ကြည့်ရန်serial noရိုက်ထည့်ပါ</label></td><td><input type="text" name="serial_no" id="srSerial_no"></td><td><input type="submit" value="အသေးစိတ်ကြည့်ရန်"></td></tr></table></form></div>
<form action="SearchResult1.jsp" method="post" name="searchResult">
<%if(resultList.size()==0){ %>
<h3>ရှာဖွေမှုရလဒ် မရှိပါ။</h3>
<%} %>
<table cellpadding="10">
<thead><tr><th>အမည်</th><th>ကျား/မ</th><th>မှတ်ပုံတင်အမှတ်</th><th>serial အမှတ်</th><th>လူမျိုး</th><th>လျှောက်ထားမှုပုံစံ</th><th> ဒေသ</th><th>file အမှတ်</th><th>ထုတ်ပေးသည့် ရက်စွဲ</th></tr></thead>
<%for(int i=0;i<resultList.size();i++){
	//temp = resultList.get(i);
	System.out.println(i+": i values in jsp");
	System.out.println( resultList.get(i).getName()+": Name values in jsp");%>
<tr><td><%= resultList.get(i).getName()%></td>
<td><%=resultList.get(i).getGender() %></td>
<td><%=resultList.get(i).getNrc_no() %></td>
<td><%=resultList.get(i).getSerial_no() %></td>
<td><%=resultList.get(i).getNationality() %></td>
<td><%=resultList.get(i).getType_of_law() %></td>
<td> <%=resultList.get(i).getRegion() %></td>
<td><%=resultList.get(i).getFile_no() %></td>
<td><%=resultList.get(i).getIssued_date() %></td><tr>
<% } %>
</table>
</form>

</body>
</html>