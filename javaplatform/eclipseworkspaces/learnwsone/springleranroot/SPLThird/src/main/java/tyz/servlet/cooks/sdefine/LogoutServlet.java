package tyz.servlet.cooks.sdefine;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");  
        response.setContentType("text/html;charset=UTF-8"); 
        request.setCharacterEncoding("UTF-8");  
        PrintWriter out = response.getWriter();

        request.getRequestDispatcher("/cooks/link.html").include(request, response);

        Cookie ck = new Cookie("name", "");
        ck.setMaxAge(0);
        response.addCookie(ck);

        out.print("您已成功注销!");
    }
}