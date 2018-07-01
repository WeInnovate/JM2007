<jsp:useBean id="user" class="com.jm2007.learn.model.User" />
<jsp:setProperty property="*" name="user" />
<%
request.setAttribute("user", user);
request.setAttribute("msg", "Registration processed successfully!");
%>
<jsp:forward page="profile.jsp">
<jsp:param value="This is amazing" name="temp"/>
</jsp:forward>

