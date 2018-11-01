package tyz.servlet.cooks.sdefine;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionWayProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("/cooks/SessionWaylink.html").include(request, response);

        HttpSession session = request.getSession(false);
        if (session != null) {
            String name = (String) session.getAttribute("username");
            String nickname = (String) session.getAttribute("nickname");
            String age = (String) session.getAttribute("age");
            out.print("您好, " + name + " 欢迎您来到个人信息中心！");
            out.print("<hr/>个人信息如下, 昵称：" + nickname + " ，年龄："+age);
        } else {
            out.print("请登录系统！");
            request.getRequestDispatcher("/cooks/SessionWaylogin.html").include(request, response);
        }
        out.close();

    }
}