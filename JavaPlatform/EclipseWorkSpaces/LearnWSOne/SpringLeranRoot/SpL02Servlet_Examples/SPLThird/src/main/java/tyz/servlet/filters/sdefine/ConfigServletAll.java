package tyz.servlet.filters.sdefine;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigServletAll
 */
public class ConfigServletAll extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ServletConfig config = getServletConfig();
        Enumeration<String> e = config.getInitParameterNames();
        String str = "";
        while (e.hasMoreElements()) {
            str = e.nextElement();
            out.print("Name: " + str);
            out.print(" value: " + config.getInitParameter(str)+"<br/>");
        }

        out.close();
    }

}