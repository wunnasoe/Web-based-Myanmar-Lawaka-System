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
 * Servlet implementation class MotherRecordStoreAction
 */
@WebServlet("/MotherRecordStore")
@MultipartConfig(maxFileSize = 16177216)
public class MotherRecordStoreAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MotherRecordStoreAction() {
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
		OtherRecordForm mother = new OtherRecordForm();
		int result = 0;
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		String serial_no = (String)session.getAttribute("serial_no");
		Boolean bit = (Boolean)session.getAttribute("role");
		String name = request.getParameter("motherName");
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
		
		mother.setOwner_sernail(serial_no);
		mother.setName(name);
		mother.setDate_of_birth(date_of_birth);
		mother.setNrc_no(nrc_no);
		mother.setUseful_law(useful_law);
		mother.setFrc_front(frc_front.getInputStream());
		mother.setFrc_back(frc_back.getInputStream());
		mother.setUcc1(ucc1.getInputStream());
		mother.setUcc2(ucc2.getInputStream());
		mother.setUcc3(ucc3.getInputStream());
		mother.setUcc4(ucc4.getInputStream());
		mother.setUcc5(ucc5.getInputStream());
		mother.setForm1_front(form1_front.getInputStream());
		mother.setForm1_back(form1_back.getInputStream());
		mother.setForm2_front(form2_front.getInputStream());
		mother.setForm2_back(form2_back.getInputStream());
		mother.setForm59_4(form59_4.getInputStream());
		mother.setNaing6ka_front(naing6ka_front.getInputStream());
		mother.setNaing6ka_back(naing6ka_back.getInputStream());
		mother.setNaing2_front(naing2_front.getInputStream());
		mother.setNaing2_back(naing2_back.getInputStream());
		mother.setNaing4(naing4.getInputStream());
		mother.setNrc(nrc.getInputStream());
		mother.setEh4_4ka(eh4_4ka.getInputStream());
		mother.setEh2(eh2.getInputStream());
		mother.setPju6_6ka(pju6_6ka.getInputStream());
		mother.setPju8(pju8.getInputStream());
		mother.setStatement(statement.getInputStream());
		mother.setAffidavit(affidavit.getInputStream());
		mother.setZaza_njanja_affidavit_front(zaza_njanja_affidavit_front.getInputStream());
		mother.setZaza_njanja_affidavit_back(zaza_njanja_affidavit_back.getInputStream());
		mother.setTomb_record(tomb_record.getInputStream());
		mother.setOthers(others.getInputStream());
		
		try {
			result = InsertRecords.insertMotherRecord(mother);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		if(result==1){
			session.setAttribute("role", bit);
			session.setAttribute("serial_no", serial_no);
			response.sendRedirect("FGrandFatherRegistration.jsp");
		}
	}

}
