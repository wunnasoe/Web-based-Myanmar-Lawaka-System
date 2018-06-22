<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="form.OtherRecordForm"%>
<%@page import="form.PhotoRecordForm"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
request.setCharacterEncoding("UTF-8");
response.setContentType("image/gif");
String imageName = request.getParameter("imageName");
String person = request.getParameter("typePerson");
System.out.println(imageName+","+person+" in Action class");
PhotoRecordForm photo_record = new PhotoRecordForm();
OtherRecordForm father = new OtherRecordForm();
OtherRecordForm mother = new OtherRecordForm();
OtherRecordForm fgrandfather = new OtherRecordForm();
OtherRecordForm fgrandmother = new OtherRecordForm();
OtherRecordForm mgrandfather = new OtherRecordForm();
OtherRecordForm mgrandmother = new OtherRecordForm();
 photo_record = (PhotoRecordForm)session.getAttribute("photo");
 father = (OtherRecordForm)session.getAttribute("father");
 mother = (OtherRecordForm)session.getAttribute("mother");
 fgrandfather = (OtherRecordForm)session.getAttribute("fgrandfather");
 fgrandmother = (OtherRecordForm)session.getAttribute("fgrandmother");
 mgrandfather = (OtherRecordForm)session.getAttribute("mgrandfather");
 mgrandmother = (OtherRecordForm)session.getAttribute("mgrandmother");
 System.out.println(father.getName()+" in getImage.jsp"); 
 InputStream image=null;
 if(person.equals("owner")){
	 if(imageName.equals("UCC1")){
		 image = photo_record.getUcc1();
	 }
	 else if(imageName.equals("UCC2")){
		 image = photo_record.getUcc2();
	 }
	 else if(imageName.equals("UCC3")){
		 image = photo_record.getUcc3();
	 }
	 else if(imageName.equals("UCC4")){
		 image = photo_record.getUcc4();
	 }
	 else if(imageName.equals("UCC5")){
		 image = photo_record.getUcc5();
	 }
	 else if(imageName.equals("မှတ်ပုံတင်")){
		 image = photo_record.getNrc();
	 }
	 else if(imageName.equals("ပုံစံ ၁ ရှေ့")){
		 image = photo_record.getForm1_front(); 
	 }
	 else if(imageName.equals("ပုံစံ ၁ နောက်")){
		 image = photo_record.getForm1_back(); 
	 }
	 else if(imageName.equals("ပုံစံ ၂ ရှေ့")){
		 image = photo_record.getForm2_front();
	 }
	 else if(imageName.equals("ပုံစံ ၂ နောက်")){
		 image = photo_record.getForm2_back();
	 }
	 else if(imageName.equals("ပုံစံ ၅၉/၄")){
		 image = photo_record.getForm59_4();
	 }
	 else if(imageName.equals("နိုင်၃(က) ရှေ့")){
		 image = photo_record.getNaing3ka_front();
	 }
	 else if(imageName.equals("နိုင်၃(က) နောက်")){
		 image = photo_record.getNaing3ka_back();
	 }
	 else if(imageName.equals("နိုင် ၂ ရှေ့")){
		 image = photo_record.getNaing2_front();
	 }
	 else if(imageName.equals("နိုင် ၂ နောက်")){
		 image = photo_record.getNaing2_back();
	 }
	 else if(imageName.equals("နိုင် ၄")){
		 image = photo_record.getNaing4();
	 }
	 else if(imageName.equals("ထွေ ၄ ရှေ့")){
		 image = photo_record.getHtwei4_front();
	 }
	 else if(imageName.equals("ထွေ ၄ နောက်")){
		 image = photo_record.getHtwei4_back();
	 }
	 else if(imageName.equals("ကျမ်းကျိမ်လွှာ")){
		 image = photo_record.getAffidavit();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့")){
		 image = photo_record.getZaza_njanja_affidavit_front();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်")){
		 image = photo_record.getZaza_njanja_affidavit_back();
	 }
	 else if(imageName.equals("ကိုယ်ပိုင်အုပ်ချုပ်ခွင့်ရ အဖွဲ့အစည်း၏ ထောက်ခံချက်")){
		 image = photo_record.getOrapprove();
	 }
	 else if(imageName.equals("အ ထ စ ရှေ့")){
		 image = photo_record.getFamily_chart_front();
	 }
	 else if(imageName.equals("အ ထ စ နောက်")){
		 image = photo_record.getFamily_chart_back();
	 }
	 else if(imageName.equals("မွေးစာရင်း")){
		 image = photo_record.getBirth_register();
	 }
	 else if(imageName.equals("ကျောင်းထောက်ခံချက်")){
		 image = photo_record.getSchrecom();
	 }
	 else if(imageName.equals("ကျောင်းထောက်ခံချက်")){
		 image = photo_record.getSchrecom();
	 }
	 else if(imageName.equals("အခြားအထောက်အထား")){
		 image = photo_record.getOthers();
	 } 
 }
 else if(person.equals("father")){
	 if(imageName.equals("FRC front")){
		 image = father.getFrc_front();
	 }
	 else if(imageName.equals("FRC back")){
		 image = father.getFrc_back();
	 }
	 else if(imageName.equals("UCC1")){
		 image = father.getUcc1();
	 }
	 else if(imageName.equals("UCC2")){
		 image = father.getUcc2();
	 }
	 else if(imageName.equals("UCC3")){
		 image = father.getUcc3();
	 }
	 else if(imageName.equals("UCC4")){
		 image = father.getUcc4();
	 }
	 else if(imageName.equals("UCC5")){
		 image = father.getUcc5();
	 }
	 else if(imageName.equals("ပုံစံ ၁ ရှေ့")){
		 image = father.getForm1_front();
	 }
	 else if(imageName.equals("ပုံစံ ၁ နောက်")){
		 image = father.getForm1_back();
	 }
	 else if(imageName.equals("ပုံစံ ၂ ရှေ့")){
		 image = father.getForm2_front();
	 }
	 else if(imageName.equals("ပုံစံ ၂ နောက်")){
		 image = father.getForm2_back();
	 }
	 else if(imageName.equals("ပုံစံ ၅၉/၄")){
		 image = father.getForm59_4();
	 }
	 else if(imageName.equals("နိုင် ၆(က) ရှေ့")){
		 image = father.getNaing6ka_front();
	 }
	 else if(imageName.equals("နိုင် ၆(က) နောက်")){
		 image = father.getNaing6ka_back();
	 }
	 else if(imageName.equals("နိုင် ၂ ရှေ့")){
		 image = father.getNaing2_front();
	 }
	 else if(imageName.equals("နိုင် ၂ နောက်")){
		 image = father.getNaing2_back();
	 }
	 else if(imageName.equals("နိုင် ၄")){
		 image = father.getNaing4();
	 }
	 else if(imageName.equals("မှတ်ပုံတင်")){
		 image = father.getNrc();
	 }
	 else if(imageName.equals("ဧည့် ၄/၄(က)")){
		 image = father.getEh4_4ka();
	 }
	 else if(imageName.equals("ဧည့် ၂")){
		 image = father.getEh2();
	 }
	 else if(imageName.equals("ပြု ၆/၆(က)")){
		 image = father.getPju6_6ka();
	 }
	 else if(imageName.equals("ပြု ၈")){
		 image = father.getPju8();
	 }
	 else if(imageName.equals("ထွက်ဆိုချက်")){
		 image = father.getStatement();
	 }
	 else if(imageName.equals("ကျမ်းကျိမ်လွှာ")){
		 image = father.getAffidavit();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့")){
		 image = father.getZaza_njanja_affidavit_front();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်")){
		 image = father.getZaza_njanja_affidavit_back();
	 }
	 else if(imageName.equals("အုတ်ဂူမှတ်တမ်း")){
		 image = father.getTomb_record();
	 }
	 else if(imageName.equals("အခြားအထောက်အထားများ")){
		 image = father.getOthers();		
	 }	 
 }
 else if(person.equals("mother")){
	 if(imageName.equals("FRC front")){
		 image = mother.getFrc_front();
	 }
	 else if(imageName.equals("FRC back")){
		 image = mother.getFrc_back();
	 }
	 else if(imageName.equals("UCC1")){
		 image = mother.getUcc1();
	 }
	 else if(imageName.equals("UCC2")){
		 image = mother.getUcc2();
	 }
	 else if(imageName.equals("UCC3")){
		 image = mother.getUcc3();
	 }
	 else if(imageName.equals("UCC4")){
		 image = mother.getUcc4();
	 }
	 else if(imageName.equals("UCC5")){
		 image = mother.getUcc5();
	 }
	 else if(imageName.equals("ပုံစံ ၁ ရှေ့")){
		 image = mother.getForm1_front();
	 }
	 else if(imageName.equals("ပုံစံ ၁ နောက်")){
		 image = mother.getForm1_back();
	 }
	 else if(imageName.equals("ပုံစံ ၂ ရှေ့")){
		 image = mother.getForm2_front();
	 }
	 else if(imageName.equals("ပုံစံ ၂ နောက်")){
		 image = mother.getForm2_back();
	 }
	 else if(imageName.equals("ပုံစံ ၅၉/၄")){
		 image = mother.getForm59_4();
	 }
	 else if(imageName.equals("နိုင် ၆(က) ရှေ့")){
		 image = mother.getNaing6ka_front();
	 }
	 else if(imageName.equals("နိုင် ၆(က) နောက်")){
		 image = mother.getNaing6ka_back();
	 }
	 else if(imageName.equals("နိုင် ၂ ရှေ့")){
		 image = mother.getNaing2_front();
	 }
	 else if(imageName.equals("နိုင် ၂ နောက်")){
		 image = mother.getNaing2_back();
	 }
	 else if(imageName.equals("နိုင် ၄")){
		 image = mother.getNaing4();
	 }
	 else if(imageName.equals("မှတ်ပုံတင်")){
		 image = mother.getNrc();
	 }
	 else if(imageName.equals("ဧည့် ၄/၄(က)")){
		 image = mother.getEh4_4ka();
	 }
	 else if(imageName.equals("ဧည့် ၂")){
		 image = mother.getEh2();
	 }
	 else if(imageName.equals("ပြု ၆/၆(က)")){
		 image = mother.getPju6_6ka();
	 }
	 else if(imageName.equals("ပြု ၈")){
		 image = mother.getPju8();
	 }
	 else if(imageName.equals("ထွက်ဆိုချက်")){
		 image = mother.getStatement();
	 }
	 else if(imageName.equals("ကျမ်းကျိမ်လွှာ")){
		 image = mother.getAffidavit();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့")){
		 image = mother.getZaza_njanja_affidavit_front();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်")){
		 image = mother.getZaza_njanja_affidavit_back();
	 }
	 else if(imageName.equals("အုတ်ဂူမှတ်တမ်း")){
		 image = mother.getTomb_record();
	 }
	 else if(imageName.equals("အခြားအထောက်အထားများ")){
		 image = mother.getOthers();		
	 }	 
 }
 else if(person.equals("fgrandfather")){
	 if(imageName.equals("FRC front")){
		 image = fgrandfather.getFrc_front();
	 }
	 else if(imageName.equals("FRC back")){
		 image = fgrandfather.getFrc_back();
	 }
	 else if(imageName.equals("UCC1")){
		 image = fgrandfather.getUcc1();
	 }
	 else if(imageName.equals("UCC2")){
		 image = fgrandfather.getUcc2();
	 }
	 else if(imageName.equals("UCC3")){
		 image = fgrandfather.getUcc3();
	 }
	 else if(imageName.equals("UCC4")){
		 image = fgrandfather.getUcc4();
	 }
	 else if(imageName.equals("UCC5")){
		 image = fgrandfather.getUcc5();
	 }
	 else if(imageName.equals("ပုံစံ ၁ ရှေ့")){
		 image = fgrandfather.getForm1_front();
	 }
	 else if(imageName.equals("ပုံစံ ၁ နောက်")){
		 image = fgrandfather.getForm1_back();
	 }
	 else if(imageName.equals("ပုံစံ ၂ ရှေ့")){
		 image = fgrandfather.getForm2_front();
	 }
	 else if(imageName.equals("ပုံစံ ၂ နောက်")){
		 image = fgrandfather.getForm2_back();
	 }
	 else if(imageName.equals("ပုံစံ ၅၉/၄")){
		 image = fgrandfather.getForm59_4();
	 }
	 else if(imageName.equals("နိုင် ၆(က) ရှေ့")){
		 image = fgrandfather.getNaing6ka_front();
	 }
	 else if(imageName.equals("နိုင် ၆(က) နောက်")){
		 image = fgrandfather.getNaing6ka_back();
	 }
	 else if(imageName.equals("နိုင် ၂ ရှေ့")){
		 image = fgrandfather.getNaing2_front();
	 }
	 else if(imageName.equals("နိုင် ၂ နောက်")){
		 image = fgrandfather.getNaing2_back();
	 }
	 else if(imageName.equals("နိုင် ၄")){
		 image = fgrandfather.getNaing4();
	 }
	 else if(imageName.equals("မှတ်ပုံတင်")){
		 image = fgrandfather.getNrc();
	 }
	 else if(imageName.equals("ဧည့် ၄/၄(က)")){
		 image = fgrandfather.getEh4_4ka();
	 }
	 else if(imageName.equals("ဧည့် ၂")){
		 image = fgrandfather.getEh2();
	 }
	 else if(imageName.equals("ပြု ၆/၆(က)")){
		 image = fgrandfather.getPju6_6ka();
	 }
	 else if(imageName.equals("ပြု ၈")){
		 image = fgrandfather.getPju8();
	 }
	 else if(imageName.equals("ထွက်ဆိုချက်")){
		 image = fgrandfather.getStatement();
	 }
	 else if(imageName.equals("ကျမ်းကျိမ်လွှာ")){
		 image = fgrandfather.getAffidavit();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့")){
		 image = fgrandfather.getZaza_njanja_affidavit_front();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်")){
		 image = fgrandfather.getZaza_njanja_affidavit_back();
	 }
	 else if(imageName.equals("အုတ်ဂူမှတ်တမ်း")){
		 image = fgrandfather.getTomb_record();
	 }
	 else if(imageName.equals("အခြားအထောက်အထားများ")){
		 image = fgrandfather.getOthers();		
	 }	 
 }
 else if(person.equals("fgrandmother")){
	 if(imageName.equals("FRC front")){
		 image = fgrandmother.getFrc_front();
	 }
	 else if(imageName.equals("FRC back")){
		 image = fgrandmother.getFrc_back();
	 }
	 else if(imageName.equals("UCC1")){
		 image = fgrandmother.getUcc1();
	 }
	 else if(imageName.equals("UCC2")){
		 image = fgrandmother.getUcc2();
	 }
	 else if(imageName.equals("UCC3")){
		 image = fgrandmother.getUcc3();
	 }
	 else if(imageName.equals("UCC4")){
		 image = fgrandmother.getUcc4();
	 }
	 else if(imageName.equals("UCC5")){
		 image = fgrandmother.getUcc5();
	 }
	 else if(imageName.equals("ပုံစံ ၁ ရှေ့")){
		 image = fgrandmother.getForm1_front();
	 }
	 else if(imageName.equals("ပုံစံ ၁ နောက်")){
		 image = fgrandmother.getForm1_back();
	 }
	 else if(imageName.equals("ပုံစံ ၂ ရှေ့")){
		 image = fgrandmother.getForm2_front();
	 }
	 else if(imageName.equals("ပုံစံ ၂ နောက်")){
		 image = fgrandmother.getForm2_back();
	 }
	 else if(imageName.equals("ပုံစံ ၅၉/၄")){
		 image = fgrandmother.getForm59_4();
	 }
	 else if(imageName.equals("နိုင် ၆(က) ရှေ့")){
		 image = fgrandmother.getNaing6ka_front();
	 }
	 else if(imageName.equals("နိုင် ၆(က) နောက်")){
		 image = fgrandmother.getNaing6ka_back();
	 }
	 else if(imageName.equals("နိုင် ၂ ရှေ့")){
		 image = fgrandmother.getNaing2_front();
	 }
	 else if(imageName.equals("နိုင် ၂ နောက်")){
		 image = fgrandmother.getNaing2_back();
	 }
	 else if(imageName.equals("နိုင် ၄")){
		 image = fgrandmother.getNaing4();
	 }
	 else if(imageName.equals("မှတ်ပုံတင်")){
		 image = fgrandmother.getNrc();
	 }
	 else if(imageName.equals("ဧည့် ၄/၄(က)")){
		 image = fgrandmother.getEh4_4ka();
	 }
	 else if(imageName.equals("ဧည့် ၂")){
		 image = fgrandmother.getEh2();
	 }
	 else if(imageName.equals("ပြု ၆/၆(က)")){
		 image = fgrandmother.getPju6_6ka();
	 }
	 else if(imageName.equals("ပြု ၈")){
		 image = fgrandmother.getPju8();
	 }
	 else if(imageName.equals("ထွက်ဆိုချက်")){
		 image = fgrandmother.getStatement();
	 }
	 else if(imageName.equals("ကျမ်းကျိမ်လွှာ")){
		 image = fgrandmother.getAffidavit();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့")){
		 image = fgrandmother.getZaza_njanja_affidavit_front();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်")){
		 image = fgrandmother.getZaza_njanja_affidavit_back();
	 }
	 else if(imageName.equals("အုတ်ဂူမှတ်တမ်း")){
		 image = fgrandmother.getTomb_record();
	 }
	 else if(imageName.equals("အခြားအထောက်အထားများ")){
		 image = fgrandmother.getOthers();		
	 }	 
 }
 else if(person.equals("mgrandfather")){
	 if(imageName.equals("FRC front")){
		 image = mgrandfather.getFrc_front();
	 }
	 else if(imageName.equals("FRC back")){
		 image = mgrandfather.getFrc_back();
	 }
	 else if(imageName.equals("UCC1")){
		 image = mgrandfather.getUcc1();
	 }
	 else if(imageName.equals("UCC2")){
		 image = mgrandfather.getUcc2();
	 }
	 else if(imageName.equals("UCC3")){
		 image = mgrandfather.getUcc3();
	 }
	 else if(imageName.equals("UCC4")){
		 image = mgrandfather.getUcc4();
	 }
	 else if(imageName.equals("UCC5")){
		 image = mgrandfather.getUcc5();
	 }
	 else if(imageName.equals("ပုံစံ ၁ ရှေ့")){
		 image = mgrandfather.getForm1_front();
	 }
	 else if(imageName.equals("ပုံစံ ၁ နောက်")){
		 image = mgrandfather.getForm1_back();
	 }
	 else if(imageName.equals("ပုံစံ ၂ ရှေ့")){
		 image = mgrandfather.getForm2_front();
	 }
	 else if(imageName.equals("ပုံစံ ၂ နောက်")){
		 image = mgrandfather.getForm2_back();
	 }
	 else if(imageName.equals("ပုံစံ ၅၉/၄")){
		 image = mgrandfather.getForm59_4();
	 }
	 else if(imageName.equals("နိုင် ၆(က) ရှေ့")){
		 image = mgrandfather.getNaing6ka_front();
	 }
	 else if(imageName.equals("နိုင် ၆(က) နောက်")){
		 image = mgrandfather.getNaing6ka_back();
	 }
	 else if(imageName.equals("နိုင် ၂ ရှေ့")){
		 image = mgrandfather.getNaing2_front();
	 }
	 else if(imageName.equals("နိုင် ၂ နောက်")){
		 image = mgrandfather.getNaing2_back();
	 }
	 else if(imageName.equals("နိုင် ၄")){
		 image = mgrandfather.getNaing4();
	 }
	 else if(imageName.equals("မှတ်ပုံတင်")){
		 image = mgrandfather.getNrc();
	 }
	 else if(imageName.equals("ဧည့် ၄/၄(က)")){
		 image = mgrandfather.getEh4_4ka();
	 }
	 else if(imageName.equals("ဧည့် ၂")){
		 image = mgrandfather.getEh2();
	 }
	 else if(imageName.equals("ပြု ၆/၆(က)")){
		 image = mgrandfather.getPju6_6ka();
	 }
	 else if(imageName.equals("ပြု ၈")){
		 image = mgrandfather.getPju8();
	 }
	 else if(imageName.equals("ထွက်ဆိုချက်")){
		 image = mgrandfather.getStatement();
	 }
	 else if(imageName.equals("ကျမ်းကျိမ်လွှာ")){
		 image = mgrandfather.getAffidavit();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့")){
		 image = mgrandfather.getZaza_njanja_affidavit_front();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်")){
		 image = mgrandfather.getZaza_njanja_affidavit_back();
	 }
	 else if(imageName.equals("အုတ်ဂူမှတ်တမ်း")){
		 image = mgrandfather.getTomb_record();
	 }
	 else if(imageName.equals("အခြားအထောက်အထားများ")){
		 image = mgrandfather.getOthers();		
	 }	 
 }
 else if(person.equals("mgrandmother")){
	 if(imageName.equals("FRC front")){
		 image = mgrandmother.getFrc_front();
	 }
	 else if(imageName.equals("FRC back")){
		 image = mgrandmother.getFrc_back();
	 }
	 else if(imageName.equals("UCC1")){
		 image = mgrandmother.getUcc1();
	 }
	 else if(imageName.equals("UCC2")){
		 image = mgrandmother.getUcc2();
	 }
	 else if(imageName.equals("UCC3")){
		 image = mgrandmother.getUcc3();
	 }
	 else if(imageName.equals("UCC4")){
		 image = mgrandmother.getUcc4();
	 }
	 else if(imageName.equals("UCC5")){
		 image = mgrandmother.getUcc5();
	 }
	 else if(imageName.equals("ပုံစံ ၁ ရှေ့")){
		 image = mgrandmother.getForm1_front();
	 }
	 else if(imageName.equals("ပုံစံ ၁ နောက်")){
		 image = mgrandmother.getForm1_back();
	 }
	 else if(imageName.equals("ပုံစံ ၂ ရှေ့")){
		 image = mgrandmother.getForm2_front();
	 }
	 else if(imageName.equals("ပုံစံ ၂ နောက်")){
		 image = mgrandmother.getForm2_back();
	 }
	 else if(imageName.equals("ပုံစံ ၅၉/၄")){
		 image = mgrandmother.getForm59_4();
	 }
	 else if(imageName.equals("နိုင် ၆(က) ရှေ့")){
		 image = mgrandmother.getNaing6ka_front();
	 }
	 else if(imageName.equals("နိုင် ၆(က) နောက်")){
		 image = mgrandmother.getNaing6ka_back();
	 }
	 else if(imageName.equals("နိုင် ၂ ရှေ့")){
		 image = mgrandmother.getNaing2_front();
	 }
	 else if(imageName.equals("နိုင် ၂ နောက်")){
		 image = mgrandmother.getNaing2_back();
	 }
	 else if(imageName.equals("နိုင် ၄")){
		 image = mgrandmother.getNaing4();
	 }
	 else if(imageName.equals("မှတ်ပုံတင်")){
		 image = mgrandmother.getNrc();
	 }
	 else if(imageName.equals("ဧည့် ၄/၄(က)")){
		 image = mgrandmother.getEh4_4ka();
	 }
	 else if(imageName.equals("ဧည့် ၂")){
		 image = mgrandmother.getEh2();
	 }
	 else if(imageName.equals("ပြု ၆/၆(က)")){
		 image = mgrandmother.getPju6_6ka();
	 }
	 else if(imageName.equals("ပြု ၈")){
		 image = mgrandmother.getPju8();
	 }
	 else if(imageName.equals("ထွက်ဆိုချက်")){
		 image = mgrandmother.getStatement();
	 }
	 else if(imageName.equals("ကျမ်းကျိမ်လွှာ")){
		 image = mgrandmother.getAffidavit();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ ရှေ့")){
		 image = mgrandmother.getZaza_njanja_affidavit_front();
	 }
	 else if(imageName.equals("ဇဇ−ညည ကျမ်းကျိမ်လွှာ နောက်")){
		 image = mgrandmother.getZaza_njanja_affidavit_back();
	 }
	 else if(imageName.equals("အုတ်ဂူမှတ်တမ်း")){
		 image = mgrandmother.getTomb_record();
	 }
	 else if(imageName.equals("အခြားအထောက်အထားများ")){
		 image = mgrandmother.getOthers();		
	 }	 
 }
 if(image!=null){
	 //image = photo_record.getFamily_chart_front();
	
	 OutputStream fos = response.getOutputStream();
	 byte[] buffer = new byte[1];
	 while(image.read(buffer)>0)
	 {
		 fos.write(buffer);
	 }		
	// fos.flush();
	 //fos.close();	
	 return;
 }
 
%>