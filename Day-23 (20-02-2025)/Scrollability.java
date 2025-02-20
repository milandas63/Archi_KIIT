package com.jdbc;

import java.sql.*;

public class Scrollability {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;
	
	public Scrollability() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/record","root","root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM contact");
			rsmd = rs.getMetaData();

			int type;
			rs.afterLast();
			System.out.println("BOTTOM TO TOP");
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(padR(rsmd.getColumnLabel(i),rsmd.getColumnDisplaySize(i))+"  ");
			}
			while(rs.previous()) {
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					type = rsmd.getColumnType(i);
					switch(type) {
					case Types.BIT:
						System.out.print(padL(String.valueOf(rs.getInt(i)),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					case Types.INTEGER:
						System.out.print(padL(String.valueOf(rs.getInt(i)),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					case Types.VARCHAR:
						System.out.print(padR(rs.getString(i),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					case Types.BIGINT:
						System.out.print(padL(String.valueOf(rs.getInt(i)),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					case Types.DATE:
						System.out.print(padL(String.valueOf(rs.getDate(i)),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					case Types.CHAR:
						System.out.print(padR(rs.getString(i),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					default:
						System.out.print(padR(rs.getString(i),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					}
				}
				System.out.println();
			}

			System.out.println("TOP TO BOTTOM");
			while(rs.next()) {
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					type = rsmd.getColumnType(i);
					switch(type) {
					case Types.BIT:
						System.out.print(padL(String.valueOf(rs.getInt(i)),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					case Types.INTEGER:
						System.out.print(padL(String.valueOf(rs.getInt(i)),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					case Types.VARCHAR:
						System.out.print(padR(rs.getString(i),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					case Types.BIGINT:
						System.out.print(padL(String.valueOf(rs.getInt(i)),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					case Types.DATE:
						System.out.print(padL(String.valueOf(rs.getDate(i)),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					case Types.CHAR:
						System.out.print(padR(rs.getString(i),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					default:
						System.out.print(padR(rs.getString(i),rsmd.getColumnDisplaySize(i))+"  ");
						break;
					}
				}
				System.out.println();
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	private String padL(String data, int width) {
		String buf = data;
		for(int i=data.length(); i<width; i++) {
			buf = " "+buf;
		}
		return buf;
	}

	private String padR(String data, int width) {
		String buf = data;
		for(int i=data.length(); i<width; i++) {
			buf = buf+" ";
		}
		return buf;
	}

	private String replicate(String data, int width) {
		String buf = "";
		for(int i=0; i<width; i++) buf = buf+data;
		return buf;
	}

	public static void main(String[] args) {
		new Scrollability();
	}

}
