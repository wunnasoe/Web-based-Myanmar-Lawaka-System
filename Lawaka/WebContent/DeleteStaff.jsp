<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>မှတ်တမ်းသွင်းဝန်ထမ်းဖျက်ခြင်း</title>
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
</style>
</head>
<body>
<form action="DeleteStaff" method="post"  onsubmit="return(validate());">
<img src="images/logo.png"  align="middle"  hspace="200"/>
<h2>မှတ်တမ်းသွင်း ဝန်ထမ်း ဖျက်ရန်</h2>
<table>
<tr><td><label>မှတ်တမ်းသွင်း ဝန်ထမ်း နံပါတ်</label></td><td><input type="text" name="no" id="no"></td></tr>
<tr><td><label>မှတ်တမ်းသွင်း ဝန်ထမ်း နံပါတ် မသိပါက မှတ်တမ်းသွင်း ဝန်ထမ်းစာရင်းတွင် ရှာဖွေ ကြည့်ရှုနိုင်သည်။</label></td><td></td></tr>
<tr><td></td><td><input type="submit" name="delete" value="ဖျက်မည်"></td></tr>
</table>
</form>
<script type="text/javascript">
function validate(){
	var no;
	no = document.getElementById("no");
	if(no.value==""){
		alert("Please user no to delete");
		return false;
	}
	if(no.value=="1"){
		alert("Admin cannot be deleted!!!");
		return false;
	}
		
	
}
</script>
</body>
</html>