package com.logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mtables extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		try {
			int count = 0;
			int start = Integer.parseInt(req.getParameter("from"));
			int end = Integer.parseInt(req.getParameter("upto"));
			PrintWriter out = resp.getWriter();
			out.println("<h1>Multiplication Tables</h1>");
			out.println("<table border='1'>");
			out.println("<tr>");
			for(int i=start; i<=end; i++) {
				out.println("<td>");
				out.println("<table>");
				for(int j=1; j<=10; j++) {
					out.println("<tr>");
					out.println("<td align='right'>"+i+"</td>");
					out.println("<td align='center'>x</td>");
					out.println("<td align='right'>"+j+"</td>");
					out.println("<td align='center'>=</td>");
					out.println("<td align='right'>"+(i*j)+"</td>");
					out.println("</tr>");
				}
				out.println("</table>");
				out.println("</td>");
				count++;
				if(count>=10) {
					count = 0;
					out.println("</tr>");
					out.println("<tr>");
				}
			}
			out.println("</tr>");
			out.println("</table>");
		} catch(IOException e) {
			
		}
	}
}
