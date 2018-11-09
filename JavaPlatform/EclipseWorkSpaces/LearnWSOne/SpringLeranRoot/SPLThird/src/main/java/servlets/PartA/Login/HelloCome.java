package servlets.PartA.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Welcome
 */

public class HelloCome extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    	/*
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String c = request.getParameter("select");
        if(c.equals("yes"))
            out.print("Welcome!");
        else
            out.print("I don't like you!");*/
    	PrintWriter out = response.getWriter();
    	out.print("I don't like you!");
    	out.print("I don't like you!");
    	System.out.println("成功****");
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO 自动生成的方法存根
    	super.doGet(req, resp);
    	
    	System.out.println("+++++ 成功    doget****");
    }
    
    public void Out(HttpServletResponse response) throws IOException
    {
    	PrintWriter out = response.getWriter();
    	out.print("I don't like you 1!");
    	out.print("I don't like you! +666");
    	System.out.println("hellocome out 成功");
    }

}