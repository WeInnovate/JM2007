<%@ page import="com.jm2007.learn.model.User"%>
<%@ page errorPage="default-error-page.jsp" %>
<%@ page isELIgnored="false" %>
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
	<div class="container">
		<%@ include file="header.jsp"%>


		<h1 align="center">Profile Page</h1>


		<table class="table">
			<tbody>
				<tr class="bg-success">

					<td>${requestScope.msg}</td>
				</tr>
			</tbody>
		</table>


<% if(((User) request.getAttribute("user")) != null){
	%>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Value</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">Name</th>
					<td>${requestScope.user.name}</td>
				</tr>
				<tr>
					<th scope="row">Email</th>
					<td>${requestScope.user.email}</td>
				</tr>
				<tr>
					<th scope="row">Mobile</th>
					<td>${requestScope.user.mobile}</td>
				</tr>
				<tr>
					<th scope="row">Gender</th>
					<td>${requestScope.user.gender}</td>
				</tr>
				<tr>
					<th scope="row">Courses</th>
					<td>
						<%
							String[] courses = ((User) request.getAttribute("user")).getCourses();
							for (int i = 0; i < courses.length; i++) {
								out.print(courses[i]); 
								%>&nbsp;<%
							}
						%>
					</td>
				</tr>
			</tbody>
		</table>
<%
} %>

${param.temp}
${paramValues.courses[0]}
<jsp:include page="footer.jsp" />
	</div>
</body>
</html>