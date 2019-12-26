import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletConfig;
public class servlet3 extends HttpServlet
{
	public void init()throws ServletException
	{
	}

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String u1=req.getParameter("unm");
		ServletConfig config=getServletConfig();
		String c=config.getInitParameter("color");
		out.println(c);

		out.println("<html><body style='background-color:"+c+"'>"+u1+"</body></html>");

	}

	   public void destroy()
	   {
   		}
}

