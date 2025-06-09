package com.logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeNo extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		int count = 0;
		int start = Integer.parseInt(req.getParameter("from"));
		int end = Integer.parseInt(req.getParameter("upto"));
		
		try {
			PrintWriter out = resp.getWriter();
			out.println("<body>");
			out.println("<h1>Prime Number Generator</h1>");
			out.println("<hr><br>");
			out.println("<table>");
			out.println("<tr>");
			out.println("<td>");
			out.println("<table>");
			out.println("<tr>");

			boolean yn;
			for(int i=start; i<=end; i++) {
				yn = true;
				for(int j=2; j<i; j++) {
					if(i%2==0) {
						yn = false;
						break;
					}
				}
				if(yn) {
					out.println("<td>"+i+"</td>");
					count++;
					if(count>=15) {
						count = 0;
						out.println("</tr>");
						out.println("<tr>");
					}
				}
			}
			out.println("</tr>");
			out.println("</table>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("</body>");
		} catch(IOException e) {
			
		}
	}
}
