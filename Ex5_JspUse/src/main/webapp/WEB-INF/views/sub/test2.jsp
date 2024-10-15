<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello my test2페이지 <br><br>
	<!-- html파일에서 자바코드 사용하기 -->
	<!-- 스크립틀릿 :html내에서 자바 코드 작성하는 부분 -->
	<% 
		out.print("Hello World (Sub)"); // out변수는 내장객체로 출력용 객체
	%>
	<%-- jsp주석 --%>
	<br>
	<!-- 표현식 -->
	<h3>환영인사<%="Hello World (Sub)"%></h3>
	<br>
	<p>1부터 10까지 더한 결과 : <%=1+2+3+4+5+6+7+8+9+10%></p>
	<br>
	<p>현재시간 : <%=new Date() %></p> <!-- 함수호출결과 -->
	<img src="/image/SpringBoot.png">
</body>
</html>