<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>내용보기</h3> <br>
	<hr>
	제목 : ${dto.title} <br>
	내용 : ${dto.content} <br>
	<hr>
	
	<br><p>
	<a href="/update/${dto.id}">수정</a>
	<a href="list">목록보기</a>
	</p>
</body>
</html>