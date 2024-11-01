<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	welcome:Admin
	
	<hr>
	
	<sec:authorize access="isAuthenticated()">
	<p>Log-In</p>
	</sec:authorize>
	
	<sec:authorize access="!isAuthenticated()">
	<p>Log-Out</p>
	</sec:authorize>
	
	<sec:authentication property="name"/> 님 환영합니다<br>
	<a href="/logout">Log Out</a>	
</body>
</html>