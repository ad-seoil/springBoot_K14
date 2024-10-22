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

	Count : ${count} <br>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>작성자</td>
			<td>제목</td>
			<td>삭제</td>
		</tr>
		<c:forEach items='${list}' var="dto">
			<tr>
				<td>번호</td>
				<td>작성자</td>
				<td>제목</td>
				<td>삭제</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>