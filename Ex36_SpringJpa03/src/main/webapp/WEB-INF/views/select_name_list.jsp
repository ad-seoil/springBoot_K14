<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select Page</title>
</head>
<body>
	<% out.println("Spring JPA #03 - Name Like Paging"); %>
	<br>
		
	총 글의 갯수 : ${totalElements} <br>
	총 페이지 : ${totalPages} <br>
	페이지당 글 갯수  : ${size}  <br>
	페이지번호 : ${pageNumber} <br>
	numberOfElements : ${numberOfElements} <br>
	<hr>
	
	<c:forEach items="${members}" var="member">
		아이디 : ${member.id} <br> 
		이름 : ${member.name} <br>
		이메일 : ${member.email}
	</c:forEach>
	

</body>
</html>