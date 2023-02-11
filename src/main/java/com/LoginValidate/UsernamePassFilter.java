package com.LoginValidate;

import java.io.IOException;
import java.util.LinkedList;

import com.DAO.DAO;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UsernamePassFilter implements Filter {
	
	LinkedList<String> FirstName = new LinkedList<String>();

	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String username_login = req.getParameter("username_login");
		String password_login = req.getParameter("password_login");
		
		DAO dao = new DAO();
		
		if(dao.LoginUsernamePasswordChecker(username_login, password_login)) {
			
			HttpSession session = req.getSession();
			session.setAttribute("username_login", username_login);
			
			dao.state_online(username_login);
			
			System.out.println("LOGIN : " + username_login);
			
			
			for(int i = 0; i<FirstName.size(); i++) {
				
				System.out.println(FirstName.get(i));
				
			}
			
			
			chain.doFilter(request, response);
		}else {
			System.out.println("Please Sign Up First");
		}
		
		
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
