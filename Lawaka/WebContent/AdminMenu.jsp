<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Admin</title>
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
button{
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
/* Style the tab */
div.tab {
    overflow: hidden;
    border: 1px solid #ccc;
    background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
div.tab button {
    font: Myanar3;
     font-family: Myanmar3;
    background-color: inherit;
    float: left;
    border: none;
    outline: none;
    cursor: pointer;
    padding: 14px 16px;
    transition: 0.3s;
    font-size: 17px;
}

/* Change background color of buttons on hover */
div.tab button:hover {
    background-color: #ddd;
}

/* Create an active/current tablink class */
div.tab button.active {
    background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
    display: none;
    padding: 6px 12px;
    border: 1px solid #ccc;
    border-top: none;
}
</style>
</head>
<body>
 <img src="images/logo.png"  align="middle"  hspace="200"/>
<div class="tab">
  <button class="tablinks" onclick="openTab(event, 'Store')">မှတ်တမ်း အသစ်သိမ်းရန်</button>
  <button class="tablinks" onclick="openTab(event, 'Search')">မှတ်တမ်း အဟောင်း ရှာရန်</button>
  <button class="tablinks" onclick="openTab(event, 'Modify')">မှတ်တမ်း ပြင်ရန်</button>
  <button class="tablinks" onclick="openTab(event, 'NewStaff')">မှတ်တမ်းသွင်း ဝန်ထမ်းအသစ်ထည့်ရန်</button>
  <button class="tablinks" onclick="openTab(event, 'ReadStaffAndDelete')">မှတ်တမ်းသွင်း ဝန်ထမ်းစာရင်းကြည့်ရန်နှင့် ဖျက်ရန်</button>
  <button class="tablinks" onclick="openTab(event, 'ChangeProfile')">Profile ပြင်ရန်</button>
</div>

<div id="Store" class="tabcontent">
   <form accept-charset="utf-8" action="Store" method="post">
   <table cellpadding="20">
  <tr><td width="100"><input type="submit" value="အလွှာရှင်"  name="owner"></td>
 <td> </td></tr>
 <tr> <td width="100"><input type="submit"   value="ဖခင်"  name="father" ></td>
 <td width="100"><input type="submit"   value="မိခင်"  name="mother"></td></tr>
  <tr><td width="100"><input type="submit"  value="ဖဘိုး"  name="fgrandfather"></td>
 <td width="100"> <input type="submit"  value="မိဘိုး"  name="mgrandfather"></td></tr>
  <tr><td width="100"><input type="submit"  value="ဖဘွား"  name="fgrandmother"></td>
  <td width="100"><input type="submit"  value="မိဘွား"  name="mgrandmother"></td></tr>  
  </table>
  </form>
</div>

<div id="Search" class="tabcontent">
   <form action="RecordSearch" method="post" accept-charset="utf-8" onsubmit="return(validateRecordSearch());">
   <table cellpadding="10">
  <tr><td><label for="serial">နိုင်ငံသားစီစစ်ရေး ကဒ်ပြားအမှတ်</label></td>
 <td> <input type="text"  name="nrc" id="RSnrc"  value=""><br/></td></tr>
 <tr> <td><label for="name">အမည်</label></td>
 <td> <input type="text"  name="ownerName" id="RSownerName" value=""><br/></td></tr>
 <tr> <td><label for="region"> ဒေသ</label></td>
 <td> <input type="text"  name="region" id="RSregion" value=""><br/></td></tr>
 <tr><td><input type="submit" value="ရှာမည်"></td><td></td></tr>
 </table>
  </form>
</div>

<div id="Modify" class="tabcontent">
   <form action="RecordModify" method="post" accept-charset="utf-8">
   <table cellpadding="10">
 <tr><td><label for="serial">နိုင်ငံသားစီစစ်ရေး ကဒ်ပြားအမှတ်</label></td>
 <td> <input type="text"  name="nrc" id="MDnrc"><br/></td></tr>
 <tr> <td><label for="name">အမည်</label></td>
 <td> <input type="text"  name="ownerName" id="MDownerName"><br/></td></tr>
 <tr> <td><label for="region"> ဒေသ</label></td>
 <td> <input type="text"  name="region"  id="MDregion"><br/></td></tr>
 <tr><td><input type="submit" value="ပြင်မည်"></td><td></td></tr>
 </table>
  </form>
</div>
<div id="NewStaff" class="tabcontent">
   <form action="AddNewStaff" method="post" accept-charset="utf-8" name="newstaff" onsubmit="return(validate());">
   <table cellpadding="10">
  <tr> <td><label for="name">အမည်</label></td>
 <td> <input type="text"  id="newstaffname" name="name" ><br/></td></tr>
 <tr> <td><label for="name">လျို့ဝှက်နံပါတ် ထည့် ပါ</label></td>
 <td> <input type="password"  id="newstaffpassword" name="password"><br/></td></tr>
 <tr> <td><label for="name">နောက်တစ်ကြိမ် လျို့ဝှက်နံပါတ် ထည့် ပါ</label></td>
 <td> <input type="password"  id="newstaffcomfmpassword" name="comfmpassword"><br/></td></tr>
 <tr><td><input type="submit" value="ထည့်မည်" ></td><td></td></tr>
 </table>
  </form>
</div>
<div id="ReadStaffAndDelete" class="tabcontent">
   <form action="ReadAndDeleteStaff" method="post" accept-charset="utf-8"  >
 <table cellpadding="10">
  <tr><td><input type="submit"  value="မှတ်တမ်းသွင်းဝန်းထမ်းစာရင်းကြည့်ရန်"  name="ReadStaff"></td></tr>
 <tr><td> <input type="submit"  value="မှတ်တမ်းသွင်းဝန်းထမ်း ဖျက်ရန်" name="DeleteStaff"></td></tr> 
 </table>
  </form>
</div>
<div id="ChangeProfile" class="tabcontent">
   <form action="ProfileChange" method="post" accept-charset="utf-8" onsubmit="return(validateProfile());">
   <table cellpadding="10">
 <tr> <td><label for="name">အမည်</label></td>
 <td> <input type="text"  name="name" id="changename"><br/></td></tr>
 <tr> <td><label for="name">လျို့ဝှက်နံပါတ် ထည့်ပါ</label></td>
 <td> <input type="password"  name="password" id="changepassword"><br/></td></tr>
 <tr> <td><label for="name">နောက်တစ်ကြိမ် လျို့ဝှက်နံပါတ် ထည့်ပါ</label></td>
 <td> <input type="password"  name="comfmpassword" id="changecomfmpassword"><br/></td></tr>
 <tr><td><input type="submit" value="ပြင်မည်"></td><td></td></tr>
 </table>
  </form>
</div>
<script type="text/javascript" charset="utf-8">
function openTab(evt, cityName) {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
}
function validate(){
	var tabname,tabpassword,tabcfmpassword;
	tabname = document.getElementById("newstaffname");
	tabpassword = document.getElementById("newstaffpassword");
	tabcfmpassword = document.getElementById("newstaffcomfmpassword")
	 if(tabname.value=="")
		{
		alert("အမည် ပေးဖို့ ကျန်ခဲ့ပါတယ်။");		
		return false;
		 } 
	if(tabpassword.value=="")
		{
		alert("password is empty!");		
		return false;
		}
	if(tabcfmpassword.value=="")
	{
	alert("comfirm password is empty!");	
	return false;
	}
	if(tabpassword.value != tabcfmpassword.value){
		alert("Confirm password is not same password!");
		return false;
	}
}
function validateProfile(){
	var tabname,tabpassword,tabcfmpassword;
	tabname = document.getElementById("changename");
	tabpassword = document.getElementById("changepassword");
	tabcfmpassword = document.getElementById("changecomfmpassword");
	if(tabpassword.value != tabcfmpassword.value){
		alert("Confirm password is not same password!");
		return false;
	}
	if(tabname.value==""&&tabpassword.value==""){
		alert("Please complement at least one Name or Password that you want to modify!");
		return false;
	}
	
}
function validateRecordSearch(){
	var nrc,name,region;
	nrc = document.getElementById("RSnrc");
	name = document.getElementById("RSownerName");
	region = document.getElementById("RSregion");
	if(nrc.value==""&&name.value==""&&region.value==""){
		alert("Please complement at least one!");
		return false;
	}
}
</script>
</body>
</html>