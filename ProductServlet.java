package com.demo.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.product.model.ProductDetail;
import com.demo.product.service.ProductService;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductService service=new ProductService();
		ProductDetail product=new ProductDetail (request.getParameter("productName"),
				Integer.parseInt(request.getParameter("productPrice")),
				Integer.parseInt(request.getParameter("productQuantity")));
		PrintWriter out=response.getWriter();
		
		boolean flag=service.insertProduct(product);
		
		if(flag)
		{
			out.print("product Inserted Successfully");
		}
		else {
			out.print("UnSuccessfully");
		}
	}

	}

