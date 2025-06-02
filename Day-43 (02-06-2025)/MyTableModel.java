package com.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;

	public MyTableModel() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/record","root","root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT c.slno,c.name,c.gender,c.dob,c.mobile_no,l.location_desc,r.relation_desc FROM contact AS c LEFT JOIN location AS l ON c.location_id=l.location_id LEFT JOIN relation AS r ON c.relation_id=r.relation_id");
			rsmd = rs.getMetaData();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public int getColumnCount() {
		int cols = 0;
		try {
			cols = rsmd.getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cols;
	}

	@Override
	public int getRowCount() {
		int rows = 0;
		int n = 0;
		try {
			if(rs.isBeforeFirst()) {
				rs.first();
				n = 1;
			} else if(rs.isAfterLast()) {
				rs.last();
				n = rs.getRow();
			}
			rs.last();
			rows = rs.getRow();
			rs.absolute(n);
		} catch(SQLException e) {
			
		}
		return rows;
	}

	@Override
	public Object getValueAt(int row, int col) {
		Object data = null;
		try {
			rs.absolute(row);
			data = rs.getObject(col);
		} catch(SQLException e) {
			
		}
		return data;
	}
}
