package com.yassine.configuration;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RequestFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
		response.addHeader("Access-Control-Allow-Headers", "x-requested-with, x-auth-token");
		response.addHeader("Access-Control-Max-Age", "2500");
		response.addHeader("Access-Control-Allow-Credentials", "true");
		
		if (request.getMethod().equals("OPTIONS")) {
			try {
				filterChain.doFilter(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			response.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE");
			response.addHeader("Access-Control-Max-Age", "2500");
			response.addHeader("Access-Control-Allow-Headers", "authorization, x-auth-token, content-type, access-control-request-headers, access-control-request-methods, accept, origin, authorization, x-requested-with");
			response.setStatus(HttpServletResponse.SC_OK);
		}
		
	}
	
}
