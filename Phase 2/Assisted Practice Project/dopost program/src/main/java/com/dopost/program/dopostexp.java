package com.dopost.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/post")
public class dopostexp  extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		PrintWriter out=res.getWriter();
		out.print("username"+username);
		out.print("password"+password);

	}

}
