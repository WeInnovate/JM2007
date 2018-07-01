<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
	
	<%@ include file="header.jsp" %>

	<hr />
	<h1 align="center">Welcome Home!!</h1>
	<h2>Servlets</h2>
	<ul>
	<li><a href="hello?email=a@a.com">Hello Servlet</a></li>
	
	<li>
	
	<form action="hello" method="POST">
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" name="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email"> <small
					id="emailHelp" class="form-text text-muted">We'll never
					share your email with anyone else.</small>
			</div>
			
			
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	
	
	</li>
	</ul>
	<h1>Greet Me</h1>
	<form action="greet-me.jsp">
		<input type="text" name="name"> <input type="submit"
			value="Greet Me!">
	</form>
<%@ include file="footer.jsp" %>	</div>
</body>
</html>