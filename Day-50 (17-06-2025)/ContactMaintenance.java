package com.jdbc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactMaintenance extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		try {
			String slno = req.getParameter("slno");
			String name = req.getParameter("name");
			String gender = req.getParameter("gender");
			String dob = req.getParameter("dob");
			String email_id = req.getParameter("email");
			String mobile_no = req.getParameter("phone");
			String location_id = req.getParameter("location");
			String relation_id = req.getParameter("relation");

			PrintWriter out = resp.getWriter();
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/record","root","root");
			pstmt = conn.prepareStatement("INSERT INTO contact VALUES(?,?,?,?,?,?,?,?)");
			pstmt.setString(1, slno);
			pstmt.setString(2, name);
			pstmt.setString(3, gender);
			pstmt.setString(4, dob);
			pstmt.setString(5, email_id);
			pstmt.setString(6, mobile_no);
			pstmt.setString(7, location_id);
			pstmt.setString(8, relation_id);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
		} catch(IOException e) {
			System.out.println(e);
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}

		
		
	}
}
