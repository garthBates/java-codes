package com.skillstorm.servlets;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skillstorm.data.FakeProductDAO;
import com.skillstorm.models.Product;

// Controller - glues the model to the view
//@WebServlet(urlPatterns = "/products")
public class ProductController extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}

	private FakeProductDAO dao = new FakeProductDAO();

	// /products?index=0 - GET (doesn't do a body)
	// /products?price=3&name=p
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("dan", "pickles");
		resp.addCookie(cookie);
		if(req.getSession().getAttribute("addedItem") != null) {
			System.out.println(req.getSession().getAttribute("addedItem"));
		}
		String param = req.getParameter("index"); // query parameter
		ObjectMapper objectMapper = new ObjectMapper();
		String json = null;
		resp.setContentType("application/json"); // text/html text/plain application/xml image/jpeg
		if (param != null) {
			int index = Integer.parseInt(param); // could throw RuntimeException
			json = objectMapper.writeValueAsString(dao.findAll().get(index)); // return 1
		} else {
			json = objectMapper.writeValueAsString(dao.findAll()); // return all
		}
		resp.getWriter().print(json);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Java EE 7 - Jakarta EE req.getCookie("name")
		if (req.getCookies() != null) {
			for (Cookie cookie : req.getCookies()) {
				if (cookie.getName().equals("dan")) {
					System.out.println("Found cookie! " + cookie.getValue());
				}
			}
		}
		
		// HTTP request body
		InputStream requestBody = req.getInputStream();
		ObjectMapper objectMapper = new ObjectMapper();
		// take inputStream / convert it into a Product object
		// { "id" : 1, "name": "Pickles", "price": 3.50 }
		Product product = objectMapper.readValue(requestBody, Product.class);
		dao.add(product);
		req.getSession().setAttribute("addedItem", product); // tracking products YOU added
		
		// 200 OK (default) 200
		// 201 CREATED (POST is unsafe) (GET is safe) DELETE (is unsafe)
		resp.setStatus(201); // resp is committed

		// dao.add(new ObjectMapper().readValue(req.getInputStream(), Product.class));
	}

}
