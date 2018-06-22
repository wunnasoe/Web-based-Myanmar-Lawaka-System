package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.InsertRecords;
import Database.UpdateOtherRecords;

/**
 * Servlet implementation class DeleteStaffAction
 */
@WebServlet("/DeleteStaff")
public class DeleteStaffAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStaffAction() {
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
		String userNo = request.getParameter("no");
		int maxUser = 0;
		int startNo = Integer.parseInt(userNo);
		int result1 = 0,result2=0;
		try {
			maxUser = InsertRecords.userCount();
			result2 = UpdateOtherRecords.deleteUser(startNo);
			for(int i=startNo+1;i<=maxUser;i++){
				result1 = UpdateOtherRecords.userNo_Update(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		System.out.println(result1+","+result2+" in DeleteStaff");
		response.sendRedirect("SuccessStaffDelete.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
