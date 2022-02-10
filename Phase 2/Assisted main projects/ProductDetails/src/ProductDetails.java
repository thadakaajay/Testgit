import java.io.IOException;


import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DBConnection;

/**
* Servlet implementation class ProductDetails
*/
@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	PrintWriter out = response.getWriter();
                try {
                        
                        out.println("<html><body>");
                         
                        InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
                        Properties props = new Properties();
                        //props.load(in);
                        
                        //connection information
                        DBConnection conn = new DBConnection("jdbc:mysql://localhost:3306/jdbcoperation", "root", "Ajay@123456");
                        Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                        
                        
                        ResultSet rst = stmt.executeQuery("select * from product");
                        
                        
                        String productSearch = request.getParameter("search");
                        //out.println(productSearch);
                        
                        
                        if(productSearch == null)
                        {	
	                        out.println("<div align='center'>"+"The following are the rows in the product table" + "<br>" + "<br>"+"</div>");
	                        //simple while loop to print all elements in table
//	                       
	                        out.println("<div align='center'>"+"<table border=1 width=50% height=50%>");  
	                        out.println("<tr><th>Product Id</th><th>Product Name</th><th>Product Color</th><th>Product Price</th><tr>");  
	                        while (rst.next()) 
	                        {  
	                            int id = rst.getInt("productid");  
	                            String name = rst.getString("productname");  
	                           
	                            int price = rst.getInt("productprice");
	                            out.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + price + "</td></tr>");   
	                        }  
	                        out.println("</table>"+"</div>");  
	                        out.println("</html></body>");
                        }
                        
                        else 
                        {
                        	//select the row corresponding to the id number
                        	String sql_res= "select * from product where productid=" + productSearch;
                            ResultSet inTable = stmt.executeQuery(sql_res);
                            
                            //if not empty
                            if(inTable.next()) {
                            	out.println("<div align='center'>"+"<table border=1 width=50% height=50%>");  
	                        out.println("<tr><th>Product Id</th><th>Product Name</th><th>Product Color</th><th>Product Price</th><tr>");
	                        
	                        out.println("<tr><td>" + inTable.getInt("productid") + "</td><td>" + inTable.getString("productname") +
	                        		
	                        		"</td><td>" + inTable.getString("productcolor") + "</td><td>" + inTable.getFloat("productprice") + "</td></tr>");
	                        out.println("</table>"+"</div>"); 
                            }
                            //empty
                            else 
                            	out.println("There was no element with product ID: " + productSearch + " found in the table, please try again");
                           
                        }
                    	
                        stmt.close();
                        
                        
                        
                        out.println("</body></html>");
                        conn.closeConnection();
                        
                } catch (ClassNotFoundException e) {
                	out.println(e);
                } catch (SQLException e) {
                        out.println(e);
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