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

import Database.OwnerRecordDB;
import form.OwnerRecordForm;

/**
 * Servlet implementation class RecordModifyAction
 */
@WebServlet("/RecordModify")
public class RecordModifyAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecordModifyAction() {
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
		String nrc = new String();
		String name = new String();
		String region = new String();
		nrc = request.getParameter("nrc");
		name = request.getParameter("ownerName");
		region = request.getParameter("region");
		//System.out.println(region);
		//System.out.println(name);
		//System.out.println(nrc);
		HttpSession s = request.getSession();
		ArrayList<OwnerRecordForm> resultList = new ArrayList<OwnerRecordForm>();
		
			try {
				if(nrc.equals("") && name.equals("") ){
					resultList = OwnerRecordDB.RetrieveOwnerByRegion(region);
					System.out.println("Retrieve by region");
				}
				else if( nrc.equals("")&&region.equals("") ){
					resultList = OwnerRecordDB.RetrieveOwnerByName(name);
					System.out.println("Retrieve by name");
				}
				else if(name.equals("")&& region.equals("") ){
					resultList = OwnerRecordDB.RetrieveOwnerByNrc(nrc);
					System.out.println("Retrieve by nrc");
				}				
				else	if(region.equals("") ){
					resultList = OwnerRecordDB.RetrieveOwnerByNameNrc(name, nrc);
					System.out.println("Retrieve by Name Nrc");
				}
				else if(name.equals("")){
					resultList = OwnerRecordDB.RetrieveOwnerByNrcRegion(nrc, region);
					System.out.println("Retrieve by Nrc Region");
				}
				else if(nrc.equals("")){
					resultList = OwnerRecordDB.RetrieveOwnerByNameRegion(name, region);
					System.out.println("Retrieve by Name Region");
				}				
				else {
					resultList = OwnerRecordDB.RetrieveOwnerByAll(name, nrc, region);
					System.out.println("Retrieve by All");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(resultList.size());
			s.setAttribute("MList", resultList);
			response.sendRedirect("ModifyResult1.jsp");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
