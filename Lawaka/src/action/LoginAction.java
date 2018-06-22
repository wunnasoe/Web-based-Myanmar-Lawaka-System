package action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");	
		//request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("username");
		//byte[] bytes = name.getBytes(StandardCharsets.ISO_8859_1);
		//name = new String(bytes, StandardCharsets.UTF_8);
		HttpSession session = request.getSession();
		String pwd = request.getParameter("password");
		boolean flag =true;
		//PrintWriter out = response.getWriter();
		Connection conn = null;
		Statement stmt = null;
	//	String username="";
		try { 
 		  	Class.forName("com.mysql.jdbc.Driver"); 
   			conn = DriverManager.getConnection("jdbc:mysql://localhost/lawaka","root", "root"); 
   			//conn = DriverManager.getConnection("jdbc:mysql://localhost/lawaka?useUnicode=yes&characterEncoding=UTF-8","root", "root");
   			stmt = conn.createStatement();   	
  			ResultSet rs = stmt.executeQuery("select * from user where name='"+name+"' and password='"+pwd+"'");
  			int no; 									
			while(rs.next()){
				no = rs.getInt(1);
				 Boolean bit = rs.getBoolean(4);
				 System.out.println(bit);
				 flag = false;
				 if(bit){
					 session.setAttribute("role", bit);
					 session.setAttribute("user_no", no);
					 response.sendRedirect("AdminMenu.jsp");
				 }				   
				 else{
					 session.setAttribute("role", bit);
					 session.setAttribute("user_no", no);
					 response.sendRedirect("NormalMenu.jsp");	
				 }
							
			}	
			if(flag)
				response.sendRedirect("indexError.jsp");
			/*if(rs.next()==false){
				request.setAttribute("Login Error", "User name or password is incorrect.");
				request.getRequestDispatcher("/index.jsp").forward(request, response);
				return;
			}*/
	}				
		catch (SQLException e) {   e.printStackTrace();   } 
		catch (ClassNotFoundException e) {     e.printStackTrace();   } 		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
