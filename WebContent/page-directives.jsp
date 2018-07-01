<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page errorPage="default-error-page.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page Directives</title>
</head>
<body>
	<div class="container">
		<%@ include file="header.jsp"%>

		<!-- import page directive example -->
		<%
			List<String> fruites = new ArrayList<>();
			fruites.add("Apple");
			fruites.add("Guava");
			fruites.add("Grapes");
			fruites.add("Pine Apple");
			fruites.add("Banana");
			for (int i = 0; i < fruites.size(); i++) {
				%>&nbsp;&nbsp;<%
				
				
				out.print(fruites.get(i));
			}
		%>
		
		<!-- errorPage and isErrorPage  -->
<%
int i = 10/0;
%>



		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>