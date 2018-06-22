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
import Database.UpdateOwnerRecords;

/**
 * Servlet implementation class OwnerUpdateAction
 */
@WebServlet("/OwnerUpdate")
@MultipartConfig(maxFileSize = 16177216)
public class OwnerUpdateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OwnerUpdateAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		String name = new String();
		String nrc_no = new String();
		String nation = new String();
		String birthDate = new String();
		String region = new String();
		String typeOfApply = new String();
		String usedLaw = new String();
		String gender = new String();
		String file_no = new String();
		String issuedDate = new String();
		String remark = new String();
		//Part partnrc = new Part();
		HttpSession session = request.getSession();
		String serial_no = session.getAttribute("serial_no").toString();
		name = request.getParameter("owner");
		nrc_no = request.getParameter("nrc_no");
		nation = request.getParameter("nation");
		birthDate = request.getParameter("birthDate");
		region = request.getParameter("region");
		typeOfApply = request.getParameter("typeOfApply");
		usedLaw = request.getParameter("usedLaw");
		gender = request.getParameter("gender");
		file_no = request.getParameter("file_no");
		issuedDate = request.getParameter("issuedDate");
		remark = request.getParameter("remark");
		System.out.println(serial_no+","+name+","+nrc_no+","+nation);
		System.out.println(birthDate+","+region+","+typeOfApply);
		System.out.println(usedLaw+","+gender+","+file_no);
		System.out.println(issuedDate+","+remark);
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
		System.out.println(partnrc.getSize()+","+partucc1.getSize()+", in part update");
		//System.out.println(nrcis+","+ucc1is+", in inputstream update");
			try {
				if(!name.equals("")){
				UpdateOwnerRecords.updateOwnerName(serial_no, name);
				System.out.println("Name ");
				}
				if(!nrc_no.equals("")){
					UpdateOwnerRecords.updateOwnerNrc_no(serial_no, nrc_no);
					System.out.println("Nrc ");
				}
				if(!nation.equals("")){
					UpdateOwnerRecords.updateOwnerNationality(serial_no, nation);
					System.out.println("Nation ");
				}
				if(!birthDate.equals("")){
					UpdateOwnerRecords.updateOwnerDate_of_Brith(serial_no, birthDate);
					System.out.println("birth date ");
				}
				if(!region.equals("")){
					UpdateOwnerRecords.updateOwnerRegion(serial_no, region);
					System.out.println("region ");
				}
				if(!typeOfApply.equals("")){
					UpdateOwnerRecords.updateOwnerType_of_law(serial_no, typeOfApply);
					System.out.println("type of apply ");
				}
				if(!usedLaw.equals("")){
					UpdateOwnerRecords.updateOwnerUseful_law(serial_no, usedLaw);
					System.out.println("used law ");
				}
				if(gender!=null){
					UpdateOwnerRecords.updateOwnerGender(serial_no, gender);
					System.out.println("Gender ");
				}
				if(!file_no.equals("")){
					UpdateOwnerRecords.updateOwnerFileNo(serial_no, file_no);
					System.out.println("file no ");
				}
				if(!issuedDate.equals("")){
					UpdateOwnerRecords.updateOwnerIssued_date(serial_no, issuedDate);
					System.out.println("issued date ");
				}
				if(!remark.equals("")){
					UpdateOwnerRecords.updateOwnerRemark(serial_no, remark);
					System.out.println("remark ");
				}
				int no = OwnerRecordDB.retrieveNobySerial_no(serial_no);
				if(partnrc.getSize()>0){
					InputStream nrcis = partnrc.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Nrc(no, nrcis);
				}
				if(partucc1.getSize()>0){
					InputStream ucc1is = partucc1.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_UCC1(no, ucc1is);
				}
				if(partucc2.getSize()>0){
					InputStream ucc2is = partucc2.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_UCC2(no, ucc2is);					
				}
				if(partucc3.getSize()>0){
					InputStream ucc3is = partucc3.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_UCC3(no, ucc3is);
				}
				if(partucc4.getSize()>0){
					InputStream ucc4is = partucc4.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_UCC4(no, ucc4is);
				}
				if(partucc5.getSize()>0){
					InputStream ucc5is = partucc5.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_UCC5(no, ucc5is);
				}
				if(form1_front.getSize()>0){
					InputStream form1_frontis = form1_front.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Form1_front(no, form1_frontis);
				}
				if(form1_back.getSize()>0){
					InputStream form1_backis = form1_back.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Form1_back(no, form1_backis);
				}
				if(form2_front.getSize()>0){
					InputStream form2_frontis = form2_front.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Form2_front(no, form2_frontis);
				}
				if(form2_back.getSize()>0){
					InputStream form2_backis = form2_back.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Form2_back(no, form2_backis);
				}
				if(form59_4.getSize()>0){
					InputStream form59_4is = form59_4.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Form59_4(no, form59_4is);
				}
				if(partsr.getSize()>0){
					InputStream partsris = partsr.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_School_recmd(no, partsris);
				}
				if(naing_3ka_front.getSize()>0){
					InputStream naing_3ka_frontis = naing_3ka_front.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Naing3ka_front(no, naing_3ka_frontis);
				}
				if(naing_3ka_back.getSize()>0){
					InputStream naing_3ka_backis = naing_3ka_back.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Naing3ka_back(no, naing_3ka_backis);
				}
				if(htwei4_front.getSize()>0){
					InputStream htwei4_frontis = htwei4_front.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Htwei4_front(no, htwei4_frontis);
				}
				if(htwei4_back.getSize()>0){
					InputStream htwei4_backis = htwei4_back.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Htwei4_back(no, htwei4_backis);
				}
				if(naing2_front.getSize()>0){
					InputStream naing2_frontis = naing2_front.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Naing2_front(no, naing2_frontis);
				}
				if(naing2_back.getSize()>0){
					InputStream naing2_backis = naing2_back.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Naing2_back(no, naing2_backis);
				}
				if(naing4.getSize()>0){
					InputStream naing4is = naing4.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Naing4(no, naing4is);
				}
				if(affidavit.getSize()>0){
					InputStream affidavitis = affidavit.getInputStream();					
					UpdateOwnerRecords.updatePhotoRecord_Affidavit(no, affidavitis);
				}
				if(zazanjanja_affidavit_front.getSize()>0){
					InputStream zazanjanja_affidavit_frontis = zazanjanja_affidavit_front.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_ZazaNjanja_front(no, zazanjanja_affidavit_frontis);
				}
				if(zazanjanja_affidavit_back.getSize()>0){
					InputStream zazanjanja_affidavit_backis = zazanjanja_affidavit_back.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_ZazaNjanja_back(no, zazanjanja_affidavit_backis);
				}
				if(or_approve.getSize()>0){
					InputStream or_approveis = or_approve.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Orapprove(no, or_approveis);
				}
				if(birth_register.getSize()>0){
					InputStream birth_registeris = birth_register.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Birth_register(no, birth_registeris);
				}
				if(family_chart_front.getSize()>0){
					InputStream family_chart_frontis = family_chart_front.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_FamilyCht_front(no, family_chart_frontis);
				}
				if(family_chart_back.getSize()>0){
					InputStream family_chart_backis = family_chart_back.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_FamilyCht_back(no, family_chart_backis);
				}
				if(others.getSize()>0){
					InputStream othersis = others.getInputStream();
					UpdateOwnerRecords.updatePhotoRecord_Other(no, othersis);
				}
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			session.setAttribute("serial_no", serial_no);
			response.sendRedirect("SuccessUpdate.jsp");		
	}

}
