import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//@WebServlet(urlPatterns = "/hh")
public abstract  class GenericServletExample extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)  
 throws IOException {
		 
		res.setContentType("text/html");  
		  
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>hello generic servlet</b>");  
		out.print("</body></html>");  
		  
	}

}
