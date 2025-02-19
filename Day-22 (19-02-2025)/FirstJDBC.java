package com.jdbc;

// Step-1
import java.sql.*;

public class FirstJDBC {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public FirstJDBC() {
		try {
			// Step-2
			Class.forName("com.mysql.jdbc.Driver");
			
			// Step-3
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/record", "root", "root");
			
			// Step-4
			stmt = conn.createStatement();
			
			// Step-5
			rs = stmt.executeQuery("SELECT c.slno,c.name,c.gender,c.dob,c.mobile_no,l.location_desc,r.relation_desc FROM contact AS c LEFT JOIN location AS l ON c.location_id=l.location_id LEFT JOIN relation AS r ON c.relation_id=r.relation_id");

			// Step-6
			while(rs.next()) {
				System.out.println( rs.getString("slno")+" "+
									rs.getString("name")+" "+
									rs.getString("gender")+" "+
									rs.getString("dob")+" "+
									rs.getString("mobile_no")+" "+
									rs.getString("location_desc")
								  );
			}
			
			// Step-7
			rs.close();
			stmt.close();
			conn.close();
		} catch(ClassNotFoundException e) {
			System.out.println("Class not found "+e);
		} catch(SQLException e) {
			System.out.println("SQL Exception "+e);
		}
	}

	public static void main(String[] args) {
		new FirstJDBC();
	}

}
