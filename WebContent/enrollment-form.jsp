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
		<%@ include file="header.jsp"%>
		
		<h1 align="center">Enrollment Form!!</h1>
		<h2>Java</h2>


		<form action="java" method="GET">
			<div class="form-group">
				<label for="exampleInputEmail1">Full Name</label> <input
					type="name" name="traineeName" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp"
					placeholder="Enter email"> <small id="emailHelp"
					class="form-text text-muted">We'll never share your email
					with anyone else.</small>
			</div>


			<input type="submit" class="btn btn-primary">Submit</button>
		</form>


		<h2>PHP</h2>


		<form action="php" method="GET">
			<div class="form-group">
				<label for="exampleInputEmail1">Full Name</label> <input
					type="name" name="traineeName" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp"
					placeholder="Enter email"> <small id="emailHelp"
					class="form-text text-muted">We'll never share your email
					with anyone else.</small>
			</div>


			<input type="submit" class="btn btn-primary">Submit</button>
		</form>




		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>