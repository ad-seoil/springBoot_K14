<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>loginForm.jsp</h1>

	<form action="<c:url value="j_spring_security_check" />" method ="post">
		ID : <input type="text" name="j_username"> <br>
		pW : <input type="text" name="j_password"> <br>
		<input type="submit" value="LOGIN">  <br>
	</form>
	
</body>
</html>