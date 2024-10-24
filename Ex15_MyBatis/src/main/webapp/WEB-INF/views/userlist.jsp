<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 리스트</title>
</head>
<body>
	<%
		out.println("MyBatis : Hello World");
	%>
	<br>
	
	<%-- 출력형식 1. id명 / 이름,, id는 굵게 
		1. test1 / 홍길동1
	--%>
	<c:forEach var="dto" items='${users}' varStatus="stat">
		${stat.count}. <strong>${dto.id}</strong> / ${dto.name} <br>
	</c:forEach>
	
</body>
</html>