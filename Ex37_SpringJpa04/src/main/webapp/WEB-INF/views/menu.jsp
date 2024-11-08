<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>메뉴페이지</title>
</head>
<body>
 <%="Spring JPA #03" %>
 <br><p>
 
 <a href="/selectNameLike1?name=test">Name Like 조회 : JPQL 1</a> <br> <p>
 <a href="/selectNameLike2?name=test">Name Like 조회 : JPQL 2</a> <br> <p>
 <a href="/selectNameLike3?name=test&page=2">Name Like 조회 : JPQL 3 - 2페이지</a> <br> <p>
 <a href="/selectNameLike4?name=test">Name Like 조회 : Native SQL</a> <br> <p>
 
 
</body>
</html>