package tyz.servlet.filters.sdefine;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAttr
 */

public class ServletAttr extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            ServletContext context = getServletContext();
            context.setAttribute("company", "TyzLenovo");
            out.println("Welcome to first servlet");
            out.println("在第二个Servlet<a href='servletatt2'>查看属性值</a>");
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}