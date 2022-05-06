package com.demo.product.service;

import com.demo.product.model.ProductDetail;
import com.demo.product.view.ProductView;

public class ProductService implements ProductInterfaceService {
	
	ProductView view = new ProductView();
	@Override
	public boolean insertProduct(ProductDetail product)
	{
      int result= view.insertProduct(product);
		
		//to check whether the data has been inserted successfully
		if(result>0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}


	