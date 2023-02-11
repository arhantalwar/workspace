package com.AddUser;

import java.io.IOException;

import com.DAO.DAO;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class EmailAuthFilter implements Filter {

	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String email = req.getParameter("email");
		String authokey = req.getParameter("authokey");
		
		DAO dao = new DAO();
		
		if(dao.EmailAuthChecker(email, authokey)) {
			chain.doFilter(request, response);
		}else {
			System.out.println("SORRY YOU'RE NOT ALLOWED");
		}
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
