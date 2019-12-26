import java.io.*;
import javax.servlet.*;
public class servlet1 implements Servlet
{
	ServletConfig config=null;

	public void init(ServletConfig config)
	{
		this.config=config;
		System.out.println("servlet is initialized...");
	}
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello world</b>");
		out.print("</body></html>");
	}
	public void destroy()
	{
		System.out.println("servlet is destroyed...");
	}
	public ServletConfig getServletConfig()
	{
			return config;
	}
	public String getServletInfo()
	{
		return "copyright 2007-2010";
	}



}