package com.logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Contact extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String slno = req.getParameter("slno");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String dob = req.getParameter("dob");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String location = req.getParameter("location");
		String relation = req.getParameter("relation");
		
		PrintWriter out = resp.getWriter();
		out.println(slno);
		out.println(name);
		out.println(gender);
		out.println(dob);
		out.println(email);
		out.println(phone);
		out.println(location);
		out.println(relation);
	}
}
