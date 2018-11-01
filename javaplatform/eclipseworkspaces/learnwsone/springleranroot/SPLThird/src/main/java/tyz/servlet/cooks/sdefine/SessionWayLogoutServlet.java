package tyz.servlet.cooks.sdefine;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionWayLogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("/cooks/SessionWaylink.html").include(request, response);
        HttpSession session = request.getSession();
        // 清除数据
        session.invalidate();
        out.print("您已成功注销退出系统!");
        out.close();
    }
}