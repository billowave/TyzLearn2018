package tyz.servlet.filters.sdefine;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class MyFilter implements Filter {

    public void init(FilterConfig arg0) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.print("过滤器调用之前<br/>");

        chain.doFilter(request, response);// sends request to next resource

        out.print("过滤器调用之后<br/>");
    }

    public void destroy() {
    }
}