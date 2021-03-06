package tyz.servlet.cooks.sdefine;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstCooksServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String name = request.getParameter("username");
            String username = new String(name.getBytes("ISO-8859-1"),"utf-8");

            out.print("<!DOCTYPE html>\r\n" + 
                    "<html>\r\n" + 
                    "<head>\r\n" + 
                    "<meta charset=\"UTF-8\"><body>");
            out.print("欢迎您, " + username);

            Cookie ck = new Cookie("uname", username);// creating cookie object
            response.addCookie(ck);// adding cookie in the response

            // creating submit button

            out.print("<form action='servlet2' method='post'>");
            out.print("<p>Cookies已在浏览器中设置，现在跳转到第二个Servlet中读取Cookies的值。</p>");
            out.print("<input type='submit' value='提交到第二个Servlet'>");
            out.print("</form>");

            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}