<%@page import="com.demo.SpringMVCSecond.beans.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% List<User> list = (List<User>) request.getAttribute("list"); 
		if(!list.isEmpty()){
			for(User u : list){
				
	%>
		<h1> id = <%=u.getId()%> , userName = <%=u.getName() %> , userAge= <%=u.getAge() %>  </h1>
	
	<% } }%>
</body>
</html>