package com.Filterhaining.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/filter")
public class FilterChain extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		int id =Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		pw.println("welcome"+name);
	}
	
	

}
