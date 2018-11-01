package tyz.servlet.filters.sdefine;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.print("  -- 这是一个简单的测试Servlet.<br>");
		String name = request.getParameter("name");
		out.print("  the parm name is " + name);

		Enumeration enums = request.getHeaderNames();
		while (enums.hasMoreElements()) {
			String headerName = (String) enums.nextElement();
			String headerValue = request.getHeader(headerName);
			out.print("<b>" + headerName + "</b>: ");
			out.println(headerValue + "<br/>");
		}
	}

}