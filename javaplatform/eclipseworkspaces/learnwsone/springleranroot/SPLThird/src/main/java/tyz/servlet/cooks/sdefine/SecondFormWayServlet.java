package tyz.servlet.cooks.sdefine;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondFormWayServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

            // Getting the value from the hidden field
            String n = request.getParameter("username");
            out.print("Hello " + n);

            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}