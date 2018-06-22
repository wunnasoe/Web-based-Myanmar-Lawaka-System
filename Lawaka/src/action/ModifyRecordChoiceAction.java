package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ModifyRecordChoiceAction
 */
@WebServlet("/ModifyRecordChoice")
public class ModifyRecordChoiceAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyRecordChoiceAction() {
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
		String serial_no = (String)session.getAttribute("serial_no");
		System.out.println(serial_no+" in ModifyRecordChice");
		String name = request.getParameter("owner");
		String father = request.getParameter("father");
		String mother = request.getParameter("mother");
		String fgrandfather = request.getParameter("fgrandfather");
		String mgrandfather = request.getParameter("mgrandfather");
		String fgrandmother = request.getParameter("fgrandmother");
		String mgrandmother = request.getParameter("mgrandmother");
		if(name!=null &&name.equals("အလွှာရှင်")){
			session.setAttribute("serial_no", serial_no);
			response.sendRedirect("ModifyOwner.jsp");
		}
		if(father!=null &&father.equals("ဖခင်")){
			session.setAttribute("serial_no", serial_no);
			response.sendRedirect("ModifyFather.jsp");
		}
		if(mother!=null&&mother.equals("မိခင်")){
			session.setAttribute("serial_no", serial_no);
			response.sendRedirect("ModifyMother.jsp");
			}
		if(fgrandfather!=null&&fgrandfather.equals("ဖဘိုး")){
			session.setAttribute("serial_no", serial_no);
			response.sendRedirect("ModifyFGFather.jsp");
		}
		if(mgrandfather!=null&&mgrandfather.equals("မိဘိုး")){
			session.setAttribute("serial_no", serial_no);
			response.sendRedirect("ModifyMGFather.jsp");
		}
		if(fgrandmother!=null&&fgrandmother.equals("ဖဘွား")){
			session.setAttribute("serial_no", serial_no);
			response.sendRedirect("ModifyFGMother.jsp");
		}
		if(mgrandmother!=null&&mgrandmother.equals("မိဘွား")){
			session.setAttribute("serial_no", serial_no);
			response.sendRedirect("ModifyMGMother.jsp");
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
