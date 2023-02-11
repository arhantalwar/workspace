package com.LoginValidate;

import java.io.IOException;
import java.io.PrintWriter;

import com.DAO.DAO;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginValidation")
public class LoginValidation extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		out.print("You're logged in");
		response.sendRedirect("home.jsp");
		
	}
	
}
