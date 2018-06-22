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

import Database.UpdateOtherRecords;

/**
 * Servlet implementation class MGFatherUpdateAction
 */
@WebServlet("/MGFatherUpdate")
@MultipartConfig(maxFileSize = 16177216)
public class MGFatherUpdateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MGFatherUpdateAction() {
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
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		String serial_no = (String)session.getAttribute("serial_no");
		String name = request.getParameter("mgrandfatherName");
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
		try {
			if(!name.equals("")){
				UpdateOtherRecords.updateMGFather_Name(serial_no, name);
			}
			if(!date_of_birth.equals("")){
				UpdateOtherRecords.updateMGFather_DoB(serial_no, date_of_birth);
			}
			if(!nrc_no.equals("")){
				UpdateOtherRecords.updateMGFather_Nrc_no(serial_no, nrc_no);
			}
			if(!useful_law.equals("")){
				UpdateOtherRecords.updateMGFather_UsefulLaw(serial_no, useful_law);
			}
			if(frc_front.getSize()>0){
				UpdateOtherRecords.updateMGFather_Frc_front(serial_no, frc_front.getInputStream());
			}
			if(frc_back.getSize()>0){
				UpdateOtherRecords.updateMGFather_Frc_back(serial_no, frc_back.getInputStream());
			}
			if(ucc1.getSize()>0){
				UpdateOtherRecords.updateMGFather_Ucc1(serial_no, ucc1.getInputStream());
			}
			if(ucc2.getSize()>0){
				UpdateOtherRecords.updateMGFather_Ucc2(serial_no, ucc2.getInputStream());
			}
			if(ucc3.getSize()>0){
				UpdateOtherRecords.updateMGFather_Ucc3(serial_no, ucc3.getInputStream());
			}
			if(ucc4.getSize()>0){
				UpdateOtherRecords.updateMGFather_Ucc4(serial_no, ucc4.getInputStream());
			}
			if(ucc5.getSize()>0){
				UpdateOtherRecords.updateMGFather_Ucc5(serial_no, ucc5.getInputStream());
			}
			if(form1_front.getSize()>0){
				UpdateOtherRecords.updateMGFather_Form1_front(serial_no, form1_front.getInputStream());
			}
			if(form1_back.getSize()>0){
				UpdateOtherRecords.updateMGFather_Form1_back(serial_no, form1_back.getInputStream());
			}
			if(form2_front.getSize()>0){
				UpdateOtherRecords.updateMGFather_Form2_front(serial_no, form2_front.getInputStream());
			}
			if(form2_back.getSize()>0){
				UpdateOtherRecords.updateMGFather_Form2_back(serial_no, form2_back.getInputStream());
			}
			if(form59_4.getSize()>0){
				UpdateOtherRecords.updateMGFather_Form59_4(serial_no, form59_4.getInputStream());
			}
			if(naing6ka_front.getSize()>0){
				UpdateOtherRecords.updateMGFather_Naing6ka_front(serial_no, naing6ka_front.getInputStream());
			}
			if(naing6ka_back.getSize()>0){
				UpdateOtherRecords.updateMGFather_Naing6ka_back(serial_no, naing6ka_back.getInputStream());
			}
			if(naing2_front.getSize()>0){
				UpdateOtherRecords.updateMGFather_Naing2_front(serial_no, naing2_front.getInputStream());
			}
			if(naing2_back.getSize()>0){
				UpdateOtherRecords.updateMGFather_Naing2_back(serial_no, naing2_back.getInputStream());
			}
			if(naing4.getSize()>0){
				UpdateOtherRecords.updateMGFather_Naing4(serial_no, naing4.getInputStream());
			}
			if(nrc.getSize()>0){
				UpdateOtherRecords.updateMGFather_Nrc(serial_no, nrc.getInputStream());
			}
			if(eh4_4ka.getSize()>0){
				UpdateOtherRecords.updateMGFather_Eh4_4ka(serial_no, eh4_4ka.getInputStream());
			}
			if(eh2.getSize()>0){
				UpdateOtherRecords.updateMGFather_Eh2(serial_no, eh2.getInputStream());
			}
			if(pju6_6ka.getSize()>0){
				UpdateOtherRecords.updateMGFather_Pju6_6ka(serial_no, pju6_6ka.getInputStream());
			}
			if(pju8.getSize()>0){
				UpdateOtherRecords.updateMGFather_Pju8(serial_no, pju8.getInputStream());
			}
			if(statement.getSize()>0){
				UpdateOtherRecords.updateMGFather_Statement(serial_no, statement.getInputStream());
			}
			if(affidavit.getSize()>0){
				UpdateOtherRecords.updateMGFather_Affidavit(serial_no, affidavit.getInputStream());
			}
			if(zaza_njanja_affidavit_front.getSize()>0){
				UpdateOtherRecords.updateMGFather_ZazaNjanja_front(serial_no, zaza_njanja_affidavit_front.getInputStream());
			}
			if(zaza_njanja_affidavit_back.getSize()>0){
				UpdateOtherRecords.updateMGFather_ZazaNjanja_back(serial_no, zaza_njanja_affidavit_back.getInputStream());
			}
			if(tomb_record.getSize()>0){
				UpdateOtherRecords.updateMGFather_TombRecord(serial_no, tomb_record.getInputStream());
			}
			if(others.getSize()>0){
				UpdateOtherRecords.updateMGFather_Other(serial_no, others.getInputStream());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setAttribute("serial_no", serial_no);
		response.sendRedirect("SuccessUpdate.jsp");
	}

}
