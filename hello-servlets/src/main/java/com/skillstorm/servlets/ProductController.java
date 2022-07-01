package com.skillstorm.servlets;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skillstorm.data.FakeProductDAO;
import com.skillstorm.models.Product;

// Controller - glues the model to the view
@WebServlet(urlPatterns = "/products")
public class ProductController extends HttpServlet {
	
	private FakeProductDAO dao = new FakeProductDAO(); 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(dao.findAll());
		resp.getWriter().println(json);
		// Content Negotiation
		// Content-Type
		resp.setContentType("application/json");   // text/html   text/plain   application/xml   image/jpeg
		//resp.getWriter().print(new ObjectMapper().writeValueAsString(dao.findAll()));
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// HTTP request body
		InputStream requestBody = req.getInputStream();
		ObjectMapper objectMapper = new ObjectMapper();
		// take inputStream / convert it into a Product object 
		//   { "id" : 1, "name": "Pickles", "price": 3.50  }
		Product product = objectMapper.readValue(requestBody, Product.class); 
		dao.add(product);
		System.out.println("Added Product: " + product);
		System.out.println("Changed");
		// 200 OK   (default)  200 
		// 201 CREATED  (POST is unsafe)   (GET is safe)    DELETE  (is unsafe)
		resp.setStatus(201); // resp is committed
		
		//dao.add(new ObjectMapper().readValue(req.getInputStream(), Product.class));
	}
	
}
