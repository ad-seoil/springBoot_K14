<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input Result</title>
</head>
<body>
	<% out.println("Spring JPA #01 - insert"); %>
	<br>
	
	아이디 : ${member.id}<br>
	이름 : ${member.username} <br>
	날짜 : ${member.createDate}

</body>
</html>