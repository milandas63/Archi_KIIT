<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<% int start = 2; %>
	<% int end = 25; %>
	<% int count = 0; %>

	<table border='1'>
	<tr>
		<% for(int i=start; i<=end; i++) { %>
		<td>
			<table>
				<% for(int j=1; j<=10; j++) { %>
				<tr>
					<td align='right'><%=i%></td>
					<td align='center'>x</td>
					<td align='right'><%=j%></td>
					<td align='center'>=</td>
					<td align='right'><%=(i*j)%></td>
				</tr>
				<% } %>
			</table>
			<% count++; %>
			<% if(count>=10) { %>
				</tr><tr>
				<% count = 0; %>
			<% } %>
		</td>
		<% } %>
	</tr>
	</table>
</body>
</html>