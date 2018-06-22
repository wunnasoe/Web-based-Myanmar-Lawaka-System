<%@ page language="java"  contentType="text/html; charset=utf-8"  pageEncoding="UTF-8"%>
<%@ page import ="java.util.*,form.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Search Result -2</title>
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
</style>
</head>
<body>
<%
OwnerRecordForm owner = new OwnerRecordForm();
PhotoRecordForm photo_record = new PhotoRecordForm();
OtherRecordForm father = new OtherRecordForm();
OtherRecordForm mother = new OtherRecordForm();
OtherRecordForm fgrandfather = new OtherRecordForm();
OtherRecordForm fgrandmother = new OtherRecordForm();
OtherRecordForm mgrandfather = new OtherRecordForm();
OtherRecordForm mgrandmother = new OtherRecordForm();
 owner = (OwnerRecordForm)session.getAttribute("owner");
 photo_record = (PhotoRecordForm)session.getAttribute("photo");
 father = (OtherRecordForm)session.getAttribute("father");
 mother = (OtherRecordForm)session.getAttribute("mother");
 fgrandfather = (OtherRecordForm)session.getAttribute("fgrandfather");
 fgrandmother = (OtherRecordForm)session.getAttribute("fgrandmother");
 mgrandfather = (OtherRecordForm)session.getAttribute("mgrandfather");
 mgrandmother = (OtherRecordForm)session.getAttribute("mgrandmother");
 ArrayList<String> ownerlist = new ArrayList<String>();
 ArrayList<String> fatherlist = new ArrayList<String>();
 ArrayList<String> motherlist = new ArrayList<String>();
 ArrayList<String> fgrandfatherlist = new ArrayList<String>();
 ArrayList<String> fgrandmotherlist = new ArrayList<String>();
 ArrayList<String> mgrandfatherlist = new ArrayList<String>();
 ArrayList<String> mgrandmotherlist = new ArrayList<String>();
 System.out.println(father.getFrc_front()+"in Search Result2");
 System.out.println(father.getUcc1()+" Search Result2");
 if(photo_record.getUcc1()!=null) 
	 ownerlist.add("UCC1");
 if( photo_record.getUcc2()!=null )
	 ownerlist.add("UCC2");
 if(photo_record.getUcc3()!=null )
	 ownerlist.add("UCC3");
 if(photo_record.getUcc4()!=null)
	 ownerlist.add("UCC4");
 if(photo_record.getUcc5()!=null)
	 ownerlist.add("UCC5");
 if(photo_record.getNrc()!=null)
	 ownerlist.add("မှတ်ပုံတင်");
 if(photo_record.getForm1_front()!=null )
	 ownerlist.add("ပုံစံ ၁ ရှေ့");
 if( photo_record.getForm1_back()!=null)
	 ownerlist.add("ပုံစံ ၁ နောက်");
 if(photo_record.getForm2_front()!=null) 
	 ownerlist.add("ပုံစံ ၂ ရှေ့");
 if(photo_record.getForm2_back()!=null)
	 ownerlist.add("ပုံစံ ၂ နောက်");
 if(photo_record.getForm59_4()!=null)
	 ownerlist.add("ပုံစံ ၅၉/၄");
 if(photo_record.getNaing3ka_front()!=null) 
	 ownerlist.add("နိုင်၃(က) ရှေ့");
 if(photo_record.getNaing3ka_back()!=null)
	 ownerlist.add("နိုင်၃(က) နောက်");
 if(photo_record.getNaing2_front()!=null) 
	 ownerlist.add("နိုင် ၂ ရှေ့");
 if(photo_record.getNaing2_back()!=null)
	 ownerlist.add("နိုင် ၂ နောက်");
 if(photo_record.getNaing4()!=null)
	 ownerlist.add("နိုင် ၄");
 if(photo_record.getHtwei4_front()!=null) 
	 ownerlist.add("ထွေ ၄ ရှေ့");
 if(photo_record.getHtwei4_back()!=null)
	 ownerlist.add("ထွေ ၄ နောက်");
 if(photo_record.getAffidavit()!=null)
	 ownerlist.add("ကျမ်းကျိမ်လွှာ");
 if(photo_record.getZaza_njanja_affidavit_front()!=null)
	 ownerlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့");
 if(photo_record.getZaza_njanja_affidavit_back()!=null)
	 ownerlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်");
 if(photo_record.getOrapprove()!=null)
	 ownerlist.add("ကိုယ်ပိုင်အုပ်ချုပ်ခွင့်ရ အဖွဲ့အစည်း၏ ထောက်ခံချက်");
 if(photo_record.getFamily_chart_front()!=null)
	 ownerlist.add("အ ထ စ ရှေ့");
 if(photo_record.getFamily_chart_back()!=null)
	 ownerlist.add("အ ထ စ နောက်");
 if(photo_record.getBirth_register()!=null)
	 ownerlist.add("မွေးစာရင်း");
 if(photo_record.getSchrecom()!=null)
	 ownerlist.add("ကျောင်းထောက်ခံချက်");
 if(photo_record.getOthers()!=null)
	 ownerlist.add("အခြားအထောက်အထား");
 //******************************************//
  if(father.getFrc_front()!=null) 
	fatherlist.add("FRC front");
if(father.getFrc_back()!=null)
	fatherlist.add("FRC back");
if(father.getUcc1()!=null)      
	fatherlist.add("UCC1");
if(father.getUcc2()!=null)
	fatherlist.add("UCC2");
if(father.getUcc3()!=null)
	fatherlist.add("UCC3");
if(father.getUcc4()!=null)
	fatherlist.add("UCC4");
if( father.getUcc5()!=null)
	fatherlist.add("UCC5");
if(father.getForm1_front()!=null) 
	fatherlist.add("ပုံစံ ၁ ရှေ့");
if(father.getForm1_back()!=null)
	fatherlist.add("ပုံစံ ၁ နောက်");
if(father.getForm2_front()!=null) 
	fatherlist.add("ပုံစံ ၂ ရှေ့");
if(father.getForm2_back()!=null)
	fatherlist.add("ပုံစံ ၂ နောက်");
if(father.getForm59_4()!=null)
	fatherlist.add("ပုံစံ ၅၉/၄");
if(father.getNaing6ka_front()!=null) 
	fatherlist.add("နိုင် ၆(က) ရှေ့");
if(father.getNaing6ka_back()!=null)
	fatherlist.add("နိုင် ၆(က) နောက်");
if(father.getNaing2_front()!=null) 
	fatherlist.add("နိုင် ၂ ရှေ့");
if(father.getNaing2_back()!=null)
	fatherlist.add("နိုင် ၂ နောက်");
if(father.getNaing4()!=null)
	fatherlist.add("နိုင် ၄");
if(father.getNrc()!=null)
	fatherlist.add("မှတ်ပုံတင်");
if(father.getEh4_4ka()!=null)
	fatherlist.add("ဧည့် ၄/၄(က)");
if(father.getEh2()!=null)
	fatherlist.add("ဧည့် ၂");
if(father.getPju6_6ka()!=null)
	fatherlist.add("ပြု ၆/၆(က)");
if(father.getPju8()!=null)
	fatherlist.add("ပြု ၈");
if(father.getStatement()!=null)
	fatherlist.add("ထွက်ဆိုချက်");
if(father.getAffidavit()!=null)
	fatherlist.add("ကျမ်းကျိမ်လွှာ");
if(father.getZaza_njanja_affidavit_front()!=null) 
	fatherlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့");
if(father.getZaza_njanja_affidavit_back()!=null)
	fatherlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်");
if(father.getTomb_record()!=null)
	fatherlist.add("အုတ်ဂူမှတ်တမ်း");
if(father.getOthers()!=null)
	fatherlist.add("အခြားအထောက်အထားများ");
 //******************************//
 if(mother.getFrc_front()!=null) 
	motherlist.add("FRC front");
if(mother.getFrc_back()!=null)
	motherlist.add("FRC back");
if(mother.getUcc1()!=null)      
	motherlist.add("UCC1");
if(mother.getUcc2()!=null)
	motherlist.add("UCC2");
if(mother.getUcc3()!=null)
	motherlist.add("UCC3");
if(mother.getUcc4()!=null)
	motherlist.add("UCC4");
if( mother.getUcc5()!=null)
	motherlist.add("UCC5");
if(mother.getForm1_front()!=null) 
	motherlist.add("ပုံစံ ၁ ရှေ့");
if(mother.getForm1_back()!=null)
	motherlist.add("ပုံစံ ၁ နောက်");
if(mother.getForm2_front()!=null) 
	motherlist.add("ပုံစံ ၂ ရှေ့");
if(mother.getForm2_back()!=null)
	motherlist.add("ပုံစံ ၂ နောက်");
if(mother.getForm59_4()!=null)
	motherlist.add("ပုံစံ ၅၉/၄");
if(mother.getNaing6ka_front()!=null) 
	motherlist.add("နိုင် ၆(က) ရှေ့");
if(mother.getNaing6ka_back()!=null)
	motherlist.add("နိုင် ၆(က) နောက်");
if(mother.getNaing2_front()!=null) 
	motherlist.add("နိုင် ၂ ရှေ့");
if(mother.getNaing2_back()!=null)
	motherlist.add("နိုင် ၂ နောက်");
if(mother.getNaing4()!=null)
	motherlist.add("နိုင် ၄");
if(mother.getNrc()!=null)
	motherlist.add("မှတ်ပုံတင်");
if(mother.getEh4_4ka()!=null)
	motherlist.add("ဧည့် ၄/၄(က)");
if(mother.getEh2()!=null)
	motherlist.add("ဧည့် ၂");
if(mother.getPju6_6ka()!=null)
	motherlist.add("ပြု ၆/၆(က)");
if(mother.getPju8()!=null)
	motherlist.add("ပြု ၈");
if(mother.getStatement()!=null)
	motherlist.add("ထွက်ဆိုချက်");
if(mother.getAffidavit()!=null)
	motherlist.add("ကျမ်းကျိမ်လွှာ");
if(mother.getZaza_njanja_affidavit_front()!=null) 
	motherlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့");
if(mother.getZaza_njanja_affidavit_back()!=null)
	motherlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်");
if(mother.getTomb_record()!=null)
	motherlist.add("အုတ်ဂူမှတ်တမ်း");
if(mother.getOthers()!=null)
	motherlist.add("အခြားအထောက်အထားများ");
//******************************************//
if(fgrandfather.getFrc_front()!=null) 
	fgrandfatherlist.add("FRC front");
if(fgrandfather.getFrc_back()!=null)
	fgrandfatherlist.add("FRC back");
if(fgrandfather.getUcc1()!=null)      
	fgrandfatherlist.add("UCC1");
if(fgrandfather.getUcc2()!=null)
	fgrandfatherlist.add("UCC2");
if(fgrandfather.getUcc3()!=null)
	fgrandfatherlist.add("UCC3");
if(fgrandfather.getUcc4()!=null)
	fgrandfatherlist.add("UCC4");
if( fgrandfather.getUcc5()!=null)
	fgrandfatherlist.add("UCC5");
if(fgrandfather.getForm1_front()!=null) 
	fgrandfatherlist.add("ပုံစံ ၁ ရှေ့");
if(fgrandfather.getForm1_back()!=null)
	fgrandfatherlist.add("ပုံစံ ၁ နောက်");
if(fgrandfather.getForm2_front()!=null) 
	fgrandfatherlist.add("ပုံစံ ၂ ရှေ့");
if(fgrandfather.getForm2_back()!=null)
	fgrandfatherlist.add("ပုံစံ ၂ နောက်");
if(fgrandfather.getForm59_4()!=null)
	fgrandfatherlist.add("ပုံစံ ၅၉/၄");
if(fgrandfather.getNaing6ka_front()!=null) 
	fgrandfatherlist.add("နိုင် ၆(က) ရှေ့");
if(fgrandfather.getNaing6ka_back()!=null)
	fgrandfatherlist.add("နိုင် ၆(က) နောက်");
if(fgrandfather.getNaing2_front()!=null) 
	fgrandfatherlist.add("နိုင် ၂ ရှေ့");
if(fgrandfather.getNaing2_back()!=null)
	fgrandfatherlist.add("နိုင် ၂ နောက်");
if(fgrandfather.getNaing4()!=null)
	fgrandfatherlist.add("နိုင် ၄");
if(fgrandfather.getNrc()!=null)
	fgrandfatherlist.add("မှတ်ပုံတင်");
if(fgrandfather.getEh4_4ka()!=null)
	fgrandfatherlist.add("ဧည့် ၄/၄(က)");
if(fgrandfather.getEh2()!=null)
	fgrandfatherlist.add("ဧည့် ၂");
if(fgrandfather.getPju6_6ka()!=null)
	fgrandfatherlist.add("ပြု ၆/၆(က)");
if(fgrandfather.getPju8()!=null)
	fgrandfatherlist.add("ပြု ၈");
if(fgrandfather.getStatement()!=null)
	fgrandfatherlist.add("ထွက်ဆိုချက်");
if(fgrandfather.getAffidavit()!=null)
	fgrandfatherlist.add("ကျမ်းကျိမ်လွှာ");
if(fgrandfather.getZaza_njanja_affidavit_front()!=null) 
	fgrandfatherlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့");
if(fgrandfather.getZaza_njanja_affidavit_back()!=null)
	fgrandfatherlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်");
if(fgrandfather.getTomb_record()!=null)
	fgrandfatherlist.add("အုတ်ဂူမှတ်တမ်း");
if(fgrandfather.getOthers()!=null)
	fgrandfatherlist.add("အခြားအထောက်အထားများ");
//******************************************//
if(fgrandmother.getFrc_front()!=null) 
	fgrandmotherlist.add("FRC front");
if(fgrandmother.getFrc_back()!=null)
	fgrandmotherlist.add("FRC back");
if(fgrandmother.getUcc1()!=null)      
	fgrandmotherlist.add("UCC1");
if(fgrandmother.getUcc2()!=null)
	fgrandmotherlist.add("UCC2");
if(fgrandmother.getUcc3()!=null)
	fgrandmotherlist.add("UCC3");
if(fgrandmother.getUcc4()!=null)
	fgrandmotherlist.add("UCC4");
if( fgrandmother.getUcc5()!=null)
	fgrandmotherlist.add("UCC5");
if(fgrandmother.getForm1_front()!=null) 
	fgrandmotherlist.add("ပုံစံ ၁ ရှေ့");
if(fgrandmother.getForm1_back()!=null)
	fgrandmotherlist.add("ပုံစံ ၁ နောက်");
if(fgrandmother.getForm2_front()!=null) 
	fgrandmotherlist.add("ပုံစံ ၂ ရှေ့");
if(fgrandmother.getForm2_back()!=null)
	fgrandmotherlist.add("ပုံစံ ၂ နောက်");
if(fgrandmother.getForm59_4()!=null)
	fgrandmotherlist.add("ပုံစံ ၅၉/၄");
if(fgrandmother.getNaing6ka_front()!=null) 
	fgrandmotherlist.add("နိုင် ၆(က) ရှေ့");
if(fgrandmother.getNaing6ka_back()!=null)
	fgrandmotherlist.add("နိုင် ၆(က) နောက်");
if(fgrandmother.getNaing2_front()!=null) 
	fgrandmotherlist.add("နိုင် ၂ ရှေ့");
if(fgrandmother.getNaing2_back()!=null)
	fgrandmotherlist.add("နိုင် ၂ နောက်");
if(fgrandmother.getNaing4()!=null)
	fgrandmotherlist.add("နိုင် ၄");
if(fgrandmother.getNrc()!=null)
	fgrandmotherlist.add("မှတ်ပုံတင်");
if(fgrandmother.getEh4_4ka()!=null)
	fgrandmotherlist.add("ဧည့် ၄/၄(က)");
if(fgrandmother.getEh2()!=null)
	fgrandmotherlist.add("ဧည့် ၂");
if(fgrandmother.getPju6_6ka()!=null)
	fgrandmotherlist.add("ပြု ၆/၆(က)");
if(fgrandmother.getPju8()!=null)
	fgrandmotherlist.add("ပြု ၈");
if(fgrandmother.getStatement()!=null)
	fgrandmotherlist.add("ထွက်ဆိုချက်");
if(fgrandmother.getAffidavit()!=null)
	fgrandmotherlist.add("ကျမ်းကျိမ်လွှာ");
if(fgrandmother.getZaza_njanja_affidavit_front()!=null) 
	fgrandmotherlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့");
if(fgrandmother.getZaza_njanja_affidavit_back()!=null)
	fgrandmotherlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်");
if(fgrandmother.getTomb_record()!=null)
	fgrandmotherlist.add("အုတ်ဂူမှတ်တမ်း");
if(fgrandmother.getOthers()!=null)
	fgrandmotherlist.add("အခြားအထောက်အထားများ");
//******************************************//
if(mgrandfather.getFrc_front()!=null) 
	mgrandfatherlist.add("FRC front");
if(mgrandfather.getFrc_back()!=null)
	mgrandfatherlist.add("FRC back");
if(mgrandfather.getUcc1()!=null)      
	mgrandfatherlist.add("UCC1");
if(mgrandfather.getUcc2()!=null)
	mgrandfatherlist.add("UCC2");
if(mgrandfather.getUcc3()!=null)
	mgrandfatherlist.add("UCC3");
if(mgrandfather.getUcc4()!=null)
	mgrandfatherlist.add("UCC4");
if( mgrandfather.getUcc5()!=null)
	mgrandfatherlist.add("UCC5");
if(mgrandfather.getForm1_front()!=null) 
	mgrandfatherlist.add("ပုံစံ ၁ ရှေ့");
if(mgrandfather.getForm1_back()!=null)
	mgrandfatherlist.add("ပုံစံ ၁ နောက်");
if(mgrandfather.getForm2_front()!=null) 
	mgrandfatherlist.add("ပုံစံ ၂ ရှေ့");
if(mgrandfather.getForm2_back()!=null)
	mgrandfatherlist.add("ပုံစံ ၂ နောက်");
if(mgrandfather.getForm59_4()!=null)
	mgrandfatherlist.add("ပုံစံ ၅၉/၄");
if(mgrandfather.getNaing6ka_front()!=null) 
	mgrandfatherlist.add("နိုင် ၆(က) ရှေ့");
if(mgrandfather.getNaing6ka_back()!=null)
	mgrandfatherlist.add("နိုင် ၆(က) နောက်");
if(mgrandfather.getNaing2_front()!=null) 
	mgrandfatherlist.add("နိုင် ၂ ရှေ့");
if(mgrandfather.getNaing2_back()!=null)
	mgrandfatherlist.add("နိုင် ၂ နောက်");
if(mgrandfather.getNaing4()!=null)
	mgrandfatherlist.add("နိုင် ၄");
if(mgrandfather.getNrc()!=null)
	mgrandfatherlist.add("မှတ်ပုံတင်");
if(mgrandfather.getEh4_4ka()!=null)
	mgrandfatherlist.add("ဧည့် ၄/၄(က)");
if(mgrandfather.getEh2()!=null)
	mgrandfatherlist.add("ဧည့် ၂");
if(mgrandfather.getPju6_6ka()!=null)
	mgrandfatherlist.add("ပြု ၆/၆(က)");
if(mgrandfather.getPju8()!=null)
	mgrandfatherlist.add("ပြု ၈");
if(mgrandfather.getStatement()!=null)
	mgrandfatherlist.add("ထွက်ဆိုချက်");
if(mgrandfather.getAffidavit()!=null)
	mgrandfatherlist.add("ကျမ်းကျိမ်လွှာ");
if(mgrandfather.getZaza_njanja_affidavit_front()!=null) 
	mgrandfatherlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့");
if(mgrandfather.getZaza_njanja_affidavit_back()!=null)
	mgrandfatherlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်");
if(mgrandfather.getTomb_record()!=null)
	mgrandfatherlist.add("အုတ်ဂူမှတ်တမ်း");
if(mgrandfather.getOthers()!=null)
	mgrandfatherlist.add("အခြားအထောက်အထားများ");
//******************************************//
if(mgrandmother.getFrc_front()!=null) 
	mgrandmotherlist.add("FRC front");
if(mgrandmother.getFrc_back()!=null)
	mgrandmotherlist.add("FRC back");
if(mgrandmother.getUcc1()!=null)      
	mgrandmotherlist.add("UCC1");
if(mgrandmother.getUcc2()!=null)
	mgrandmotherlist.add("UCC2");
if(mgrandmother.getUcc3()!=null)
	mgrandmotherlist.add("UCC3");
if(mgrandmother.getUcc4()!=null)
	mgrandmotherlist.add("UCC4");
if( mgrandmother.getUcc5()!=null)
	mgrandmotherlist.add("UCC5");
if(mgrandmother.getForm1_front()!=null) 
	mgrandmotherlist.add("ပုံစံ ၁ ရှေ့");
if(mgrandmother.getForm1_back()!=null)
	mgrandmotherlist.add("ပုံစံ ၁ နောက်");
if(mgrandmother.getForm2_front()!=null) 
	mgrandmotherlist.add("ပုံစံ ၂ ရှေ့");
if(mgrandmother.getForm2_back()!=null)
	mgrandmotherlist.add("ပုံစံ ၂ နောက်");
if(mgrandmother.getForm59_4()!=null)
	mgrandmotherlist.add("ပုံစံ ၅၉/၄");
if(mgrandmother.getNaing6ka_front()!=null) 
	mgrandmotherlist.add("နိုင် ၆(က) ရှေ့");
if(mgrandmother.getNaing6ka_back()!=null)
	mgrandmotherlist.add("နိုင် ၆(က) နောက်");
if(mgrandmother.getNaing2_front()!=null) 
	mgrandmotherlist.add("နိုင် ၂ ရှေ့");
if(mgrandmother.getNaing2_back()!=null)
	mgrandmotherlist.add("နိုင် ၂ နောက်");
if(mgrandmother.getNaing4()!=null)
	mgrandmotherlist.add("နိုင် ၄");
if(mgrandmother.getNrc()!=null)
	mgrandmotherlist.add("မှတ်ပုံတင်");
if(mgrandmother.getEh4_4ka()!=null)
	mgrandmotherlist.add("ဧည့် ၄/၄(က)");
if(mgrandmother.getEh2()!=null)
	mgrandmotherlist.add("ဧည့် ၂");
if(mgrandmother.getPju6_6ka()!=null)
	mgrandmotherlist.add("ပြု ၆/၆(က)");
if(mgrandmother.getPju8()!=null)
	mgrandmotherlist.add("ပြု ၈");
if(mgrandmother.getStatement()!=null)
	mgrandmotherlist.add("ထွက်ဆိုချက်");
if(mgrandmother.getAffidavit()!=null)
	mgrandmotherlist.add("ကျမ်းကျိမ်လွှာ");
if(mgrandmother.getZaza_njanja_affidavit_front()!=null) 
	mgrandmotherlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့");
if(mgrandmother.getZaza_njanja_affidavit_back()!=null)
	mgrandmotherlist.add("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်");
if(mgrandmother.getTomb_record()!=null)
	mgrandmotherlist.add("အုတ်ဂူမှတ်တမ်း");
if(mgrandmother.getOthers()!=null)
	mgrandmotherlist.add("အခြားအထောက်အထားများ");
 %>
 <img src="images/logo.png"  align="middle"  hspace="200"/>
<form action="SearchResult2.jsp" method="post" name="searchResult2">
<table cellpadding="10">
<thead><tr><th>ပုဂ္ဂိုလ်</th><th>အမည်</th><th>မွေးသက္ကရာဇ်</th><th>မှတ်ပုံတင်အမှတ်</th><th>အကျုံးဝင်ပုဒ်မ</th><th>ပူးတွဲအထောက်အထား</th><th>မှတ်ချက်</th></tr></thead>
<tr><td>အလွှာရှင်</td><td><%= owner.getName() %></td><td><%= owner.getDate_of_birth() %></td><td><%= owner.getNrc_no() %></td><td><%= owner.getType_of_law() %></td>
<td><%Iterator it = ownerlist.iterator(); 
while(it.hasNext()){	%><%= (String)it.next()+"၊" %><%} %></td><td><%=owner.getRemark() %></td></tr>
<tr><td>ဖခင်</td><td><%=father.getName() %></td><td><%=father.getDate_of_birth() %></td><td><%=father.getNrc_no() %></td><td><%=father.getUseful_law() %></td>
<td><%it = fatherlist.iterator();
while (it.hasNext()){%><%=it.next().toString()+"၊" %><%} %></td><td></td></tr>
<tr><td>မိခင်</td><td><%=mother.getName() %></td><td><%=mother.getDate_of_birth() %></td><td><%=mother.getNrc_no() %></td><td><%=mother.getUseful_law() %></td>
<td><%it = motherlist.iterator();
while(it.hasNext()){ %><%=it.next().toString()+"၊" %><%} %></td><td></td></tr>
<tr><td>ဖဘိုး</td><td><%=fgrandfather.getName() %></td><td><%=fgrandfather.getDate_of_birth() %></td><td><%=fgrandfather.getNrc_no() %></td><td><%=fgrandfather.getUseful_law() %></td>
<td><% it = fgrandfatherlist.iterator();
while(it.hasNext()){%><%=it.next().toString()+"၊" %><%} %></td><td></td></tr>
<tr><td>ဖဘွား</td><td><%=fgrandmother.getName() %></td><td><%=fgrandmother.getDate_of_birth() %></td><td><%=fgrandmother.getNrc_no() %></td><td><%=fgrandmother.getUseful_law() %></td>
<td><%it = fgrandmotherlist.iterator();
while(it.hasNext()){%><%=it.next().toString()+"၊" %><%} %></td><td></td></tr>
<tr><td>မိဘိုး</td><td><%=mgrandfather.getName() %></td><td><%= mgrandfather.getDate_of_birth() %></td><td><%=mgrandfather.getNrc_no() %></td><td><%= mgrandfather.getUseful_law() %></td>
<td><%it= mgrandfatherlist.iterator();
while(it.hasNext()){%><%=it.next().toString()+"၊" %><%} %></td><td></td></tr>
<tr><td>မိဘွား</td><td><%=mgrandmother.getName() %></td><td><%=mgrandmother.getDate_of_birth() %></td><td><%=mgrandmother.getNrc_no() %></td><td><%=mgrandmother.getUseful_law() %></td>
<td><%it = mgrandmotherlist.iterator();
while(it.hasNext()){%><%=it.next().toString()+"၊"%><%} %></td><td></td></tr>
</table>
</form>
<div>
<form action="getImage.jsp" method="post" accept-charset="utf-8">

<%  
session.setAttribute("photo", photo_record);
session.setAttribute("father", father);
session.setAttribute("mother", mother);
session.setAttribute("fgrandfather", fgrandfather);
session.setAttribute("fgrandmother", fgrandmother);
session.setAttribute("mgrandfather", mgrandfather);
session.setAttribute("mgrandmother", mgrandmother);

//response.sendRedirect("ShowImage");
      %>
<table>
<tr><td>ပုဂ္ဂိုလ်</td>
<td>
<select id="typePerson" name="typePerson">
<option value="owner">အလွာရှင်</option>
<option value="father">ဖခင်</option>
<option value= "mother">မိခင်</option>
<option value= "fgrandfather">ဖဘိုး</option>
<option value= "fgrandmother">ဖဘွား</option>
<option value="mgrandfather">မိဘိုး</option>
<option value= "mgrandmother">မိဘွား</option>
</select></td></tr>
<tr><td>ပုံအမည် ထည့်ပါ</td>
<td><input type="text" name="imageName" id="imgaeName"></td></tr>
<tr><td></td><td><input type="submit" value="ပုံကြည့်ရန်"></td></tr>
</table>

</form>
</div>

</body>
</html>