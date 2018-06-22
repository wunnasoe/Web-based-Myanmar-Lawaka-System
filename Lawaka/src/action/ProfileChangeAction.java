package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Database.UpdateOtherRecords;

/**
 * Servlet implementation class ProfileChangeAction
 */
@WebServlet("/ProfileChange")
public class ProfileChangeAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileChangeAction() {
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
		HttpSession session = request.getSession();
		int no =(int) session.getAttribute("user_no");
		Boolean bit = (Boolean)session.getAttribute("role");
		String changename = new String();
		String changepwd = new String();
		//String changecpwd = new String();
		changename = request.getParameter("name");
		changepwd = request.getParameter("password");
		
	    	try {
	    		if(changename.equals("")){
				UpdateOtherRecords.userPassword_Update(no, changepwd);
	    		}
	    		else if(changepwd.equals("")){
	    			UpdateOtherRecords.userName_Update(no, changename);
	    			
	    		}else{
	    			UpdateOtherRecords.userPassword_Update(no, changepwd);
	    			UpdateOtherRecords.userName_Update(no, changename);
	    		}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	session.setAttribute("role", bit);
	    	response.sendRedirect("SuccessProfileChange.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
