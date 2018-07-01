<%@ page import="com.jm2007.learn.model.User"%>
<%@ page errorPage="default-error-page.jsp" %>
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

					<td><%=request.getAttribute("msg").toString()%></td>
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
					<td><%=((User) request.getAttribute("user")).getName()%></td>
				</tr>
				<tr>
					<th scope="row">Email</th>
					<td><%=((User) request.getAttribute("user")).getEmail()%></td>
				</tr>
				<tr>
					<th scope="row">Mobile</th>
					<td><%=((User) request.getAttribute("user")).getMobile()%></td>
				</tr>
				<tr>
					<th scope="row">Gender</th>
					<td><%=((User) request.getAttribute("user")).getGender()%></td>
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

<%= request.getParameter("temp") %>
<jsp:include page="footer.jsp" />
	</div>
</body>
</html>