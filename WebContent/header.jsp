<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<nav class="nav nav-pills nav-justified">
		<a class="nav-link active disabled" href="index.jsp">Home</a> <a
			class="nav-link" href="login">Login</a> <a class="nav-link"
			href="register.jsp">Register</a> <a class="nav-link"
			href="enrollment-form.jsp">Enrollment</a> <a class="nav-link"
			href="contact-us.html">Contact Us</a> <span class="pull-right">
			<%
				String username = request.getParameter("username");

				if (username == null) {
					username = "Guest";
				}
			%> <%="Hello, " + username%></span>
	</nav>
	<hr />
</body>
</html>