package com.logic;

import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Html2Servlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		PrintWriter out;
		try {
			out = res.getWriter();
			
			String name;
			String[] value;

			out.println("<html>");
			out.println("<body>");
			out.println("<table border='1'>");
			Enumeration<String> varNames = req.getParameterNames();
			while(varNames.hasMoreElements()) {
				name = varNames.nextElement();
				value = req.getParameterValues(name);
				for(int i=0; i<value.length; i++) {
					out.println("<tr>");
					out.println("<td>"+name+"</td>");
					out.println("<td>"+value[i]+"</td>");
					out.println("</tr>");
				}
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		} catch(Exception e) {
		}
		
	}
}
