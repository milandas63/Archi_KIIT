<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<%!
		public String sayHello() {
			return "Hello World!";
		}
		%>
	</head>
	<body>
		<%
		for(int i=0; i<10; i++) {
			out.println(i+" "+sayHello()+"<br>");
		}
		%>
	</body>
</html>