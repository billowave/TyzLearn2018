package tyz.servlet.cooks.sdefine;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        PrintWriter out = response.getWriter();

        request.getRequestDispatcher("/cooks/link.html").include(request, response);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        Cookie ck[] = request.getCookies();
        if (ck != null) {
            String name = ck[0].getValue();
            if (!name.equals("") || name != null) {
                out.print("<b>��ӭ������������Ϣ����</b>");
                out.print("<br>����, " + name);
            }
        } else {
            out.print("<font style='color:red;'>���ȵ�¼!</font>");
            request.getRequestDispatcher("/cooks/login.html").include(request, response);
        }
        out.close();
    }
}