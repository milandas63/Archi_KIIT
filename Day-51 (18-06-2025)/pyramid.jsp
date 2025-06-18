<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Pyramid of astericks</h1>
		<hr>
		<tt>
		<%
		int spaces = 40;
		int stars = 1;
		for(int i=0; i<10; i++) {
			for(int j=0; j<spaces; j++) out.print("&nbsp;");
			for(int j=0; j<stars; j++)  out.print("*");
			out.println("<br>");
			spaces--; stars+=2;
		}
		%>
		</tt>
	</body>
</html>
