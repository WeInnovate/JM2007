<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>profile</title>
</head>
<body>
<%= request.getAttribute("msg").toString() %>
<hr/>
<%= "Hello, "+request.getParameter("username") %>
</body>
</html>