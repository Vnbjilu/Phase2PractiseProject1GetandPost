package vikas.RatanRaman;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetServlet
 */
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullName=request.getParameter("fname");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/Page.html");
		rd.include(request, response);
		
		out.print("<h1> Your Name Is Accepted via Do Get="+fullName+" </h1>");
		
	}

}
