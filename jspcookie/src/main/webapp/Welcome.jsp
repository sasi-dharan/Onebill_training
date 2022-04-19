<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="javax.servlet.http.Cookie"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%String s= request.getParameter("username"); %>
	<% Cookie c= new Cookie("username", s);
response.addCookie(c);
%>

	<h1>
		welcome
		<%= s %>
	</h1>

	<form action="./Message" method="post">
		<input type="text" name="text"><br> 
		<input type="submit" value="sent">
	</form>
</body>
</html>