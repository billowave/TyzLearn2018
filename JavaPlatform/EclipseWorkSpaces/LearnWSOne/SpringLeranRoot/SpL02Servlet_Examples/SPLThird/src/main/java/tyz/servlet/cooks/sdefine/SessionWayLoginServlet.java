package tyz.servlet.cooks.sdefine;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionWayLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("/cooks/SessionWaylink.html").include(request, response);

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username == null) {
            username = "";
        }
        if (password == null) {
            password = "";
        }

        if (username.equals("admin") && password.equals("admin123")) {
            out.print("Welcome, " + username);
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("nickname", "苏小牛");
            session.setAttribute("age", "21");
        } else {
            out.print("<font style='color:rec;'>对不起，用户名或密码错误!</font>");
            request.getRequestDispatcher("/cooks/SessionWaylogin.html").include(request, response);
        }
        out.close();
    }
}