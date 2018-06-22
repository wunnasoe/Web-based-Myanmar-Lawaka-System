package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import Database.InsertRecords;
import form.OtherRecordForm;

/**
 * Servlet implementation class FatherRecordStoreAction
 */
@WebServlet("/FatherRecordStore")
@MultipartConfig(maxFileSize = 16177216)
public class FatherRecordStoreAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FatherRecordStoreAction() {
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
		OtherRecordForm father = new OtherRecordForm();
		int result = 0;
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		String serial_no = (String)session.getAttribute("serial_no");
		Boolean bit = (Boolean)session.getAttribute("role");
		//System.out.println(serial_no+"in father record store");
		String name = request.getParameter("fatherName");
		String date_of_birth = request.getParameter("date_of_birth");
		String nrc_no = request.getParameter("nrc_no");
		String useful_law = request.getParameter("used_law");
		Part frc_front = request.getPart("frc_front");
		Part frc_back = request.getPart("frc_back");
		Part ucc1 = request.getPart("ucc1");
		Part ucc2 = request.getPart("ucc2");
		Part ucc3 = request.getPart("ucc3");
		Part ucc4 = request.getPart("ucc4");
		Part ucc5 = request.getPart("ucc5");
		Part form1_front = request.getPart("form1_front");
		Part form1_back = request.getPart("form1_back");
		Part form2_front = request.getPart("form2_front");
		Part form2_back = request.getPart("form2_back");
		Part form59_4 = request.getPart("form59_4");
		Part naing6ka_front = request.getPart("naing6ka_front");
		Part naing6ka_back = request.getPart("naing6ka_back");
		Part naing2_front = request.getPart("naing2_front");
		Part naing2_back = request.getPart("naing2_back");
		Part naing4 = request.getPart("naing4");
		Part nrc = request.getPart("nrc");
		Part eh4_4ka = request.getPart("eh4_4ka");
		Part eh2 = request.getPart("eh2");
		Part pju6_6ka = request.getPart("pju6_6ka");
		Part pju8 = request.getPart("pju8");
		Part statement = request.getPart("statement");
		Part affidavit = request.getPart("affidavit");
		Part zaza_njanja_affidavit_front = request.getPart("zaza_njanja_affidavit_front");
		Part zaza_njanja_affidavit_back = request.getPart("zaza_njanja_affidavit_back");
		Part tomb_record = request.getPart("tomb_record");
		Part others = request.getPart("others");
		System.out.println(frc_front+" Frc_front Part in FatherRecordStore");
		
		father.setOwner_sernail(serial_no);
		father.setName(name);
		father.setDate_of_birth(date_of_birth);
		father.setNrc_no(nrc_no);
		father.setUseful_law(useful_law);
		father.setFrc_front(frc_front.getInputStream());
		father.setFrc_back(frc_back.getInputStream());
		father.setUcc1(ucc1.getInputStream());
		father.setUcc2(ucc2.getInputStream());
		father.setUcc3(ucc3.getInputStream());
		father.setUcc4(ucc4.getInputStream());
		father.setUcc5(ucc5.getInputStream());
		father.setForm1_front(form1_front.getInputStream());
		father.setForm1_back(form1_back.getInputStream());
		father.setForm2_front(form2_front.getInputStream());
		father.setForm2_back(form2_back.getInputStream());
		father.setForm59_4(form59_4.getInputStream());
		father.setNaing6ka_front(naing6ka_front.getInputStream());
		father.setNaing6ka_back(naing6ka_back.getInputStream());
		father.setNaing2_front(naing2_front.getInputStream());
		father.setNaing2_back(naing2_back.getInputStream());
		father.setNaing4(naing4.getInputStream());
		father.setNrc(nrc.getInputStream());
		father.setEh4_4ka(eh4_4ka.getInputStream());
		father.setEh2(eh2.getInputStream());
		father.setPju6_6ka(pju6_6ka.getInputStream());
		father.setPju8(pju8.getInputStream());
		father.setStatement(statement.getInputStream());
		father.setAffidavit(affidavit.getInputStream());
		father.setZaza_njanja_affidavit_front(zaza_njanja_affidavit_front.getInputStream());
		father.setZaza_njanja_affidavit_back(zaza_njanja_affidavit_back.getInputStream());
		father.setTomb_record(tomb_record.getInputStream());
		father.setOthers(others.getInputStream());
		
		try {
			result = InsertRecords.insertFatherRecord(father);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		if(result==1){
			session.setAttribute("role", bit);
			session.setAttribute("serial_no", serial_no);
			response.sendRedirect("MotherRegistration.jsp");
		}
	}

}
