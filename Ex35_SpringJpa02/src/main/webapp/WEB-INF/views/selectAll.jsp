<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select All Page</title>
</head>
<body>
	<% out.println("Spring JPA #02 - Select All"); %>
	<br>
	
	<table border="1">
		<tr>
			<th>순번</th>
			<th>아이디</th>
			<th>이름</th>
			<th>이메일</th>
		</tr>
		<c:forEach items="${members}" var="member" varStatus="st">
			<tr>
				<td>${st.count}</td>
				<td>${member.id}</a></td>
				<td>${member.name}</td>
				<td>${member.email}</td>
			</tr>
		</c:forEach>
		
	</table>
	
</body>
</html>