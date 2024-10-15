<%@page import="java.text.SimpleDateFormat"%>
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
	hooking
	<%-- 우리가 만든 test3.jsp 파일은 tomcat서버가 사용할때는 test_jsp클래스파일(서블릭파일) 로 변환됨
		 선언한 함수는 항상 제일 위로올라감(hooking)
		 내장객체 (out, session, application등 )도 미리 선언해줌
	--%>
	
	<%-- 표현식으로 함수를 호출하여 결과 출력 --%>
	<%=helloWorld() %>

	<%-- helloWorld함수선언 --%>
	<%!
		public String helloWorld(){
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss");
			return "Hello World, 현재시간은 : " + sdf.format(now);
		}
	%>
	<%-- 표현식으로 함수를 호출하여 결과 출력 --%>
	<%=helloWorld() %>
</body>
</html>