package com.servletconfig.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfig  extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
    	
PrintWriter pw=res.getWriter();
pw.print("hi");
ServletContext ctx= getServletContext();
String str=ctx.getInitParameter("name");
        pw.print(str);
    }
}
