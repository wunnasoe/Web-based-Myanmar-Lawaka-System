<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>မိဘိုး မှတ်တမ်းထည့်သွင်းခြင်း</title>
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
	padding:8px;
	letter-spacing: 0.5px;
	padding-top: 10px;
	padding-bottom: 10px;
}
</style>
</head>
<body>
<img src="images/logo.png"  align="middle"  hspace="200"/>
<form action="MGFatherRecordStore" method="post" accept-charset="utf-8" enctype="multipart/form-data">
<table cellpadding="10">
<tr><td><label for="mgrandfatherName">မိဘိုးအမည်</label> </td><td><input type="text" name="mgrandfatherName"> </td><td> </td>
<td><label for="date_of_birth">မွေးသက္ကရဇ်</label> </td><td><input type="text" name="date_of_birth">  </td> </tr>
<tr><td><label for="nrc_no">မိဘိုး၏ နိုင်ငံသားစီစစ်ရေး ကဒ်ပြား အမှတ်</label> </td><td><input type="text" name="nrc_no"> </td><td> </td>
<td><label for="date_of_birth">အကျုံးဝင်ပုဒ်မ</label> </td><td><input type="text" name="used_law">  </td> </tr>
<tr><td><label for="frc_front">FRC ရှေ့</label> </td> <td><input id="fileInput" type="file"  name="frc_front"  accept="image/*"/> </td><td> </td>
<td><label for="frc_back">FRC နောက်</label> </td><td><input id="fileInput" type="file"  name="frc_back"  accept="image/*"/> </td> </tr>
<tr><td><label for="ucc1">UCC-1</label> </td> <td><input id="fileInput" type="file"  name="ucc1"  accept="image/*"/> </td><td> </td>
<td><label for="ucc2">UCC-2</label> </td><td><input id="fileInput" type="file"  name="ucc2"  accept="image/*"/> </td> </tr>
<tr><td> <label for="ucc3">UCC-3</label></td> <td><input id="fileInput" type="file"  name="ucc3"  accept="image/*"/> </td><td> </td>
<td><label for="ucc4">UCC-4</label> </td><td><input id="fileInput" type="file"  name="ucc4"  accept="image/*"/> </td> </tr>
<tr><td><label for="ucc5">UCC-5</label> </td> <td><input id="fileInput" type="file"  name="ucc5"  accept="image/*"/> </td><td> </td>
<td><label for="form1_front">ပုံစံ−၁ ရှေ့</label> </td><td><input id="fileInput" type="file"  name="form1_front"  accept="image/*"/> </td> </tr>
<tr><td><label for="form1_back">ပုံစံ−၁ နောက်</label> </td> <td><input id="fileInput" type="file"  name="form1_back"  accept="image/*"/> </td><td> </td>
<td><label for="form2_front">ပုံစံ−၂ ရှေ့</label> </td><td><input id="fileInput" type="file"  name="form2_front"  accept="image/*"/> </td> </tr>
<tr><td><label for="form2_back">ပုံစံ−၂ နောက်</label> </td> <td><input id="fileInput" type="file"  name="form2_back"  accept="image/*"/> </td><td> </td>
<td><label for="form59_4">ပုံစံ၅၉/၄</label>  </td><td><input id="fileInput" type="file"  name="form59_4"  accept="image/*"/> </td> </tr>
<tr><td><label for="naing6ka_front">နိုင်−၆(က) ရှေ့</label> </td> <td><input id="fileInput" type="file"  name="naing6ka_front"  accept="image/*"/> </td><td> </td>
<td><label for="naing6ka_back">နိုင်−၆(က) နောက်</label> </td><td> <input id="fileInput" type="file"  name="naing6ka_back"  accept="image/*"/></td> </tr>
<tr><td> <label for="naing2_front">နိုင်−၂ ရှေ့</label></td> <td> <input id="fileInput" type="file"  name="naing2_front"  accept="image/*"/></td><td> </td>
<td><label for="naing2_back">နိုင်−၂ နောက်</label> </td><td><input id="fileInput" type="file"  name="naing2_back"  accept="image/*"/> </td> </tr>
<tr><td><label for="naing4_front">နိုင်−၄ </label> </td> <td><input id="fileInput" type="file"  name="naing4"  accept="image/*"/> </td><td> </td>
<td><label for="nrc">နိုင်ငံသားစီစစ်ရေးကဒ်ပြား</label> </td> <td><input id="fileInput" type="file"  name="nrc"  accept="image/*"/> </td> </tr>
<tr><td><label for="eh4_4ka">ဧည့်−၄/၄(က)</label> </td><td><input id="fileInput" type="file"  name="eh4_4ka"  accept="image/*"/> </td><td> </td>
<td><label for="eh2">ဧည့်−၂</label> </td> <td><input id="fileInput" type="file"  name="eh2"  accept="image/*"/> </td> </tr>
<tr><td><label for="pju6_6ka">ပြု−၆/၆(က)</label></td><td><input id="fileInput" type="file"  name="pju6_6ka"  accept="image/*"/> </td><td> </td>
<td> <label for="pju8">ပြု−၈</label> </td> <td><input id="fileInput" type="file"  name="pju8"  accept="image/*"/> </td> </tr>
<tr><td><label for="statement">ထွက်ဆိုချက်</label> </td><td><input id="fileInput" type="file"  name="statement"  accept="image/*"/> </td><td> </td>
<td><label for="affidavit">ကျမ်းကျိမ်လွာ</label> </td> <td> <input id="fileInput" type="file"  name="affidavit"  accept="image/*"/> </td> </tr>
<tr><td><label for="zaza_njanja_affidavit_front">ဇဇ−ညည ကျမ်းကျိမ်လွာ ရှေ့</label> </td><td><input id="fileInput" type="file"  name="zaza_njanja_affidavit_front"  accept="image/*"/></td><td> </td>
<td><label for="zaza_njanja_affidavit_back">ဇဇ−ညည ကျမ်းကျိမ်လွာ နောက်</label> </td> <td><input id="fileInput" type="file"  name="zaza_njanja_affidavit_back"  accept="image/*"/></td> </tr>
<tr><td><label for="tomb_record">အုတ်ဂူ မှတ်တမ်း</label></td><td><input id="fileInput" type="file"  name="tomb_record"  accept="image/*"/> </td><td> </td>
<td> <label for="others">အခြား အထောက်အထားများ</label> </td> <td><input id="fileInput" type="file"  name="others"  accept="image/*"/>  </td> </tr>
<tr><td><input type="submit"  value="သိမ်းမည်"></td> <td></td> <td></td> <td></td> <td></td>  </tr>
</table>
</form>
</body>
</html>