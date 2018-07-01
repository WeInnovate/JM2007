<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Registration Page</title>
</head>
<body>
	<div class="container">

<%@ include file="header.jsp"%>








		<h1 align="center">Registration Page!!</h1>
		<form action="process-registration.jsp" method="post">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Name</label> <input type="text" name="name"
						class="form-control" id="inputEmail4" placeholder="Full Name">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Password</label> <input type="password" name="pass"
						class="form-control" id="inputPassword4" placeholder="Password">
				</div>
				<div class="form-group col-md-6">
					<label for="inputEmail4">Email</label> <input type="email" name="email"
						class="form-control" id="inputEmail4" placeholder="Email">
				</div>
				<div class="form-group col-md-6">
					<label for="inputEmail4">Number</label> <input type="number" name="mobile"
						class="form-control" id="inputEmail4" placeholder="Email">
				</div>
			</div>
			<div class="form-group">
				<label for="inputAddress">Address</label> <input type="text" name="address"
					class="form-control" id="inputAddress" placeholder="1234 Main St">
			</div>
			<div class="form-group">
				<label for="inputAddress2">Address 2</label> <input type="text" name="address2"
					class="form-control" id="inputAddress2"
					placeholder="Apartment, studio, or floor">
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputCity">City</label> <input type="text" name="city"
						class="form-control" id="inputCity">
				</div>
				<div class="form-group col-md-4">
					<label for="inputState">State</label> <select id="inputState" name="state"
						class="form-control">
						<option selected>Choose...</option>
						<option value="Karnataka">Karnataka</option>
					</select>
				</div>
				<div class="form-group col-md-2">
					<label for="inputZip">Zip</label> <input type="text" name="zip"
						class="form-control" id="inputZip">
				</div>
			</div>

			<div class="form-group col-md-6">
				<label for="inputZip">Gender</label> <br />
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="gender"
						name="inlineRadioOptions" id="inlineRadio1" value="Male">
					<label class="form-check-label" for="inlineRadio1">Male</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="gender"
						name="inlineRadioOptions" id="inlineRadio2" value="Female">
					<label class="form-check-label" for="inlineRadio2">Female</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="gender"
						name="inlineRadioOptions" id="inlineRadio3" value="Others"
						disabled> <label class="form-check-label"
						for="inlineRadio3">Others</label>
				</div>
			</div>

			<div class="form-group col-md-6">
				<label for="inputZip">Courses</label> <br />
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="checkbox" name="courses"
						id="inlineCheckbox1" value="Core Java"> <label
						class="form-check-label" for="inlineCheckbox1">Core Java</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="checkbox" name="courses"
						id="inlineCheckbox2" value="Advance Java"> <label
						class="form-check-label" for="inlineCheckbox2">Advance
						Java</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="checkbox" name="courses"
						id="inlineCheckbox3" value="Java frameworks"> <label
						class="form-check-label" for="inlineCheckbox3">Java
						frameworks</label>
				</div>
			</div>

			<div class="form-group">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" id="gridCheck">
					<label class="form-check-label" for="gridCheck"> Check me
						out </label>
				</div>
			</div>
			
			<div class="form-group">
					Comment: <textarea rows="5" cols="100" name="comment"></textarea>
					<label class="form-check-label" for="gridCheck"> Check me
						out </label>
			</div>
			<br />
			<input type="submit" class="btn btn-primary">Register</button>
		</form>
		<%@ include file="footer.jsp"%>
	</div>
</body>

</html>