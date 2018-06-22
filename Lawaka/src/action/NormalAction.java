package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NormalAction
 */
@WebServlet("/Normal")
public class NormalAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NormalAction() {
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
	//	System.out.println(name);
		session.setAttribute("role", bit);
		if(name!=null &&name.equals("အလွှာရှင်"))
			response.sendRedirect("OwnerRegistration.jsp");
		if(father!=null &&father.equals("ဖခင်"))
			response.sendRedirect("FatherRegistration.jsp");
		if(mother!=null&&mother.equals("မိခင်"))
			response.sendRedirect("MotherRegistration.jsp");
		if(fgrandfather!=null&&fgrandfather.equals("ဖဘိုး"))
			response.sendRedirect("FGrandFatherRegistration.jsp");
		if(mgrandfather!=null&&mgrandfather.equals("မိဘိုး"))
			response.sendRedirect("MGrandFatherRegistration.jsp");
		if(fgrandmother!=null&&fgrandmother.equals("ဖဘွား"))
			response.sendRedirect("FGrandMotherRegistration.jsp");
		if(mgrandmother!=null&&mgrandmother.equals("မိဘွား"))
			response.sendRedirect("MGrandMotherRegistration.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
