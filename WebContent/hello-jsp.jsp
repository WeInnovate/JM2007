<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World - JSP</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<%!
	int i = 50;

	int sum(int a, int b) {
		return a + b;
	}

	int sum2(int a, int b) {
		return a + b;
	}

	int sum3(int a, int b) {
		return a + b;
	}%>
	
	<%
		int result = sum(20, 20);
	%>
	<p>
		20 + 20 =
		<%=result + i%></p>

	<%
		int result2 = 100;
	%>
	
	<%
	String nm = request.getParameter("name");
	
	%>
	<%= nm %>
	
	<%= application.getInitParameter("institute") %>
</body>
</html>