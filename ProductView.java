package com.demo.product.view;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.demo.product.connection.DBConnection;
import com.demo.product.model.ProductDetail;

public class ProductView implements ProductViewInterface {
	String query=null;
	Connection conn=new DBConnection().getConnection();
	int result=0;
	@Override
	public int insertProduct(ProductDetail product) 
	{
		try
		{
		//insert query
		 query="insert into product(productName,productPrice,productQuantity) values(?,?,?);";
		 PreparedStatement statement=conn.prepareStatement(query);
		 statement.setString(1,product.getProductName());
		 statement.setInt(2,product.getProductPrice());
		 statement.setInt(3, product.getProductQuantity());
		 result=statement.executeUpdate();
		 return result;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}


}
