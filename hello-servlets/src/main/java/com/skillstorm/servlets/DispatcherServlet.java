package com.skillstorm.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Front Controller - 1 servlet captures ALL requests
 * forwards to one of multiple handlers
 * 
 */
// every URL	// EAGER loading 
//@WebServlet(urlPatterns = "/*", loadOnStartup = 1)
public class DispatcherServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// read the URL, based on the URL we invoke a different handler
		// baseUrl /fd/* /pd/* /ems/*
		StringBuilder requestURI = new StringBuilder(req.getRequestURI());
		requestURI.replace(0, 16, "");
		String baseURL = requestURI.substring(0, requestURI.indexOf("/"));

		System.out.println("GET " + baseURL);

		// Map the Handlers (hacky way)
		switch (baseURL) {
		case "cart": {
			new CartHandler().returnCart();
			break;
		}
		case "customer": {
			new CustomerHandler().getCustomers();
			break;
		}
		default: {
			throw new IllegalArgumentException("Handler not mapped");
		}
		}

	}

}

class CartHandler {
	// GET /cart/
	public void returnCart() {
		System.out.println("Cart handler method");
	}

}

class CustomerHandler {

	// GET /customers/
	public void getCustomers() {
		System.out.println("Customer handler method");
	}

}
