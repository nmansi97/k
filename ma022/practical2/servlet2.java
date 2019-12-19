import java.io.*;
import javax.servlet.*;
public class servlet2 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("welcome");
		out.print("</body></html>");
	}
}