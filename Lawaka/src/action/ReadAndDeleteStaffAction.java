package action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Database.RetrieveRecords;
import form.UserForm;

/**
 * Servlet implementation class ReadAndDeleteStaffAction
 */
@WebServlet("/ReadAndDeleteStaff")
public class ReadAndDeleteStaffAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadAndDeleteStaffAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		
		 String btnDelete = request.getParameter("DeleteStaff");
		 String btnRead = request.getParameter("ReadStaff");
		System.out.println(btnRead+","+btnDelete);
		if(btnRead!=null && btnRead.equals("မှတ်တမ်းသွင်းဝန်းထမ်းစာရင်းကြည့်ရန်")){
			HttpSession session = request.getSession();
			ArrayList<UserForm> userList = new ArrayList<UserForm>();
			try {				
				userList = RetrieveRecords.retrieveAllUser();
				System.out.println(userList.size());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			session.setAttribute("userList", userList);
			response.sendRedirect("ReadStaff.jsp");
		}
		else if(btnDelete!=null&& btnDelete.equals("မှတ်တမ်းသွင်းဝန်းထမ်း ဖျက်ရန်"))
		      response.sendRedirect("DeleteStaff.jsp");   
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
