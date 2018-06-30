<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
</head>
<body>


	<%
		String username = request.getParameter("username");

		if (username == null) {
			username = "Guest";
		}
	%>
	
	<%="Hello, " + username %>


	<hr />
</body>
</html>