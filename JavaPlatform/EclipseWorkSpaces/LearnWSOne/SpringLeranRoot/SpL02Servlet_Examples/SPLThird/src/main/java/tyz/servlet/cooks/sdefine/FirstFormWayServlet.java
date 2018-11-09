package tyz.servlet.cooks.sdefine;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstFormWayServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

            String n = request.getParameter("username");
            out.print("Welcome " + n);

            // creating form that have invisible textfield
            out.print("<form action='formwayservlet2' method='post'>");
            out.print("<input type='hidden' name='username' value='" + n + "'>");
            out.print("<input type='submit' value='Ìá½»'>");
            out.print("</form>");
            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}