package action;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import Database.OwnerRecordDB;
import form.OwnerRecordForm;
import form.PhotoRecordForm;

/**
 * Servlet implementation class OwnerRecordStoreAction
 */
@WebServlet("/OwnerRecordStore")
@MultipartConfig(maxFileSize = 16177216)
public class OwnerRecordStoreAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OwnerRecordStoreAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		OwnerRecordForm ownerRecord = new OwnerRecordForm();
		PhotoRecordForm ownerPhoto = new PhotoRecordForm();
		int result1=0,result2=0;
		
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		String serial = request.getParameter("serial");
		String name = request.getParameter("owner");
		String nrc_no= request.getParameter("nrc_no");
		String nationality = request.getParameter("nation");
		String date_of_birth = request.getParameter("birthDate");
		String type_of_apply = request.getParameter("typeOfApply");
		String region = request.getParameter("region");
		String useful_law = request.getParameter("usedLaw");
		String gender = request.getParameter("gender");
		String file_no = request.getParameter("file_no");
		String issuedDate = request.getParameter("issuedDate");
		String remark = request.getParameter("remark");
		Boolean bit = (Boolean)session.getAttribute("role");
		System.out.println(serial+" "+name+" "+nrc_no);
		System.out.println(nationality+" "+date_of_birth+" "+type_of_apply);
		System.out.println(region+" "+useful_law+" "+gender);
		System.out.println(file_no+" "+issuedDate+" "+remark);
		
		ownerRecord.setSerial_no(serial);
		ownerRecord.setName(name);
		ownerRecord.setNrc_no(nrc_no);
		ownerRecord.setNationality(nationality);
		ownerRecord.setDate_of_birth(date_of_birth);
		ownerRecord.setType_of_law(type_of_apply);
		ownerRecord.setRegion(region);
		ownerRecord.setUseful_law(useful_law);
		ownerRecord.setGender(gender);
		ownerRecord.setFile_no(file_no);
		ownerRecord.setIssued_date(issuedDate);
		ownerRecord.setRemark(remark);
		/*SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");     //line79to88 is to convert String to sql.Date format    
		try {
			java.util.Date parsed = (java.util.Date) format.parse(issuedDate);
			java.sql.Date timestamp = new java.sql.Date(parsed.getTime());
			ownerRecord.setIssued_date(timestamp);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      */
		
		
		//insert owner record table
		try {
			result1 = OwnerRecordDB.insertOwnerRecord(ownerRecord);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//next section is photorecord table 26colums
		Part partnrc = request.getPart("nrc");
		Part partucc1 = request.getPart("ucc1");
		Part partucc2 = request.getPart("ucc2");
		Part partucc3 = request.getPart("ucc3");
		Part partucc4 = request.getPart("ucc4");
		Part partucc5 = request.getPart("ucc5");
		Part form1_front = request.getPart("form1_front");
		Part form1_back = request.getPart("form1_back");
		Part form2_front = request.getPart("form2_front");
		Part form2_back = request.getPart("form2_back");
		Part partsr = request.getPart("sr");
		Part form59_4 = request.getPart("form59_4");
		Part naing_3ka_front = request.getPart("naing_3ka_front");
		Part naing_3ka_back = request.getPart("naing_3ka_back");
		Part htwei4_front = request.getPart("htwei4_front");
		Part htwei4_back = request.getPart("htwei4_back");
		Part naing2_front = request.getPart("naing2_front");
		Part naing2_back = request.getPart("naing2_back");
		Part naing4 = request.getPart("naing4");
		Part affidavit = request.getPart("affidavit");
		Part zazanjanja_affidavit_front = request.getPart("zazanjanja_affidavit_front");
		Part zazanjanja_affidavit_back = request.getPart("zazanjanja_affidavit_back");
		Part or_approve = request.getPart("or_approve");
		Part birth_register = request.getPart("birth_register");
		Part family_chart_front = request.getPart("family_chart_front");
		Part family_chart_back = request.getPart("family_chart_back");
		Part others = request.getPart("others");
		
		//Inputsteams for each photo (26)
		InputStream nrcis = partnrc.getInputStream();
		InputStream ucc1is = partucc1.getInputStream();
		InputStream ucc2is = partucc2.getInputStream();
		InputStream ucc3is = partucc3.getInputStream();
		InputStream ucc4is = partucc4.getInputStream();
		InputStream ucc5is = partucc5.getInputStream();
		InputStream form1_frontis = form1_front.getInputStream();
		InputStream form1_backis = form1_back.getInputStream();
		InputStream form2_frontis = form2_front.getInputStream();
		InputStream form2_backis = form2_back.getInputStream();
		InputStream partsris = partsr.getInputStream();
		InputStream form59_4is = form59_4.getInputStream();
		InputStream naing_3ka_frontis = naing_3ka_front.getInputStream();
		InputStream naing_3ka_backis = naing_3ka_back.getInputStream();
		InputStream htwei4_frontis = htwei4_front.getInputStream();
		InputStream htwei4_backis = htwei4_back.getInputStream();
		InputStream naing2_frontis = naing2_front.getInputStream();
		InputStream naing2_backis = naing2_back.getInputStream();
		InputStream naing4is = naing4.getInputStream();
		InputStream affidavitis = affidavit.getInputStream();
		InputStream zazanjanja_affidavit_frontis = zazanjanja_affidavit_front.getInputStream();
		InputStream zazanjanja_affidavit_backis = zazanjanja_affidavit_back.getInputStream();
		InputStream or_approveis = or_approve.getInputStream();
		InputStream birth_registeris = birth_register.getInputStream();
		InputStream family_chart_frontis = family_chart_front.getInputStream();
		InputStream family_chart_backis = family_chart_back.getInputStream();
		InputStream othersis = others.getInputStream();
		
		ownerPhoto.setNrc(nrcis);
		ownerPhoto.setUcc1(ucc1is);
		ownerPhoto.setUcc2(ucc2is);
		ownerPhoto.setUcc3(ucc3is);
		ownerPhoto.setUcc4(ucc4is);
		ownerPhoto.setUcc5(ucc5is);
		ownerPhoto.setForm1_front(form1_frontis);
		ownerPhoto.setForm1_back(form1_backis);
		ownerPhoto.setForm2_front(form2_frontis);
		ownerPhoto.setForm2_back(form2_backis);
		ownerPhoto.setSchrecom(partsris);
		ownerPhoto.setForm59_4(form59_4is);
		ownerPhoto.setNaing3ka_front(naing_3ka_frontis);
		ownerPhoto.setNaing3ka_back(naing_3ka_backis);
		ownerPhoto.setHtwei4_front(htwei4_frontis);
		ownerPhoto.setHtwei4_back(htwei4_backis);
		ownerPhoto.setNaing2_front(naing2_frontis);
		ownerPhoto.setNaing2_back(naing2_backis);
		ownerPhoto.setNaing4(naing4is);
		ownerPhoto.setAffidavit(affidavitis);
		ownerPhoto.setZaza_njanja_affidavit_front(zazanjanja_affidavit_frontis);
		ownerPhoto.setZaza_njanja_affidavit_back(zazanjanja_affidavit_backis);
		ownerPhoto.setOrapprove(or_approveis);
		ownerPhoto.setBirth_register(birth_registeris);
		ownerPhoto.setFamily_chart_front(family_chart_frontis);
		ownerPhoto.setFamily_chart_back(family_chart_backis);
		ownerPhoto.setOthers(othersis);	
		
		//insert owner photo record table
		try {
		result2 = OwnerRecordDB.insertPhotoRecord(ownerPhoto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result1+" "+result2);
		if(result1 == 1 && result2 == 1){
			session.setAttribute("serial_no", serial);
			session.setAttribute("role", bit);
			response.sendRedirect("FatherRegistration.jsp");
		}
		
	}

}
