package tyz.servlet.cooks.sdefine;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");  
        response.setContentType("text/html;charset=UTF-8"); 
        request.setCharacterEncoding("UTF-8");  
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("/cooks/link.html").include(request, response);

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        // �û���������ֱ�Ϊ��admin , 123456
        if (name.equals("admin") && password.equals("123456")) {
            out.print("���ѳɹ���¼ϵͳ!");
            out.print("<br>��ӭ��, " + name);
            Cookie ck = new Cookie("name", name);
            response.addCookie(ck);
        } else {
            out.print("<font style='color:red;'>�û������������!</font>");
            request.getRequestDispatcher("/cooks/login.html").include(request, response);
        }
        out.close();
    }

}