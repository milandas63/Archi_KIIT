<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int start_no = Integer.parseInt(request.getParameter("start"));
	int end_no = Integer.parseInt(request.getParameter("end"));
	int count = 0;
	
	out.println("<html>");
	out.println("<body>");
	out.println("<table border='1'>");
	out.println("<tr>");
	for(int i=start_no; i<=end_no; i++) {
		for(int k=i; k<(i+8); k+=8) {
			out.println("<td>");
			out.println("<table>");
			for(int j=1; j<=10; j++) {
				out.println("<tr>");
				out.println("<td align='right'>"+k+"</td>");
				out.println("<td align='center'>x</td>");
				out.println("<td align='right'>"+j+"</td>");
				out.println("<td align='center'>=</td>");
				out.println("<td align='right'>"+(k*j)+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("</td>");
			count++;
			if(count>=8) {
				out.println("</tr>");
				out.println("<tr>");
				count = 0;
			}
		}
	}
	out.println("</tr>");
	out.println("</table>");
	out.println("</body>");
	out.println("</html>");
	%>
</body>
</html>