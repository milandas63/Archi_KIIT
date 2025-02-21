package com.jdbc;

import java.sql.*;

public class Updatablity {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;
	
	public Updatablity() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/record","root","root");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("SELECT * FROM contact");
			rsmd = rs.getMetaData();
			
			while(rs.next()) {
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					System.out.print(rs.getString(i)+"  ");
				}
				System.out.println();
			}
			
			// Modify data
			rs.absolute(4);
			rs.updateString("name", "Milan");
			rs.updateString("gender", "M");
			rs.updateString("dob", "1963-11-25");
			rs.updateString("mobile_no", "7978168568");
			rs.updateString("email_id", "milandas63@gmail.com");
			rs.updateRow();
			

			// Delete row
			rs.absolute(3);
			rs.deleteRow();
			
			// Add New row
			rs.moveToInsertRow();
			rs.updateString("name", "ARCHI");
			rs.updateString("gender", "F");
			rs.updateString("dob", "2004-11-25");
			rs.updateString("mobile_no", "9778911223");
			rs.updateString("email_id", "archi@gmail.com");
			rs.updateString("location_id", "5");
			rs.updateString("relation_id", "2");
			rs.insertRow();
			rs.moveToCurrentRow();
			
			rs.beforeFirst();
			while(rs.next()) {
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					System.out.print(rs.getString(i)+"  ");
				}
				System.out.println();
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		} catch(SQLException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new Updatablity();
	}

}
