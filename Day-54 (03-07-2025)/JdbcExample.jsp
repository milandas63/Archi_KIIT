<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/record","root","root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM contact");
		ResultSetMetaData rsmd = rs.getMetaData();
		
		out.println("<body>");
		out.println("<table border='1'>");

		//	Header row
		out.println("<tr>");
		for(int i=1; i<=rsmd.getColumnCount(); i++) {
			out.println("<th>"+rsmd.getColumnLabel(i)+"</th>");
		}
		out.println("</tr>");
		
		// Data rows
		while(rs.next()) {
			out.println("<tr>");
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				out.println("<td>"+rs.getString(i)+"</td>");
			}
			out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("</body>");
		
		rs.close();
		stmt.close();
		conn.close();
	%>
</body>
</html>