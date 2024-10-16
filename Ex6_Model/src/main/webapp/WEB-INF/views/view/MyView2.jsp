<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 태그라이브러리 EL(Expression Language) -->
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String str = (String)request.getAttribute("ObjectTest");
		out.print(str + "<br>");
	%>
	<%-- ${속성명} --%>
	message : ${ObjectTest}	<br>
	이름 : ${name} <br>
	<hr>
	<c:forEach var ="s" items="${lists}">
		${s} <br>
	</c:forEach>
	<hr>
	
	<%-- 표현언어로 출력 --%>
	<c:forEach var="s2" items="${sets}">
		${s2} <br>
	</c:forEach>
	
	<hr>
	<% 
		List<String> list =(List<String>)request.getAttribute("lists");
	%>
	<%
		for(String s:list)
	%>
	<%--표현식(expression) --%>

	<c:forEach var="s2" items="${sets}" varStatus="stats">
		${stats.count} : ${s2} : index번호${stats.index} : ${stats.first}, ${stats.last} <br>
	</c:forEach>
	
	
	
	
	
	
</body>
</html>