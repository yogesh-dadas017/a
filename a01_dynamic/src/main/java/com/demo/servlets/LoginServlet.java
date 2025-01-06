package com.demo.servlets;

import java.io.IOException;
import java.sql.SQLException;

import com.demo.beans.User;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		UserService userService = new UserServiceImpl();
		
		try {
			User userFound = userService.getUserByUserName(user);
			
			if(  userFound != null  && userFound.getUsername().equals(user) && userFound.getPassword().equals(pass)) {
				req.setAttribute("username", user);
				RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
				rd.forward(req, resp);
			} else {
				req.setAttribute("message","Login failed please login again, No user found");
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req, resp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
