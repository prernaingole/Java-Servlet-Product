package com.demo.product.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
Connection con=null;
	
	public Connection getConnection()
	{
		try
		{
			//1.Load and register driver
			Class.forName("com.mysql.jdbc.Driver");
			//2.Create and assign the value to connection object
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ml", "root", "12345");
			
		}
		catch (Exception e) 
		{
				e.printStackTrace();
		}

		
		return con;
	}

}
