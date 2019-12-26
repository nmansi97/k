import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletConfig;
public class servlet5 extends HttpServlet
{
	public void init()throws ServletException
	{
	}

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String u1=req.getParameter("unm");
		String pwd=req.getParameter("pwd");
		ServletContext scontext=getServletContext();
		String userName=scontext.getInitParameter("uname");
		if(userName.equals(u1))
		{
			res.sendRedirect("welcome.html");
		}
		else
		{
		out.print("<html><body>");
		out.print("<h1>username:"+u1);
		out.print("<h1>password:"+pwd);
		}
	}
	public void destroy()
	{
	}
}