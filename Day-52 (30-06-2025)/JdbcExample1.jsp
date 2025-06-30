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

		while(rs.next()) {
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				out.print(rs.getString(i)+"\t");
			}
			out.println("<br>");
		}

		conn.close();
	%>

</body>
</html>