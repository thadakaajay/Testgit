

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("productid");
		String productname = request.getParameter("productname");
		String productcolor = request.getParameter("productcolor");
		String price = request.getParameter("productprice");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>Add operation Successful</h2><br/>");
		out.println("Added "+productcolor+" "+productname+" to the database.");
		
		int productprice = 0;
		int productid = 0;
		try {
			productprice = Integer.parseInt(id);
			productid = Integer.parseInt(id);
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperator user=root&password=Akshay@123456");
			
			Statement st = con.createStatement();
			st.executeUpdate("use product2");
			
			int res = st.executeUpdate("insert into product2.pet(productid,productname,productcolor,productprice)values('"+productid+"','"+productname+"','"+productcolor+"','"+productprice+"')");
			ResultSet rs = st.executeQuery("select * from product2.pet");
			
			ResultSetMetaData md = rs.getMetaData();
			int col = md.getColumnCount();  
			
			out.println("<br/><br/>");
			out.println("<div align='center'>"+"After adding a new product to Database" + "<br>"+"</div>");
            
            out.println("<div align='center' style='margin-top:-50%'>"+"<table border=1 width=50% height=50%>");  
            out.println("<tr><th>Product Id</th><th>Product Name</th><th>Product Color</th><th>Product Price</th><tr>");
			while (rs.next()) 
			{
				out.println("<tr>");
				for(int i = 1 ; i <= col; i++)
				{
					out.print("<td>"+rs.getString(i) +"</td>"); 
				}
				out.println("</tr>");
			  	out.println("<br><br>");
			}
			out.println("</table>"+"</div>");  
            out.println("</html></body>");
            st.close();
			con.close();
			
		}
		catch(NumberFormatException e) {
			productprice = 0;
		}
		catch(ClassNotFoundException e) {
			out.println(e);
		} catch () {
			out.println();
		}
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
