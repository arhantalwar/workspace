package com.AddUser;

import java.io.IOException;
import java.io.PrintWriter;

import com.DAO.DAO;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		
		String email = req.getParameter("email");
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		DAO dao = new DAO();
		dao.addUserData(firstName, lastName, email, username, password);
		
		
		res.sendRedirect("login.jsp");
		
		
	}
	
}
