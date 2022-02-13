package com.product.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.connection.DBConnection;

/**
 * Servlet implementation class ListData
 */
@WebServlet("/ListData")
public class ListData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListData() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/product";
		String username = "root";
		String password = "root123";
		boolean st=false;

		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		try {
			DBConnection db=new DBConnection (url,username,password);
			Connection connection =db.getConnection();
			 
			 Statement st1= connection.createStatement();
			
			 
//			 if(true) {
ResultSet set=	 st1.executeQuery("select * from product_29 where name=16");
//		//out.println("data sucessfully feached");
//			 
	while(set.next())
			{
		int name=set.getInt("name");
			String place=set.getNString("place");
			out.println("product id"+    name+"               "+"product name"+    place+" "+"<br/>");
		out.println("data sucessfully feached");
			}
			
		st1.close();
		out.println("</body></html>");
		db.closeConnection();
		} catch (  SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
