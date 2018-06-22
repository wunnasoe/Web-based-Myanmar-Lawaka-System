<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>အလွှာရှင် မှတ်တမ်း ထည့် သွင်းခြင်း</title>
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
 <img src="images/logo.png"  align="middle"  hspace="200"/>
 <%
 int userCount = (Integer)session.getAttribute("userCount");
 %>
 <h4>အလွာရှင် အမှတ်စဉ် <%=userCount %></h4>
 <form action="OwnerRecordStore" method="post" accept-charset="utf-8" enctype="multipart/form-data" name="ownerRegistration">
   <table cellpadding="10">
  <tr><td><label for="serial">Serial အမှတ်</label></td>
 <td> <input type="text"  name="serial"></td><td></td>
 <td><label for="nrc">နိုင်ငံသားစီစစ်ရေးကဒ်ပြား</label></td>
 <td><input id="fileInput" type="file"  name="nrc"  accept="image/*"/></td></tr>
 <tr> <td><label for="name">အမည်</label></td>
 <td> <input type="text"  name="owner"></td> <td></td>
 <td><label for="ucc1">UCC-1</label></td> <td><input id="fileInput" type="file"  name="ucc1"  accept="image/*"/></td></tr>
  <tr><td><label for="nrc_no">နိုင်ငံသားစီစစ်ရေး ကဒ်ပြားအမှတ်</label></td>
 <td> <input type="text"  name="nrc_no"></td> <td></td>
  <td><label for="ucc2">UCC-2</label></td> <td><input id="fileInput" type="file"  name="ucc2"  accept="image/*"/></td></tr>
  <tr><td><label for="nation">လူမျိုး</label></td>
 <td> <input type="text"  name="nation"></td> <td></td>
  <td><label for="ucc3">UCC-3</label></td> <td><input id="fileInput" type="file"  name="ucc3"  accept="image/*"/></td></tr>
  <tr><td><label for="birthDate">မွေးသက္ကရာဇ်</label></td>
  <td><input type="text"  name="birthDate"></td> <td></td>
   <td><label for="ucc4">UCC-4</label></td> <td><input id="fileInput" type="file"  name="ucc4"  accept="image/*"/></td></tr>
  <tr><td><label for="region">  ဒေသ</label></td>
  <td><input type="text"  name="region"></td> <td></td>
  <td><label for="ucc5">UCC-5</label></td> <td><input id="fileInput" type="file"  name="ucc5"  accept="image/*"/></td></tr>
 <tr> <td><label for="typeOfApply">လျောက်ထားမှုပုံစံ</label></td>
 <td> <input type="text"  name="typeOfApply"></td> <td></td>
  <td><label for="form1_front">ပုံစံ−၁ရှေ့</label></td> <td><input id="fileInput" type="file"  name="form1_front"  accept="image/*"/></td></tr>
 <tr><td> <label for="usedLaw">အကျုံးဝင်ပုဒ်မ</label></td>
<td> <input type="text"  name="usedLaw"></td> <td></td>
 <td><label for="form1_back">ပုံစံ−၁နောက်</label></td> <td><input id="fileInput" type="file"  name="form1_back"  accept="image/*"/></td></tr>
<tr><td> <label for="gender">ကျား/မ</label></td>
<td><input type="radio"  name="gender" value="male"> <label>ကျား</label><input type="radio"  name="gender"  value="female"><label>မ</label></td> <td></td>
 <td><label for="form2_front">ပုံစံ−၂ရှေ့</label></td> <td><input id="fileInput" type="file"  name="form2_front"  accept="image/*"/></td></tr>
<tr><td><label for="file_no">ဖိုင် အမှတ်</label></td>
<td><input type="text"  name="file_no"></td><td></td>
<td><label for="form2_back">ပုံစံ−၂နောက်</label></td><td><input id="fileInput" type="file"  name="form2_back"  accept="image/*"/></td></tr>
<tr><td> <label for="issuedDate">ထုတ်ပေးသည့် ရက်စွဲ</label></td>
<td> <input type="text"  name="issuedDate" value="dd-MM-yyyy"></td> <td></td>
 <td><label for="sr">ကျောင်းထောက်ခံချက်</label></td> <td><input id="fileInput" type="file"  name="sr"  accept="image/*"/></td></tr>
<tr><td> <label for="remark">မှတ်ချက်</label></td>
<td> <input type="text"  name="remark"></td> <td></td>
 <td><label for="form59_4">ပုံစံ−၅၉/၄</label></td> <td><input id="fileInput" type="file"  name="form59_4"  accept="image/*"/></td></tr>
<tr><td><label for="naing_3ka_front">နိုင်−၃(က)ရှေ့</label></td><td><input id="fileInput" type="file"  name="naing_3ka_front"  accept="image/*"/></td><td></td>
<td><label for="naing_3ka_back">နိုင်−၃(က)နောက်</label></td><td><input id="fileInput" type="file"  name="naing_3ka_back"  accept="image/*"/></td></tr>
<tr><td><label for="htwei4_front">ထွေ−၄ရှေ့</label></td><td><input id="fileInput" type="file"  name="htwei4_front"  accept="image/*"/></td><td></td>
<td><label for="htwei4_front">ထွေ−၄နောက်</label></td><td><input id="fileInput" type="file"  name="htwei4_back"  accept="image/*"/></td></tr>
<tr><td><label for="naing2_front">နိုင်−၂ရှေ့</label></td><td><input id="fileInput" type="file"  name="naing2_front"  accept="image/*"/></td><td></td>
<td><label for="naing2_back">နိုင်−၂နောက်</label></td><td><input id="fileInput" type="file"  name="naing2_back"  accept="image/*"/></td></tr>
<tr><td><label for="naing4">နိုင်−၄</label></td><td><input id="fileInput" type="file"  name="naing4"  accept="image/*"/></td><td></td>
<td><label for="affidavit">ကျမ်းကျိန်လွှာ</label></td><td><input id="fileInput" type="file"  name="affidavit"  accept="image/*"/></td></tr>
<tr><td><label for="zazanjanja_affidavit_front">ဇဇ−ညည ကျမ်းကျိန်လွှာ ရှေ့</label></td><td><input id="fileInput" type="file"  name="zazanjanja_affidavit_front"  accept="image/*"/></td><td></td>
<td><label for="zazanjanja_affidavit_back">ဇဇ−ညည ကျမ်းကျိန်လွှာ နောက်</label></td><td><input id="fileInput" type="file"  name="zazanjanja_affidavit_back"  accept="image/*"/></td></tr>
<tr><td><label for="or_approve">ယဉ်ကျေးမှု (သို့) ကိုယ်ပိုင်အုပ်ချုပ်ခွင့်ရ အဖွဲ့အစည်း ထောက်ခံချက်</label></td><td><input id="fileInput" type="file"  name="or_approve"  accept="image/*"/></td><td></td>
<td><label for="birth_register">မွေးစာရင်း</label></td><td><input id="fileInput" type="file"  name="birth_register"  accept="image/*"/></td></tr>
<tr><td><label for="family_chart_front">အိမ်ထောင်စုစာရင်း ရှေ့</label></td><td><input id="fileInput" type="file"  name="family_chart_front"  accept="image/*"/></td><td></td>
<td><label for="family_chart_back">အိမ်ထောင်စုစာရင်း နောက်</label></td><td><input id="fileInput" type="file"  name="family_chart_back"  accept="image/*"/></td></tr>
<tr><td></td><td></td><td></td><td><label for="others">အခြားအထောက်အထားများ</label></td><td><input id="fileInput" type="file"  name="others"  accept="image/*"/></td></tr>
<tr><td><input type="submit" value="သိမ်းမည်"></td><td></td><td></td><td></td><td></td></tr>
  </table>
  </form>
<script type="text/javascript">
	function validate(){
		if(document.ownerRegistration.serial.value=="")
			{
			alert("serial is empty!");
			document.ownerRegistration.serial.focus();
			return false;
			 }
		if(document.ownerRegistration.name.value=="")
			{
			alert("name is empty!");
			document.ownerRegistration.name.focus();
			return false;
			}
		if(document.ownerRegistration.nrc_no.value=="")
		{
		alert("NRC No is empty!");
		document.ownerRegistration.nrc_no.focus();
		return false;
		}
		if(document.ownerRegistration.nation.value=="")
		{
		alert("Nationality is empty!");
		document.ownerRegistration.nation.focus();
		return false;
		}
		if(document.ownerRegistration.region.value=="")
		{
		alert("Region is empty!");
		document.ownerRegistration.region.focus();
		return false;
		}
		
		
	}
	</script>
</body>
</html>