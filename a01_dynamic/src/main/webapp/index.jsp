<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% String name = (String) request.getAttribute("message"); 
		if(name != null){
	%>
	<h1><%=name %></h1>
	<% } %>
	
	<form action="login" method="post">
	<input placeholder="UserName" name="user" type="text">
	<input placeholder="Password" name="pass" type="text">
	<button type="submit" >Submit</button> 
	</form>
</body>
</html>