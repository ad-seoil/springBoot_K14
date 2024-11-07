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
	<% out.println("Spring JPA #01 - Select All"); %>
	<br>
	
	<table border="1">
		<tr>
			<th>순번</th>
			<th>아이디</th>
			<th>이름</th>
			<th>날짜</th>
		</tr>
		<c:forEach items="${members}" var="member" varStatus="st">
			<tr>
				<td>${st.count}</td>
				<td><a href="select?id=${member.id}">${member.id}</a></td>
				<td>${member.username}</td>
				<td>${member.createDate}</td>
			</tr>
		</c:forEach>
		
	</table>
	
	
	
	
</body>
</html>