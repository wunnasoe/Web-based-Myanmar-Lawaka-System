<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>လူဝင်မှုကြီးကြပ်ရေးဦးစီးဌာန မှတ်တမ်း </title>
<style>
body {font-family: Myanmar3;}
 input {
                font-family: Myanmar3
            }
h3{
font-family: Myanmar3;
color:red;
}
</style>
<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="css/animate.css">
	<!-- Custom Stylesheet -->
	<link rel="stylesheet" href="css/style.css">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
<div class="container">
		<div class="top">
		    <img src="images/logo.png"  align="middle"  hspace="200"/>
			<!-- <img src="images/lawaka_logo.jpg" align="left"  height="50"  width="50"/><img src="images/Myanmar National Logo.png" align="middle" height="20"  width="20"  hspace="600"/><img src="images/Myanmar.png" align="right"  height="50"  width="50" /> -->
		</div>
		<div class="middle"  align="center">
		<h2>ရှမ်းပြည်နယ် (မြောက်ပိုင်း)</h2>
		<h2>နိုင်ငံသားစီစစ်ဆောင်ရွက်ခြင်း လုပ်ငန်း မှတ်တမ်း</h2>
		</div>
		<form accept-charset="utf-8" action="LoginAction" method="post" name="loginform" onsubmit="return(validate());">
		<div class="login-box animated fadeInUp">
			<div class="box-header">
				<h2><label>ဝင်ရောက်ရန်</label></h2>
			</div>
			<h3>အမည်၊ လျို့ဝှက်နံပါတ် လွဲမှားနေပါသည်</h3>
			<label for="username">အမည်</label>
			<br/>
			<input type="text" id="username" name="username">
			<br/>
			<label for="password">လျို့ဝှက်နံပါတ်</label>
			<br/>
			<input type="password" id="password" name="password">
			<br/>
			<input type="submit" name="Sign In" value="ဝင်မည်">
			<br/>
			
		</div>
		</form>
	</div>
	<script type="text/javascript">
	function validate(){
		if(document.loginform.username.value=="")
			{
			alert("user name is empty!");
			document.loginform.username.focus();
			return false;
			 }
		if(document.loginform.password.value=="")
			{
			alert("password is empty!");
			document.loginform.password.focus();
			return false;
			}
	}
	</script>
</body>
</html>