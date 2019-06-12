
package com.testapp.test1.controller;

import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;

/**
 * @date 2019-05-13
 * @author Gopikrishna Putti
 */
//@Component
public class SimpleFilter extends HttpFilter {


	private static final long serialVersionUID = -7621565394020932244L;

	protected void doFilter(HttpServletRequest request, HttpServletResponse response,
            FilterChain chain) throws IOException, ServletException {
    	
    	String method = request.getMethod();
    	if(method == null || method.isEmpty()) method = "POST";
    	System.out.println(">>> " + method );
    	if( method.equalsIgnoreCase("POST")) {
    		// do nothing.
    	} else if( method.equalsIgnoreCase("GET")) {
            super.doFilter(request, response, chain);
    	}
    }


}
