package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Database.OwnerRecordDB;
import Database.RetrieveRecords;
import form.OtherRecordForm;
import form.OwnerRecordForm;
import form.PhotoRecordForm;

/**
 * Servlet implementation class SearchDetailAction
 */
@WebServlet("/SearchDetail")
public class SearchDetailAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchDetailAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String serial_no = request.getParameter("serial_no");
		System.out.println(serial_no);
		HttpSession session = request.getSession();
		Boolean role = (Boolean)session.getAttribute("role");
		if(role){
		OwnerRecordForm owner = new OwnerRecordForm();
		PhotoRecordForm photo_record = new PhotoRecordForm();
		OtherRecordForm father =new OtherRecordForm();
		OtherRecordForm mother =new OtherRecordForm();
		OtherRecordForm fgrandfather = new OtherRecordForm();
		OtherRecordForm fgrandmother = new OtherRecordForm();
		OtherRecordForm mgrandfather= new OtherRecordForm();
		OtherRecordForm mgrandmother = new OtherRecordForm();
		try {
			owner = OwnerRecordDB.retrieveOwnerBySerial(serial_no);
			int no = OwnerRecordDB.retrieveNobySerial_no(serial_no);
			System.out.println(no);
			photo_record = OwnerRecordDB.retrievePhotoRecordbyNo(no);
			father = RetrieveRecords.retrieveFatherRecord(serial_no);
			mother = RetrieveRecords.retrieveMotherRecord(serial_no);
			fgrandfather = RetrieveRecords.retrieveFGrandFatherRecord(serial_no);
			fgrandmother = RetrieveRecords.retrieveFGrandMotherRecord(serial_no);
			mgrandfather = RetrieveRecords.retrieveMGrandFatherRecord(serial_no);
			mgrandmother = RetrieveRecords.retrieveMGrandMotherRecord(serial_no);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setAttribute("owner", owner);
		session.setAttribute("photo", photo_record);
		session.setAttribute("father", father);
		session.setAttribute("mother", mother);
		session.setAttribute("fgrandfather", fgrandfather);
		session.setAttribute("fgrandmother", fgrandmother);
		session.setAttribute("mgrandfather", mgrandfather);
		session.setAttribute("mgrandmother", mgrandmother);
		response.sendRedirect("SearchResult2.jsp");
		}else
		{
			response.sendRedirect("DeniedSearch.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
