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

/**
 * Servlet implementation class AdminAction
 */
@WebServlet("/Store")
public class AdminAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminAction() {
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
		String name = request.getParameter("owner");
		String father = request.getParameter("father");
		String mother = request.getParameter("mother");
		String fgrandfather = request.getParameter("fgrandfather");
		String mgrandfather = request.getParameter("mgrandfather");
		String fgrandmother = request.getParameter("fgrandmother");
		String mgrandmother = request.getParameter("mgrandmother");
		HttpSession session = request.getSession();
		Boolean bit = (Boolean)session.getAttribute("role");
		int noOfuser=0;
		try {
			noOfuser = OwnerRecordDB.countOwnerRecord();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	System.out.println(name);
		if(name!=null &&name.equals("အလွှာရှင်")){
			session.setAttribute("role", bit);
			session.setAttribute("userCount", noOfuser);;
			response.sendRedirect("OwnerRegistration.jsp");			
		}
		if(father!=null &&father.equals("ဖခင်")){
			session.setAttribute("role", bit);
			response.sendRedirect("FatherRegistration.jsp");
		}
		if(mother!=null&&mother.equals("မိခင်")){
			session.setAttribute("role", bit);
			response.sendRedirect("MotherRegistration.jsp");
			}
		if(fgrandfather!=null&&fgrandfather.equals("ဖဘိုး")){
			session.setAttribute("role", bit);
			response.sendRedirect("FGrandFatherRegistration.jsp");
		}
		if(mgrandfather!=null&&mgrandfather.equals("မိဘိုး")){
			session.setAttribute("role", bit);
			response.sendRedirect("MGrandFatherRegistration.jsp");
		}
		if(fgrandmother!=null&&fgrandmother.equals("ဖဘွား")){
			session.setAttribute("role", bit);
			response.sendRedirect("FGrandMotherRegistration.jsp");
		}
		if(mgrandmother!=null&&mgrandmother.equals("မိဘွား")){
			session.setAttribute("role", bit);
			response.sendRedirect("MGrandMotherRegistration.jsp");
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
