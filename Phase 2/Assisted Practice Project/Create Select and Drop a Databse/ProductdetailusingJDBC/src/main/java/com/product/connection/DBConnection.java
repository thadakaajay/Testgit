package com.product.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private Connection connection;
	public DBConnection(String url,String username,String password) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.jdbc.Driver");
		connection= DriverManager.getConnection(url,username,password);
	}
	public Connection getConnection() {
		return this.connection;
	}
	
	public void closeConnection() throws SQLException {
		if(this.connection!=null)
		{
			this.connection.close();
		}
	}
}
