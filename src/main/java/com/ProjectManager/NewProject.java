package com.ProjectManager;

import java.io.IOException;

import com.DirectoryManager.DirectoryCreator;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/NewProject")
public class NewProject extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username_login");
		
		DirectoryCreator dc = new DirectoryCreator();
		dc.MakeDir(username);
		
		response.sendRedirect("Workspace.jsp");
		
		
	}
	
}
