package tyz.servlet.filters.sdefine;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class FilterLogin implements Filter {

    public void init(FilterConfig arg0) throws ServletException {
        //
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String password = request.getParameter("password");
        if (password == null) {
            password = "";
        }

        if (password.equals("admin")) {
            chain.doFilter(request, response);// sends request to next resource
        } else {
            out.print("用户名或密码错误!");
            RequestDispatcher rd = request.getRequestDispatcher("login.html");
            rd.include(request, response);
        }
    }

    public void destroy() {
        System.out.println("MyFilter.destroy()");
    }

}