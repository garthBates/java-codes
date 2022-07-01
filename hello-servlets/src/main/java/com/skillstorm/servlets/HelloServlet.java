package com.skillstorm.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//   /hello
//   /doWork
//   /customers
// Map a URL to the Servlet ('listening' for requests to that URL)
//   WEB-INF/web.xml  (deployment descriptor) telling Tomcat all about your Java app
// WEB-INF/web.xml replaced by @WebServlet (and others)
@WebServlet(urlPatterns = "/my-servlet") // Tomcat container will forward all HTTP requests with url /my-servlet
public class HelloServlet extends HttpServlet { // IS-A servlet

	// Http Request
	// GET /my-servlet v1.0
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// incoming HTTP request
		// process it
		// outgoing HTTP response
		System.out.println("I'm in Java");
		resp.getWriter().append("Hello, client"); // writes data to the HTTP response BODY
	}

	// POST /my-servlet v1.0
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("pickle"));
		//resp.sendRedirect("success.html"); // directs client browser to another page
		req.getRequestDispatcher("success.html").forward(req, resp); // forwards server-side
	}

	// PUT - update
	// DELETE - delete
	
}
